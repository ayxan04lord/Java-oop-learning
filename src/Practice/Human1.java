package Practice;

public class Human1 {

    public String name;
    public int age;
    public boolean gender;
    public int height;
    public Hobby[] hobbies;

    public Human1(String name, int age, boolean gender, int height, Hobby[] hobbies) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.hobbies = hobbies;
    }

    public void eat() {
        System.out.println(name + " yemək yeyir.");
    }

    public void sleep() {
        System.out.println(name + " yatır.");
    }

    public void showInfo() {

        System.out.println("Ad: " + name);
        System.out.println("Yaş: " + age);
        System.out.println("Boy: " + height);

        if (gender) {
            System.out.println("Cins: Kişi");
        } else {
            System.out.println("Cins: Qadın");
        }

        System.out.println("Hobbilər:");

        for (Hobby hobby : hobbies) {
            hobby.info();
        }
    }
}