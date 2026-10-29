package Practice;

public class CinemaTicket {
    String movieName;
    int hallNumber;
    int seatCount;
    int ticketPrice;
    int count = 0;

    public CinemaTicket(int hallNumber, String movieName, int seatCount, int ticketPrice, int count) {
        this.hallNumber = hallNumber;
        this.movieName = movieName;
        this.seatCount = seatCount;
        this.ticketPrice = ticketPrice;
        this.count = count;
    }

    public void buyTicket(){
        if (seatCount <= 5){
            count++;
            System.out.println(count);
        } else if (count == seatCount) {
            seatCount--;

        }

    }
}
