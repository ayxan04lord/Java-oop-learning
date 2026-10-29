package Practice;

public class Main {

    public static void main(String[] args) {


//        System.out.println(Practice.Human.DEFAULT_LANG);
//        Practice.Human h = new Practice.Human() {
//            @Override
//            public void sayHi() {
//
//            }
//        }


//        Practice.Student s1 = new Practice.Student("Omer");
//        Practice.Student s2 = new Practice.Student("Ayxan");
//        Practice.Student s3 = new Practice.Student("Adil");
//        System.out.println(Practice.Student.totalStudents);

//        System.out.println(Practice.Calculator.add(1,2));
//        System.out.println(Practice.Calculator.divide(1,0));
//
//        Practice.Player p1 = new Practice.Player(300, "Filankes");
//        Practice.Player p2 = new Practice.Player(300, "Xalxin Usagi");
//        Practice.Player p3 = new Practice.Player(300, "Papanin Gul Balasi");
//        System.out.println(p1.attackBoss());
//        System.out.println(p2.attackBoss());

        SecureBankCard card = new SecureBankCard(
                "Ayxan",
                1000,
                "1234"
        );

        System.out.println(card.withdraw(100, "1111"));
        System.out.println(card.withdraw(100, "2222"));
        System.out.println(card.withdraw(100, "3333"));

        // Hesab bloklandığı üçün işləməyəcək
        System.out.println(card.withdraw(100, "1234"));




    }
}