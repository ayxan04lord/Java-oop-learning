package RPG_Game;

public abstract class Hero {

    protected String name;
    protected int maxHp;
    protected int currentHp;
    protected int attackPower;
    protected int level;
    protected int xp;

    public Hero(String name, int maxHp, int attackPower) {
        this.name = name;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.attackPower = attackPower;
        this.level = 1;
        this.xp = 0;
    }

    // Her subclass oz xususi hucumunu ozellikle implement edir
    public abstract int attack();

    // Zererverme - her subclass onu override ede biler (meselen: Warrior broneyle)
    public void takeDamage(int damage) {
        currentHp -= damage;
        if (currentHp < 0) currentHp = 0;
    }

    public void heal(int amount) {
        currentHp += amount;
        if (currentHp > maxHp) currentHp = maxHp;
        System.out.println("💚 " + name + " " + amount + " HP bərpa etdi. Cari HP: " + currentHp + "/" + maxHp);
    }

    public void gainXp(int amount) {
        xp += amount;
        System.out.println("⭐ " + name + " " + amount + " XP qazandı. Cəmi XP: " + xp);
        if (xp >= 100) {
            levelUp();
        }
    }

    private void levelUp() {
        level++;
        xp = 0;
        maxHp += 20;
        attackPower += 5;
        currentHp = maxHp;
        System.out.println("🎉 " + name + " LEVEL UP! Yeni səviyyə: " + level +
                " | Max HP: " + maxHp + " | Hücum: " + attackPower);
    }

    public boolean isDead() {
        return currentHp <= 0;
    }

    public String getStatus() {
        return String.format("%-10s | Səviyyə: %d | HP: %d/%-3d | Hücum: %d",
                name, level, currentHp, maxHp, attackPower);
    }

    public String getName()      { return name; }
    public int getCurrentHp()    { return currentHp; }
    public int getMaxHp()        { return maxHp; }
    public int getAttackPower()  { return attackPower; }
    public int getLevel()        { return level; }
}
