public class FoodDeliveryApp {
    public static void main(String[] args) {
        Thread orderProcessing = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " | Priority: " + Thread.currentThread().getPriority() + " | Processing orders...");
        }, "OrderProcessing");

        Thread deliveryTracking = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " | Priority: " + Thread.currentThread().getPriority() + " | Tracking deliveries...");
        }, "DeliveryTracking");

        Thread notification = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " | Priority: " + Thread.currentThread().getPriority() + " | Sending notifications...");
        }, "Notification");

        orderProcessing.setPriority(8);
        deliveryTracking.setPriority(6);
        notification.setPriority(4);

        orderProcessing.start();
        deliveryTracking.start();
        notification.start();
    }
}
