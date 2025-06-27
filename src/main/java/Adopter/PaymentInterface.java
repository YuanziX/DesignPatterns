package Adopter;

public interface PaymentInterface {
    public void completePayment(int id,int amount);
    public PaymentStatus verifyPayment();
}
