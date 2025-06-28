package Adopter;

public class PhonePayAdopter implements PaymentInterface{
     PhonePay phonepay=new PhonePay();
    @Override
    public void completePayment(int id, int amount) {
        phonepay.completePayment(amount,"varun",23);
    }

    @Override
    public PaymentStatus verifyPayment() {
        PhonePayPaymentStatus status=phonepay.validatePayment();
        return validateStatus(status);
    }

    private PaymentStatus validateStatus(PhonePayPaymentStatus status) {
        if(status.equals(PhonePayPaymentStatus.FAILED)){
            return PaymentStatus.Fail;
        }
        return PaymentStatus.Success;
    }
}
