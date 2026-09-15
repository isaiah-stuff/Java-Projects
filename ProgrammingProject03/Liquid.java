// PaymentStatus.java
// Isaiah Stuffle

public class Liquid extends Payment {
    public String pointOfSale;
    public String paymentType;

    // Constructor
    Liquid(double amount, String pointOfSale, String paymentType) {
        super(amount);
        this.pointOfSale = pointOfSale;
        this.paymentType = paymentType;
    }

    // String method
    public String toString() {
        return super.toString() +
                "Point of Sale: " + pointOfSale + "\n" +
                "Payment Type: " + paymentType + "\n";

    }
}
