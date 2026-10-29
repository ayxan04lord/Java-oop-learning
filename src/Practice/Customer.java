package Practice;

public class Customer{
    private final String company = "Azercell";
    private  String name = "Ayxan";
    private int age = 22;

    public Customer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return  this.name;
    }

    public int getAge(){
        return  this.age;
    }
}
