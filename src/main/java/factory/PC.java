package factory;

public class PC implements Computer {
    @Override
    public void process() {
        System.out.println("mitoonam game run konam vali faghat ye user biad jolom");
    }

    @Override
    public void hot() {
        System.out.println("man amperam hamash jaye khoobi vaysade");
    }
}
