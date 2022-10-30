package strategy;

public class Parsian implements PayStrategy{
    @Override
    public boolean pay() {
        System.out.println("parsian pay");
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        System.out.println("parsian pay detail");
    }
}
