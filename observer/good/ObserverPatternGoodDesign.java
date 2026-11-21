package observer.good;

import java.util.ArrayList;
import java.util.List;

interface OrderObserver{
    void update();
}

class EmailObserver implements OrderObserver{

    @Override
    public void update() {
        System.out.println("Sending Email");
    }
}


class SMSObserver implements OrderObserver{

    @Override
    public void update() {
        System.out.println("Sending SMS");
    }
}

class WhatsappObserver implements OrderObserver{

    @Override
    public void update() {
        System.out.println("Sending Whatsapp message");
    }
}


class OrderService{
    List<OrderObserver> observers=new ArrayList<>();

    public void addObserver(OrderObserver observer){
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer){
        observers.remove(observer);
    }

    void placeOrder(){

        System.out.println("Order placed successfully");

        for(OrderObserver it: observers){
            it.update();
        }
    }
}

public class ObserverPatternGoodDesign {
    public static void main(String[] args){
        OrderService orderService=new OrderService();

        EmailObserver emailObserver=new EmailObserver();
        SMSObserver smsObserver=new SMSObserver();
        WhatsappObserver whatsappObserver=new WhatsappObserver();

        orderService.addObserver(emailObserver);
        orderService.addObserver(smsObserver);
        orderService.addObserver(whatsappObserver);

        orderService.removeObserver(smsObserver);

        orderService.placeOrder();
    }
}
