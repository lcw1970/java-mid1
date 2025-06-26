package pay2;

public class Card implements PayStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("신용카드로로 "+amount+"원 결제합니다.");
    }
}
