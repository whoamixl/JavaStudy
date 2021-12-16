package syn;

public class UnsafeBugTicket {
    public static void main(String[] args) {
        BugTicket bugTicket = new BugTicket();
        Thread thread = new Thread(bugTicket, "虎逼的我");
        Thread thread1 = new Thread(bugTicket, "牛逼的你们");
        Thread thread2 = new Thread(bugTicket, "黄牛党");

        thread.start();
        thread1.start();
        thread2.start();

    }
}

class BugTicket implements Runnable {
    private int ticketNumbs = 1000;
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            try {
                this.bug();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    //    synchronized 同步方法，锁的是this
    private synchronized void bug() throws InterruptedException {
        //判断是否有票
        if (ticketNumbs <= 0) {
            this.flag = false;
            return;
        }
        //买票
        System.out.println(Thread.currentThread().getName() + "拿到" + ticketNumbs--);
    }
}
