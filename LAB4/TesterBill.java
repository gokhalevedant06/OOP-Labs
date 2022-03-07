package LAB4;

import java.util.Scanner;

class Bill{
    private static int counter;
    private String billId;
    private String paymentMode;

    static{
        counter = 9000;
    }
    public Bill(String paymentMode){
        setPaymentMode(paymentMode);
        setBillId("B"+ ++counter);
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public static int getCounter() {
        return counter;
    }
    public void output(){
        System.out.println("Bill Details");
        System.out.println("Bill Id: "+getBillId());
        System.out.println("Payment Method: "+getPaymentMode());

    }
}

public class TesterBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter payment mode for object 1: ");
        String paymentMode = input.next();
        Bill obj1 = new Bill(paymentMode);
        System.out.print("Enter payment mode for object 2: ");
        paymentMode = input.next();
        Bill obj2 = new Bill(paymentMode);
        obj1.output();
        obj2.output();
    }
}
