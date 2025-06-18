package book;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManger manager = new BookManger();

        while (true) {
            System.out.println("\n=== 도서 대여 시스템 ===");
            System.out.println("1. 전체 도서 보기");
            System.out.println("2. 도서 대여");
            System.out.println("3. 도서 반납");
            System.out.println("4. 종료");
            System.out.print("메뉴 선택: ");

            int menu = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            if (menu == 1) {
                manager.showAllBooks();
            } else if (menu == 2) {
                System.out.print("대여할 도서 제목 입력: ");
                String title = sc.nextLine();
                manager.rentBook(title);
            } else if (menu == 3) {
                System.out.print("반납할 도서 제목 입력: ");
                String title = sc.nextLine();
                manager.returnBook(title);
            } else if (menu == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }

        sc.close();
    }
}
