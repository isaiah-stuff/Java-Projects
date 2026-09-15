// PaymentID.java
// Isaiah Stuffle

public class CreditCard extends Payment {
    public String cardProvider;
    public String cardNumber;

    // Constructor
    CreditCard(double amount, String cardProvider, String cardNumber) {
        super(amount);
        this.cardProvider = cardProvider;
        this.cardNumber = cardNumber;
    }

    // String method
    public String toString() {
        return super.toString() +
                "Card Provider: " + cardProvider + "\n" +
                "Card Number: " + cardNumber + "\n";
    }
}
