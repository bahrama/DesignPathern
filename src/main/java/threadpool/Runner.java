package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {

    public static void main(String[] args) {


        /*new Thread(() -> doSomething(1)).start();
        new Thread(() -> doSomething(2)).start();
        new Thread(() -> doSomething(3)).start();
        new Thread(() -> doSomething(4)).start();
        new Thread(() -> doSomething(5)).start();*/


        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(() -> doSomething(1));
        executorService.submit(() -> doSomething(2));
        executorService.submit(() -> doSomething(3));
        executorService.submit(() -> doSomething(4));
        executorService.submit(() -> doSomething(5));
        executorService.submit(() -> doSomething(6));
        executorService.submit(() -> doSomething(7));
        executorService.submit(() -> doSomething(8));
        executorService.submit(() -> doSomething(9));

    }

    private static void doSomething(int x) {
        for (int i = 0; i < 15; i++) {
            System.out.println("hi-" + x);
        }
    }
}

