package RPG_Game;

import java.util.Random;

public class Enemy {

    public enum Type {
        GOBLIN, ORC, DRAGON
    }

    private String name;
    private int maxHp;
    private int currentHp;
    private int attackPower;
    private int xpReward;
    private Type type;
    private static final Random random = new Random();

    // Private constructor — factory metodlar vasitesile yaradilir
    private Enemy(String name, int maxHp, int attackPower, int xpReward, Type type) {
        this.name = name;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.attackPower = attackPower;
        this.xpReward = xpReward;
        this.type = type;
    }

    // --- Factory metodlar ---
    public static Enemy goblin() {
        return new Enemy("Goblin", 40, 10, 30, Type.GOBLIN);
    }

    public static Enemy orc() {
        return new Enemy("Ork", 80, 18, 60, Type.ORC);
    }

    public static Enemy dragon() {
        return new Enemy("Ejdaha", 200, 35, 150, Type.DRAGON);
    }

    // Dusmenin hucumu - bezen miss ede biler
    public int attack() {
        // 15% ehtimalla miss
        if (random.nextInt(100) < 15) {
            System.out.println("💨 " + name + " hücum etdi amma MISS etdi!");
            return 0;
        }
        // Dragon bezen yanındırıcı hücum edir (1.5x)
        if (type == Type.DRAGON && random.nextBoolean()) {
            int damage = (int)(attackPower * 1.5);
            System.out.println("🐉 " + name + " NƏFƏS hücumu etdi! " + damage + " zərər!");
            return damage;
        }
        System.out.println("👹 " + name + " hücum etdi! " + attackPower + " zərər.");
        return attackPower;
    }

    public void takeDamage(int damage) {
        currentHp -= damage;
        if (currentHp < 0) currentHp = 0;
    }

    public boolean isDead() {
        return currentHp <= 0;
    }

    public String getStatus() {
        return String.format("%-8s | HP: %d/%-3d | Hücum: %d | XP mükafat: %d",
                name, currentHp, maxHp, attackPower, xpReward);
    }

    public String getName()     { return name; }
    public int getCurrentHp()  { return currentHp; }
    public int getMaxHp()      { return maxHp; }
    public int getAttackPower(){ return attackPower; }
    public int getXpReward()   { return xpReward; }
    public Type getType()      { return type; }
}
