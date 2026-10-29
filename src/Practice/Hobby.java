package Practice;

public class Hobby {

    public String name;
    public int hour;

    public Hobby(String name, int hour) {
        this.name = name;
        this.hour = hour;
    }

    public void info() {
        System.out.println("Hobbi: " + name + " | Saat: " + hour);
    }
}