package RPG_Game;

public class Main {

    public static void main(String[] args) {

        System.out.println("╔═════════════════════════════════════════════╗");
        System.out.println("║           ⚔️  RPG DÖYÜŞ SİMULYATORU  ⚔️      ║");
        System.out.println("╚═════════════════════════════════════════════╝");

        // ── SSENARI 1: Warrior vs Goblin ──────────────────────────────
        System.out.println("\n\n════════════ SSENARI 1: Warrior vs Goblin ════════════");
        Warrior warrior = new Warrior("Thorin");
        Enemy goblin = Enemy.goblin();
        BattleSystem.battle(warrior, goblin);

        // ── SSENARI 2: Mage vs Orc ────────────────────────────────────
        System.out.println("\n\n════════════ SSENARI 2: Mage vs Ork ═════════════════");
        Mage mage = new Mage("Gandalf");
        Enemy orc = Enemy.orc();
        BattleSystem.battle(mage, orc);

        // ── SSENARI 3: Warrior Qauntlet (Goblin → Orc → Dragon) ───────
        System.out.println("\n\n════════════ SSENARI 3: Warrior Qauntlet ════════════");
        Warrior questWarrior = new Warrior("Aragorn");
        BattleSystem.battleGauntlet(
                questWarrior,
                Enemy.goblin(),
                Enemy.orc(),
                Enemy.dragon()
        );

        // ── SSENARI 4: Mage vs Dragon (Boss doyusu) ───────────────────
        System.out.println("\n\n════════════ SSENARI 4: Mage vs Ejdaha (Boss) ═══════");
        Mage bossMage = new Mage("Merlin");
        Enemy dragon = Enemy.dragon();
        BattleSystem.battle(bossMage, dragon);

        System.out.println("\n╔═════════════════════════════════════════════╗");
        System.out.println("║              Oyun bitdi. Sağ ol!            ║");
        System.out.println("╚═════════════════════════════════════════════╝");
    }
}
