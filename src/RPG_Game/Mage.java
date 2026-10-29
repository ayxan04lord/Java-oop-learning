package RPG_Game;

public class Mage extends Hero {

    private int mana;
    private int maxMana;
    private static final int FIREBALL_COST   = 30;
    private static final int ICEBOLT_COST    = 20;
    private static final int HEAL_SPELL_COST = 25;

    public Mage(String name) {
        super(name, 90, 15);  // Mage: az HP, sehirli hucumlar
        this.maxMana = 100;
        this.mana = 100;
    }

    @Override
    public int attack() {
        // Mananin yeterli oldugu halda icebolt, yoxdursa adi hucum
        if (mana >= ICEBOLT_COST) {
            return iceBolt();
        } else {
            int damage = attackPower / 2;
            System.out.println("🪄 " + name + " manasız sehrli dəyənəklə vurdu! " + damage + " zərər.");
            return damage;
        }
    }

    // Güclü alov topu — cox mana xerce edir
    public int fireball() {
        if (mana < FIREBALL_COST) {
            System.out.println("🔥 " + name + " Fireball üçün mana yoxdur! (" + mana + "/" + FIREBALL_COST + ")");
            return 0;
        }
        mana -= FIREBALL_COST;
        int damage = attackPower * 3;
        System.out.println("🔥 " + name + " FIREBALL! " + damage + " od zərəri! Mana: " + mana + "/" + maxMana);
        return damage;
    }

    // Sureti yavashladici buz zerbesi
    public int iceBolt() {
        if (mana < ICEBOLT_COST) {
            System.out.println("❄️  " + name + " Ice Bolt üçün mana yoxdur! (" + mana + "/" + ICEBOLT_COST + ")");
            return 0;
        }
        mana -= ICEBOLT_COST;
        int damage = attackPower * 2;
        System.out.println("❄️  " + name + " ICE BOLT! " + damage + " buz zərəri! Mana: " + mana + "/" + maxMana);
        return damage;
    }

    // Sehirli shifaverme
    public void healSpell() {
        if (mana < HEAL_SPELL_COST) {
            System.out.println("💙 " + name + " Heal üçün mana yoxdur! (" + mana + "/" + HEAL_SPELL_COST + ")");
            return;
        }
        mana -= HEAL_SPELL_COST;
        int healAmount = 40;
        heal(healAmount);
        System.out.println("💙 Mana: " + mana + "/" + maxMana);
    }

    // Her dovr mana berpasi (BattleSystem çağırır)
    public void regenerateMana(int amount) {
        mana = Math.min(mana + amount, maxMana);
    }

    @Override
    public String getStatus() {
        return super.getStatus() + String.format(" | Mana: %d/%d", mana, maxMana);
    }

    public int getMana()    { return mana; }
    public int getMaxMana() { return maxMana; }
}
