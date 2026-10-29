package Practice;

public class Car {

    public String brand;
    public String model;
    public int year;
    public int speed;

    public Car(String brand, String model, int year, int speed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public void start(){
        System.out.println(brand + " ise dusdu");
    }

    public void stop(){
        System.out.println(brand + " sonduruldu");
    }

    public  void showInfo(){
        System.out.println("Masinimin brendi : " + brand + ", modeli : "  + model + ", ili : " + year + ", sureti : " + speed);
    }


}
