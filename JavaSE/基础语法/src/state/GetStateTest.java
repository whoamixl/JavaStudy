package state;

//观察线程状态
public class GetStateTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("//////////");
            }
        });

        //观察线程状态getState
        Thread.State state = t1.getState();
        System.out.println(state); //new

        //观察启动后
        t1.start();
        state = t1.getState();
        System.out.println(state);//Run

        while (state != Thread.State.TERMINATED) {//只要线程不终止，就一直输出状态
            Thread.sleep(100);
            state = t1.getState(); //更新线程状态
            System.out.println(state);
        }

        //线程死亡后不能再次启动
//        t1.start();

    }
}
