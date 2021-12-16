package lockTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolTest {
    public static void main(String[] args) {
        ExecutorService service;
        service = Executors.newFixedThreadPool(10);

        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());


        service.shutdown();
    }
}


class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

    }
}