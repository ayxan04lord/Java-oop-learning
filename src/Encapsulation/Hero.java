package Encapsulation;

public class Hero {
    private String name;
    private int level;
    private int xp;
    private int maxHp;
    private int currentHp;

    public Hero(String name) {
        this.name = name;
        level = 1;
        xp = 0;
        maxHp = 100;
        currentHp = 100;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void takeDamage(int damage) {
        currentHp -= damage;

        if (currentHp < 0) {
            currentHp = 0;
        }
    }

    public void heal(int amount) {
        currentHp += amount;

        if (currentHp > maxHp) {
            currentHp = maxHp;
        }
    }

    public String gainXp(int amount) {
        xp += amount;

        if (xp >= 100) {
            level++;
            xp = 0;
            maxHp += 20;
            currentHp = maxHp;

            return "Hero level up!";
        } else {
            return "XP added. Current XP: " + xp;
        }
    }
}
