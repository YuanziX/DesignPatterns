package Adopter;

public class RazorPayUPI {
    private int id;
    private int amount;
    private String description;

    public void makePayment(int id,int amount,String description) {
        System.out.println("Succesfully completed the payment");
    }
    public RazorPayPaymentStatus verifyPayment(int id){
        if(id>0){
            return RazorPayPaymentStatus.Success;
        }
        return RazorPayPaymentStatus.Fail;
    }
}
