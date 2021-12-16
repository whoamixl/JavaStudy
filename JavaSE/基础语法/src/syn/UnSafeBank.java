package syn;

public class UnSafeBank {
    public static void main(String[] args) {
        Account account = new Account(1000, "结婚基金");

        Drawing you = new Drawing(account, 50, "你");
        Drawing girlFriend = new Drawing(account, 100, "girlFriend");

        you.start();
        girlFriend.start();
    }
}


//账户
class Account {
    int money;//余额
    String name;//卡名

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

//银行：模拟取款
class Drawing extends Thread {
    Account account;//账户

    int drawingMoney;//娶了多少钱

    int nowMoney;//现在手里还有多少钱

    public Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {
        synchronized (account) {
            //判断有没有钱
            if (this.account.money - drawingMoney < 0) {
                System.out.println(Thread.currentThread().getName() + "钱不够，取不了");
                return;
            }

            //sleep扩大问题的发生性
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.account.money = this.account.money - drawingMoney;
            this.nowMoney = this.nowMoney + drawingMoney;

            System.out.println(this.account.name + "余额为" + this.account.money);
            System.out.println(this.getName() + "手里的钱" + this.nowMoney);
        }
    }
}