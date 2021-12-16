package polymorphism;

public class Application {
    public static void main(String[] args) {
        Object obj = new B();
        B b = new B();
        C c = new A();

        ((B) obj).printb();
        b.printc();
        c.print();

    }
}
