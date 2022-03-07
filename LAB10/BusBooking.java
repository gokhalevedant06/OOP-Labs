package LAB10;

public class BusBooking {
    private int bookingId;
    private String destination;
    private String tripPackage;
    private double totalAmount;

    public BusBooking(int bookingId, String destination, String tripPackage) {
        setBookingId(bookingId);
        setDestination(destination);
        setTripPackage(tripPackage);
        this.totalAmount = 0;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTripPackage() {
        return tripPackage;
    }

    public void setTripPackage(String tripPackage) {
        this.tripPackage = tripPackage;
    }

    public String bookTrip(String couponCode, int numberOfMembers) {
        try {
            if (!(getDestination().equals("Washington DC") || getDestination().equals("Philadelphia") || getDestination().equals("Orlando") || getDestination().equals("Boston") || getDestination().equals("Atlanta")))
                throw new InvalidDestinationException("Invalid Destination");
            if (!(getTripPackage().equals("Regular") || getTripPackage().equals("Premium")))
                throw new InvalidTripPackageException("Invalid Package");
            if (validateCouponCode(couponCode, numberOfMembers)) {
                double amount=0;
                if (getTripPackage().equals("Regular")) {
                    amount = 500*numberOfMembers;
                    setTotalAmount(amount);
                    return "Booking Successful";
                }
                else if(getTripPackage().equals("Premium")) {
                    amount = 800*numberOfMembers;
                    setTotalAmount(amount);
                    return "Booking Successful";
                }
            }

        } catch (InvalidDestinationException e) {
            System.out.println(e);
        } catch (InvalidTripPackageException e) {
            System.out.println(e);
        }
        return "Your booking was not successful, please try again!";
    }

        public boolean validateCouponCode (String couponCode,int numberOfMembers){
        try{
            if (couponCode.equals("BIGBUS") && numberOfMembers >= 10) return true;
            else if (couponCode.equals("MAGICBUS") && numberOfMembers >= 15) return true;
            else {
                throw new InvalidCouponCodeException("Invalid coupon code");
            }
        }catch (InvalidCouponCodeException e){
            System.out.println(e);
            return false;
        }
        }
    }
