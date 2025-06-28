package Adopter;

public class PhonePay {
    private int id;
    private int amount;
    private String name;
    public void completePayment(int amount, String name, int id) {
        System.out.println("PhonePay payment completed");
    }
    public PhonePayPaymentStatus validatePayment(){
        return PhonePayPaymentStatus.FAILED;
    }
}
