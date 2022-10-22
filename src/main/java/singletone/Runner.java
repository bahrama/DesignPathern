package singletone;

public class Runner {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(runnable);
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }

   static Runnable runnable = new Runnable() {
       @Override
       public void run() {
           Singleton singleton = Singleton.getInstance("FOO");
           System.out.println(singleton.value);
       }
   };
}

