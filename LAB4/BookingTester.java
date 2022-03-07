package LAB4;

class Booking{
    private String customerEmail;
    private int seatsRequired;
    private boolean isBooked;
    private static int seatsAvailable;

    static{
        seatsAvailable = 400;
    }
    public Booking(String customerEmail,int seatsRequired){
        setCustomerEmail(customerEmail);
        setSeatsRequired(seatsRequired);

        if (getSeatsRequired()<=seatsAvailable) {
            setBooked(true);
            setSeatsAvailable(getSeatsAvailable()-getSeatsRequired());
        }else{
            setBooked(false);
        }
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getSeatsRequired() {
        return seatsRequired;
    }

    public void setSeatsRequired(int seatsRequired) {
        this.seatsRequired = seatsRequired;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public static int getSeatsAvailable() {
        return seatsAvailable;
    }

    public static void setSeatsAvailable(int seatsAvailable) {
        Booking.seatsAvailable = seatsAvailable;
    }
    public void details(){
        if (isBooked()){
            System.out.println(getSeatsRequired()+" seats successfully booked for "+getCustomerEmail());
        }else{
            System.out.println("Sorry "+getCustomerEmail()+", required number of seats are not available!");
            System.out.println("Seats available: "+getSeatsAvailable());
        }

    }
}

public class BookingTester {
    public static void main(String[] args) {
        Booking obj1 = new Booking("jack@email.com",100);
        Booking obj2 = new Booking("jill@email.com",350);
        obj1.details();
        obj2.details();
    }

}
