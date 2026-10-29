package Practice;

public class Student {

//    String name;
//    int average;
//    int attendance;
//
//    public Practice.Student(String name, int average, int attendance) {
//        this.name = name;
//        this.average = average;
//        this.attendance = attendance;
//    }
//
//    public void PrintInfo(){
//        System.out.println("Adim : " + name + ". Ortalamam : " + average + ". Davamiyyetim : " + attendance);
//    }
//
//    public void isPassed(){
//        if (average >= 51){
//            System.out.println("Imtahandan kecib");
//        } else{
//            System.out.println("Kesilib");
//        }
//    }
//
//    public void canTakeExam(){
//        if (attendance >= 75){
//            System.out.println("Imtahana buraxilir");
//        }else{
//            System.out.println("Imtahana buraxilmir");
//        }
//    }


    public String name;
    public static int totalStudents = 0;

    public Student(String name) {
        this.name = name;
        totalStudents++;
        System.out.println(name + " qeydiyyatdan kecdi.");
    }


}
