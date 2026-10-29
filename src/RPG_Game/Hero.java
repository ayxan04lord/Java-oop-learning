package RPG_Game;

public class Hero {
    String name;
    int health;
    int baseAttackPower;

    public Hero(String name, int health, int baseAttackPower) {
        this.name = name;
        this.health = health;
        this.baseAttackPower = baseAttackPower;
    }

    public void attack(){
        System.out.println(name + " hucum edir ve " + health + " xesaret vurur.");
    }

}
