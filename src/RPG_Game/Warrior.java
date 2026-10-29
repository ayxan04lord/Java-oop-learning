package RPG_Game;

import java.util.Random;

public class Warrior extends Hero {

    private int armor;        // Zirehin guclu oldugunda zeifletir
    private int rage;         // 0-100, dolduqca critical hit sansi artir
    private static final int MAX_RAGE = 100;
    private static final Random random = new Random();

    public Warrior(String name) {
        super(name, 150, 25);  // Warrior: cox HP, yuksek hucum
        this.armor = 15;
        this.rage = 0;
    }

    @Override
    public int attack() {
        int damage = attackPower;

        // Hər hücumda rage artır
        rage = Math.min(rage + 10, MAX_RAGE);

        // Rage 100 olduqda critical hit (2x zərər)
        if (rage >= MAX_RAGE) {
            damage *= 2;
            rage = 0;
            System.out.println("⚔️  " + name + " CRITICAL STRIKE! " + damage + " zərər vurdu! (Rage sıfırlandı)");
        } else {
            System.out.println("⚔️  " + name + " qılıncla hücum etdi! " + damage + " zərər | Rage: " + rage + "/" + MAX_RAGE);
        }

        return damage;
    }

    // Warrior bronesi ile bir hisseyi udur
    @Override
    public void takeDamage(int damage) {
        int reducedDamage = Math.max(0, damage - armor);
        currentHp -= reducedDamage;
        if (currentHp < 0) currentHp = 0;
        System.out.println("🛡️  " + name + " zirehi " + armor + " zərəri uddu. " +
                reducedDamage + " zərər aldı. HP: " + currentHp + "/" + maxHp);
    }

    // Xususi qabiliyyet: butun hiddeti bosh ver ve guclu vuruş et
    public int rageBurst() {
        if (rage < 50) {
            System.out.println("😤 " + name + " yetərli rage yoxdur! (Lazım: 50, Var: " + rage + ")");
            return 0;
        }
        int damage = attackPower * 3;
        rage = 0;
        System.out.println("💢 " + name + " RAGE BURST! " + damage + " masiv zərər! Rage sıfırlandı.");
        return damage;
    }

    @Override
    public String getStatus() {
        return super.getStatus() + String.format(" | Zireh: %d | Rage: %d/%d", armor, rage, MAX_RAGE);
    }

    public int getArmor() { return armor; }
    public int getRage()  { return rage; }
}
