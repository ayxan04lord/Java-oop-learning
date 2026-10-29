package Practice;

public class Phone {

    String brand;
    String model;
    int battery;
    int storage;

    public Phone(String brand, String model, int battery, int storage) {
        this.brand = brand;
        this.model = model;
        this.battery = battery;
        this.storage = storage;
    }

    // Telefon haqqında məlumat
    public void printInfo() {
        System.out.println("Telefonun markasi: " + brand);
        System.out.println("Modeli: " + model);
        System.out.println("Batareya: " + battery + "%");
        System.out.println("Yaddas: " + storage + " GB");
    }

    // Telefondan istifadə
    public void usePhone(int hour) {
        battery -= hour * 15;

        if (battery <= 0) {
            battery = 0;
            System.out.println("Telefon sondu.");
        } else if (battery <= 15) {
            System.out.println("Batareya azdir: " + battery + "%");
        } else {
            System.out.println("Telefondan istifade edildi. Qalan batareya: " + battery + "%");
        }
    }

    // Proqram quraşdırmaq
    public void installApp(int size) {
        if (size <= storage) {
            storage -= size;
            System.out.println("Proqram ugurla qurasdirildi.");
            System.out.println("Qalan yaddas: " + storage + " GB");
        } else {
            System.out.println("Yaddas kifayet etmir.");
        }
    }

    // Telefonu şarj etmək
    public void charge() {
        if (battery < 100) {
            battery = 100;
            System.out.println("Telefon tam dolduruldu.");
        } else {
            System.out.println("Telefon onsuz da tam doludur.");
        }
    }
}