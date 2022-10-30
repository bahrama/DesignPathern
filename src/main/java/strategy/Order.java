package strategy;

public class Order {
    public Order(PayStrategy payStrategy){
        payStrategy.pay();
        payStrategy.collectPaymentDetails();
    }
}
