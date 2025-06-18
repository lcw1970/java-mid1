package pay;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductManager productManager = new ProductManager();

        Payment payMenu = new KakaoPay(50000); // 초기 잔액 5만원

        while (true) {
            System.out.println("\n=== 상품 목록 ===");
            productManager.showProduct();

            System.out.print("구매할 상품 이름 입력 (종료하려면 '종료' 입력): ");
            String name = sc.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            productManager.buyProduct(name,payMenu);

            if (payMenu instanceof KakaoPay kakao) {
                System.out.println("잔액: " + kakao.getBalance());
            }
        }
    }
}
