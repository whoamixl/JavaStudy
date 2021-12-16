package state;


//Join方法，  想象为插队
public class JoinTest implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("vip用户来了..." + i);
        }
    }

    public static void main(String[] args) {
        JoinTest joinTest = new JoinTest();
        Thread thread = new Thread(joinTest);
        thread.start();


        for (int i = 0; i < 500; i++) {
            if (i == 200) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    System.out.println("异常###############################");
                    e.printStackTrace();
                }
            }
            System.out.println("我是主线程..." + i);
        }
    }
}
