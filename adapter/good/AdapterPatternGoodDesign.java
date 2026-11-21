package adapter.good;

interface NotificationService{
    public void sendMessage();
}

class ThirdPartyNotificationProvider{
    public void sendNotification(){
        System.out.println("Third party notification provider");
    }
}

class NotificationAdapter implements NotificationService{
    private ThirdPartyNotificationProvider thirdPartyNotificationProvider;

    public NotificationAdapter(ThirdPartyNotificationProvider thirdPartyNotificationProvider){
        this.thirdPartyNotificationProvider=thirdPartyNotificationProvider;
    }

    @Override
    public void sendMessage() {
        thirdPartyNotificationProvider.sendNotification();
    }
}


class OrderService{

    NotificationService notificationService=new NotificationAdapter(new ThirdPartyNotificationProvider());
    void placeOrder(){
        System.out.println("Order placed successfully");
        notificationService.sendMessage();
    }
}

public class AdapterPatternGoodDesign {
    public static void main(String[] args){
        OrderService orderService=new OrderService();
        orderService.placeOrder();
    }
}
