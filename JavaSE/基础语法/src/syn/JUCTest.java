package syn;


import java.util.concurrent.CopyOnWriteArrayList;

//测试JUC安全类型的集合
public class JUCTest {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        for (int i = 0; i < 100000; i++) {
            new Thread(() -> {
                list.add(Thread.currentThread().getName().toString());
            }).start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
