package strategy.good;

interface PaymentStrategy{
    void processPayment();
}

class UPI implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Processing UPI payment");
    }
}

class CreditCard implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Processing Credit card payment");
    }
}

class Netbanking implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Processing Netbanking payment");
    }
}

class PaymentService{
    private PaymentStrategy paymentStrategy;
    public PaymentService(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    public void makePayment(){
        paymentStrategy.processPayment();
    }
}

public class StrategyPatternGoodDesign {
    public static void main(String[] args){
        PaymentStrategy strategy=new CreditCard();
        PaymentService paymentService=new PaymentService(strategy);
        paymentService.makePayment();
    }
}
