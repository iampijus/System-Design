package adapter.good;

interface PaymentService {
    void pay(double amount);
}

class ThirdPartyPayment {

    public void makePayment(double amount) {
        System.out.println("Payment: " + amount);
    }
}

class PaymentAdapter implements PaymentService{
    private ThirdPartyPayment thirdPartyPayment;
    public PaymentAdapter(ThirdPartyPayment thirdPartyPayment){
        this.thirdPartyPayment=thirdPartyPayment;
    }

    @Override
    public void pay(double amount) {
        thirdPartyPayment.makePayment(amount);
    }
}

public class PaymentServiceGoodDesign {
    public static void main(String[] args){
        PaymentService paymentService=new PaymentAdapter(new ThirdPartyPayment());
        paymentService.pay(1000);
    }
}
