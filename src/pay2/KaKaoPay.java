package pay2;

public class KaKaoPay implements PayStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("KakaoPay로 "+amount+"원 결제합니다.");
    }
}
