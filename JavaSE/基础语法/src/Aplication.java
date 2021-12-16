public class Aplication {
    public static void main(String[] args) {

//            new Aplication().test(0);


        int a = 1;
        int b = 0;

        try {
            System.out.println(a/b);
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("我处理了异常");
        }


    }

//    public void test(int a){
//        if (a == 0) {
//            try {
//                throw new MyException(a);
//            } catch (MyException e) {
//                a = 5;
//                System.out.println(a);
////                e.printStackTrace();
//            }
//        }
//    }
}
