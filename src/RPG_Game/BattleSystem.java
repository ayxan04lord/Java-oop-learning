package RPG_Game;

public class BattleSystem {

    private static final String DIVIDER = "─────────────────────────────────────────────";

    // Bir hero vs bir enemy doyusu
    public static void battle(Hero hero, Enemy enemy) {
        System.out.println("\n" + DIVIDER);
        System.out.println("⚔️  DÖYÜŞ BAŞLADI: " + hero.getName() + " vs " + enemy.getName());
        System.out.println(DIVIDER);
        printStatus(hero, enemy);

        int round = 1;

        while (!hero.isDead() && !enemy.isDead()) {
            System.out.println("\n--- TUR " + round + " ---");

            // Hero hucum edir
            heroTurn(hero, enemy);
            if (enemy.isDead()) break;

            // Enemy hucum edir
            int enemyDamage = enemy.attack();
            hero.takeDamage(enemyDamage);

            // Mage her turda 10 mana berpа edir
            if (hero instanceof Mage mage) {
                mage.regenerateMana(10);
            }

            round++;
            System.out.println();
            printStatus(hero, enemy);
        }

        System.out.println("\n" + DIVIDER);
        printResult(hero, enemy);
        System.out.println(DIVIDER);
    }

    // Hero tipine gore en optimal hucum secimi
    private static void heroTurn(Hero hero, Enemy enemy) {
        int damage;

        if (hero instanceof Warrior warrior) {
            // Rage 50+ olduqda rageBurst, yoxsa normal hucum
            if (warrior.getRage() >= 50) {
                damage = warrior.rageBurst();
            } else {
                damage = warrior.attack();
            }
        } else if (hero instanceof Mage mage) {
            // Mana yeterliyine gore spell secimi
            if (mage.getMana() >= 30 && enemy.getCurrentHp() > 50) {
                damage = mage.fireball();
            } else if (mage.getCurrentHp() < mage.getMaxHp() / 2 && mage.getMana() >= 25) {
                // HP azaldiqda ozunu shifalasin
                mage.healSpell();
                damage = 0;
            } else {
                damage = mage.attack();
            }
        } else {
            damage = hero.attack();
        }

        if (damage > 0) {
            enemy.takeDamage(damage);
        }
    }

    // Bir hero ardıcıl olaraq bir nece dushmenle dorusur
    public static void battleGauntlet(Hero hero, Enemy... enemies) {
        System.out.println("\n" + DIVIDER);
        System.out.println("🏟️  QAUNTLET BAŞLADI: " + hero.getName() + " — " + enemies.length + " düşmən");
        System.out.println(DIVIDER);

        int defeated = 0;
        for (Enemy enemy : enemies) {
            if (hero.isDead()) break;
            battle(hero, enemy);
            if (!enemy.isDead()) break;  // hero olduse durdur

            defeated++;
            // Doyusler arasi kiçik bərpa
            if (!hero.isDead() && defeated < enemies.length) {
                System.out.println("\n🌿 " + hero.getName() + " növbəti döyüşdən əvvəl istirahət edir...");
                hero.heal(20);
            }
        }

        System.out.println("\n" + DIVIDER);
        if (hero.isDead()) {
            System.out.println("💀 " + hero.getName() + " qauntleti tamamlaya bilmədi. Məğlub oldu.");
        } else {
            System.out.println("🏆 " + hero.getName() + " bütün " + defeated + " düşməni məğlub etdi!");
        }
        System.out.println(DIVIDER);
    }

    private static void printStatus(Hero hero, Enemy enemy) {
        System.out.println("  🧙 " + hero.getStatus());
        System.out.println("  👹 " + enemy.getStatus());
    }

    private static void printResult(Hero hero, Enemy enemy) {
        if (hero.isDead()) {
            System.out.println("💀 " + hero.getName() + " məğlub oldu...");
        } else {
            System.out.println("🏆 " + hero.getName() + " qələbə qazandı!");
            hero.gainXp(enemy.getXpReward());
        }
    }
}
