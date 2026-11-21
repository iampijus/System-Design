package adapter.bad;

interface NotificationService {
    void sendMessage(String message);
}

class ThirdPartyNotification {

    public void sendNotification(String message) {
        System.out.println("Notification sent: " + message);
    }
}

class OrderService {

    private ThirdPartyNotification notification =
            new ThirdPartyNotification();

    public void placeOrder() {
        notification.sendNotification("Order placed!");
    }
}

public class AdapterPatternBadDesign {
}
