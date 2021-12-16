package thread;

//死锁，多个线程相互拥抱对方的资源，然后形成僵持
public class DeadLock {
    public static void main(String[] args) {
        Makeup makeup1 = new Makeup(0, "小红");
        Makeup makeup2 = new Makeup(1, "小芳");

        makeup1.start();
        makeup2.start();
    }
}


//口红
class Lipstick {

}

//镜子
class Mirror {

}

class Makeup extends Thread {
    //只需要一分资源用static，保证只有一份
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice;//选择
    String name;//选择的人

    public Makeup(int choice, String name) {
        this.choice = choice;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void makeup() throws InterruptedException {
        if (choice == 0) {
            synchronized (lipstick) {
                System.out.println(this.name + "拿到了口红的锁");
                Thread.sleep(1000);
            }
            synchronized (mirror) {
                System.out.println(this.name + "拿到了镜子的锁");
            }
        } else {
            synchronized (mirror) {
                System.out.println(this.name + "拿到了镜子的锁");
                Thread.sleep(2000);
            }
            synchronized (lipstick) {
                System.out.println(this.name + "拿到了口红的锁");
            }
        }
    }
}