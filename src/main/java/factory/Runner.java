package factory;

public class Runner {
    public static void main(String[] args) {

        Computer computer = computerFactory(ProcessingNeed.SANGIN);
        computer.process();

    }

    private static Computer computerFactory(ProcessingNeed need) {
        if (need == ProcessingNeed.SANGIN) {
            return new Server();
        }

        if (need == ProcessingNeed.BAZI) {
            return new PC();
        }

        return new Laptop();
    }
}
