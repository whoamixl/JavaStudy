package state;


//线程优先级
public class Priority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "---->" + Thread.currentThread().getPriority());

        MyProperty myProperty = new MyProperty();

        Thread t1 = new Thread(myProperty);
        Thread t2 = new Thread(myProperty);
        Thread t3 = new Thread(myProperty);
        Thread t4 = new Thread(myProperty);
        Thread t5 = new Thread(myProperty);
        Thread t6 = new Thread(myProperty);


        t2.setPriority(1);
        t3.setPriority(4);
        t4.setPriority(7);
        t5.setPriority(Thread.MAX_PRIORITY);//最大10

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

//        t6.setPriority(-1); //优先级为1-10；
//        t6.start();

    }
}


class MyProperty implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "---->" + Thread.currentThread().getPriority());
    }
}