package pay2;

public class PaymentService {

    public void processPayment(PaymentType paymentType,int amount){

        if (paymentType == PaymentType.CARD){
            Card card = new Card();
            card.pay(amount);
        }
        else if( paymentType == PaymentType.KAKAO){
            KaKaoPay kaKaoPay = new KaKaoPay();
            kaKaoPay.pay(amount);
        }
    }
}
