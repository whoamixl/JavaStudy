package state;
//测试停止线程
    //1.建议次数
    //2.不建议死循环
    //3.利用标志位停止
    //4.不要使用stop或者destory等过时，或jdk不建议的方法
public class StopTest implements Runnable{
    private boolean flag = true;
    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println("run......Thread"+i++);
        }
    }

//    2.设置一个公开的方法来停止线程,切换换标志位
    public void stop(){
        this.flag = false;
    }

    public static void main(String[] args) {
        StopTest stopTest = new StopTest();
        new Thread(stopTest).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main"+i);
            if (i==900) {
                stopTest.stop();
                System.out.println("线程停止了");
            }

        }
    }
}
