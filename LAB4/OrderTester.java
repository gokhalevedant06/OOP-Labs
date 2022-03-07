package LAB4;

class Order{
    private static int orderIdCounter;
    private int orderId;
    private int[] orderedFoods;
    private double totalPrice;
    private String status;

    static{
        orderIdCounter = 0;
    }
    public Order(int[] orderedFoods){
        setOrderedFoods(orderedFoods);
        setOrderId(100+ ++orderIdCounter);
    }
    public static int getTotalNoOfOrders(){
        return orderIdCounter;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int[] getOrderedFoods() {
        return orderedFoods;
    }

    public void setOrderedFoods(int[] orderedFoods) {
        this.orderedFoods = orderedFoods;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public double calculateTotalPrice(String paymentMode){
       return 0;
    }
}

public class OrderTester {

}
