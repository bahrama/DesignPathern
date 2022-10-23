package factory;

public class Laptop implements Computer {


    @Override
    public void process() {
        System.out.println("man kara ro ra mindazam ama ziad be fekre game nabash");
    }

    @Override
    public void hot() {
        System.out.println("aziat koni dagh mikonam");
    }
}
