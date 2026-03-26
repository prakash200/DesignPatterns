package Structural.Facade.ApiGateWay;

import Structural.Facade.ApiGateWay.Services.*;


public class ApiGateWay {

    private final UserService userService;
    private final OrderService orderService;
    private final PaymentService paymentService;
    private final NotificationService notificationService;
    private final DeliveryService deliveryService;

    public ApiGateWay(){
        userService = new UserService();
        orderService = new OrderService();
        paymentService = new PaymentService();
        notificationService = new NotificationService();
        deliveryService = new DeliveryService();

    }

    public void placeOrder(){
        System.out.println(userService.getUser());
        System.out.println(orderService.createOrder());
        System.out.println(paymentService.makePayment());
        System.out.println(notificationService.sendNotification());
        System.out.println(deliveryService.orderStatus());
    }

}
