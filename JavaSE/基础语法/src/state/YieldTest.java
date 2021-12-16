package state;

//测试礼让线程，不一定成功，看CPU心情
public class YieldTest {

    public static void main(String[] args) {
        MyYield myYield = new MyYield();
        new Thread(myYield, "a").start();
        new Thread(myYield, "b").start();
    }
}


class MyYield implements Runnable {

    private boolean flag = true;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程开始了");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + "线程停止了");
    }

    public void stop() {
        this.flag = false;
    }
}