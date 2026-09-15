// PaymentDate.java
// Isaiah Stuffle

public class DigitalPay extends Payment {
    public String financialInstitution;
    public String pointOfPayment;

    // Constructor
    DigitalPay(double amount, String financialInstitution, String pointOfPayment) {
        super(amount);
        this.financialInstitution = financialInstitution;
        this.pointOfPayment = pointOfPayment;
    }

    // String method
    public String toString() {
        return super.toString() +
                "Financial Institution: " + financialInstitution + "\n" +
                "Point of Sale: " + pointOfPayment + "\n";
    }
}
