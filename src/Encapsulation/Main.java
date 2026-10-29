package Encapsulation;

public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero("Arthur");

        System.out.println("Hero: " + hero.getName());
        System.out.println("Level: " + hero.getLevel());
        System.out.println("XP: " + hero.getXp());
        System.out.println("HP: " + hero.getCurrentHp() + "/" + hero.getMaxHp());


        hero.takeDamage(30);
        System.out.println("\n30 damage aldı.");
        System.out.println("HP: " + hero.getCurrentHp() + "/" + hero.getMaxHp());


        hero.heal(20);
        System.out.println("\n20 HP bərpa olundu.");
        System.out.println("HP: " + hero.getCurrentHp() + "/" + hero.getMaxHp());


        System.out.println("\n" + hero.gainXp(50));
        System.out.println("Level: " + hero.getLevel());
        System.out.println("XP: " + hero.getXp());


        System.out.println("\n" + hero.gainXp(60));
        System.out.println("Level: " + hero.getLevel());
        System.out.println("XP: " + hero.getXp());
        System.out.println("HP: " + hero.getCurrentHp() + "/" + hero.getMaxHp());
    }
}