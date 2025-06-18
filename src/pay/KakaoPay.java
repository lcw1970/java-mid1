package pay;

public class KakaoPay implements Payment{
    private int balance;

    public KakaoPay(int balance){
        this.balance = balance;
    }
    @Override
    public void pay(int amount) {
        if (balance >= amount){
            System.out.println("카카오페이로 "+amount+"원 결제 완료");
            balance -= amount;
        }
        else {
            System.out.println("잔액이 부족합니다.");
        }
    }
    @Override
    public void depositAmount(int amount){
        balance+= amount;
    }
    @Override
    public int withdrawAmount(int amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println(amount+"원 출금합니다.");
            return amount;
        }
        else {
            System.out.println("잔액이 부족합니다.");
            return 0;
        }
    }

    public int getBalance() {
        return balance;
    }
}
