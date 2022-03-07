package LAB10;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter booking Id: ");
        int bookingId = input.nextInt();
        System.out.print("Enter Destination: ");
        String destination = input.next();
        System.out.print("Enter trip package: ");
        String tripPackage = input.next();
        BusBooking b1 = new BusBooking(bookingId,destination,tripPackage);
        System.out.print("Enter coupon code: ");
        String couponCode = input.next();
        System.out.print("Enter number of members: ");
        int members = input.nextInt();
        System.out.println(b1.bookTrip(couponCode,members));
        if (b1.bookTrip(couponCode,members).equals("Booking Successful")) System.out.println("Total amount for the trip: "+b1.getTotalAmount());
    }
}
