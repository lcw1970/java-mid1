package pay2;

public class PayMain {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment(PaymentType.KAKAO,5000);
        paymentService.processPayment(PaymentType.CARD,10000);
    }
}
