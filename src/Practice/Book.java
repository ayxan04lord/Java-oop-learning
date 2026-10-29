package Practice;

public class Book {

    public String title;
    public String author;
    public int price;
    public int pageCount;

    public Book(String title, String author, int pageCount, int price) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Kitabin adi " + title + ", avtoru " + author + ", kitabda " + pageCount + " sehife var. Qiymet : " + price );
    }

    public void isExpencive(){
        if (price >= 50){
            System.out.println("Bahali kitabdir");
        } else{
            System.out.println("Normal qiymetlidir");
        }
    }

    public void hasManyPages(){
        if(pageCount > 300){
            System.out.println("Bu kitab qalindir");
        } else{
            System.out.println("Bu kitab nazikdir");
        }
    }
}
