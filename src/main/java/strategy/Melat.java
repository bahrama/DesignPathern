package strategy;

public class Melat implements PayStrategy{
    @Override
    public boolean pay() {
        System.out.println("melat pay");
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        System.out.println("melat pay detail");
    }
}
