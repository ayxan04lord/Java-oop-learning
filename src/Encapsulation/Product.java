package Encapsulation;

public class Product {

    private String name;
    private double price;
    private int discountPercentage;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Цена не может быть отрицательной.");
            return;
        }
        this.price = price;
    }


    public void setDiscountPercentage(int discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            System.out.println("Скидка должна быть в диапазоне от 0 до 100.");
            return;
        }
        this.discountPercentage = discountPercentage;
    }


    public double getFinalPrice() {
        return price - (price * discountPercentage / 100.0);
    }
}