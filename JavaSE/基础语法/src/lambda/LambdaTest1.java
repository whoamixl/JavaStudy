package lambda;

public class LambdaTest1 {
    //静态内部类
    static class Like1 implements ILike{
        @Override
        public void lambda() {
            System.out.println("I like lambda2！");
        }
    }

    public static void main(String[] args) {
        ILike like = new Like();
        like.lambda();

        like = new Like1();
        like.lambda();

        //4.局部内部类
        class Like3 implements ILike{
            @Override
            public void lambda() {
                System.out.println("I like lambda3！");
            }
        }

        like = new Like3();
        like.lambda();

        //5.匿名内部类
        like = new ILike() {
            @Override
            public void lambda() {
                System.out.println("I like lambda4！");
            }
        };

        like.lambda();

        //6.用lambda简化
        like = ()->System.out.println("I like lambda5！");
        like.lambda();

        ILove love = (a, b) -> {
            System.out.println("I am "+a);
            System.out.println("I am "+b);
        };

        love.love(4,5);



    }
}

//1.定义函数式接口，接口内只有1个函数声明
interface ILike{
    void lambda();
}
interface ILove{
    void love(int a,int b);
}
//2.实现类
class Like implements ILike{
    @Override
    public void lambda() {
        System.out.println("I like lambda1！");
    }
}