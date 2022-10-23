package factory;

public class Server implements Computer {
    @Override
    public void process() {
        System.out.println("anjame karaye kheili kheili khafan");
    }

    @Override
    public void hot() {
        System.out.println("ehtiaj be cooler gazi darim");
    }
}
