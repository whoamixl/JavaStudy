package proxy;

public class StaticProxy {
    public static void main(String[] args) {
        WeddingCompany weddingCompany = new WeddingCompany(new You());
        weddingCompany.happyMarray();
    }
}

interface Marray{
    void happyMarray();
}

class You implements Marray{

    @Override
    public void happyMarray() {
        System.out.println("我要结婚了，超开心");
    }
}

class WeddingCompany implements Marray {

    private Marray target;

    public WeddingCompany(Marray target) {
        this.target = target;
    }

    @Override
    public void happyMarray() {
        before();
         this.target.happyMarray();
         after();
    }

    private void before() {
        System.out.println("结婚前，布置场地");
    }

    private void after() {
        System.out.println("结婚后，收尾款");
    }


}