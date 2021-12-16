package state;

//模拟网络延时，扩大问题的发生性
//网络延时，发现线程是不安全的
public class SleepTest implements Runnable{

        private int ticketNum = 10;

        private boolean winer = false;
        @Override
        public void run() {
        this.saleTicket();
//            this.runGame();
        }

        private void saleTicket(){
            while (true) {
                if (ticketNum <= 0) {
                    break;
                }else {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"拿到了第"+this.ticketNum--+"票");
                }
            }
        }

        private void runGame(){
            for (int i = 0; i <= 100; i++) {
                this.getWinner(i);
                if (winer) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");
            }
        }

        private boolean getWinner(int steps){
            if (this.winer) {
                return true;
            }
            if (steps >= 100) {
                System.out.println(Thread.currentThread().getName() + "is winner");
                this.winer = true;
                return true;
            }else {
                return false;
            }
        }

        public static void main(String[] args) {
            SleepTest myThread1 = new SleepTest();

            new Thread(myThread1,"小明").start();
            new Thread(myThread1,"小龙").start();
            new Thread(myThread1,"小张").start();
        }


}
