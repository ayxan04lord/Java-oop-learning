package Practice;

public class Player {
    public String playerName;
    public int attackPower;
    public static int bossHealth = 5000;
    public static String bossName = "Vivian Conley";

    public Player(int attackPower, String playerName) {
        this.attackPower = attackPower;
        this.playerName = playerName;
    }

    public String attackBoss(){
        bossHealth = bossHealth - attackPower;
        if (bossHealth<=0){
            System.out.println("TEBRIKLER! Boss meglub edildi!");
        }
        ;
        return playerName + attackPower + " qeder zerbe vurdu ve bossun cani : " + bossHealth + ".";
    }
}
