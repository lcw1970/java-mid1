package pay;

public class Card implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("카드로 "+amount+"원 결제");
    }

    @Override
    public void depositAmount(int amount) {

    }

    @Override
    public int withdrawAmount(int amount) {
        return 0;
    }
}
