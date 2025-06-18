package book;

import java.util.ArrayList;
import java.util.List;

public class BookManger {
    private List<Book> books;

    public BookManger() {
        books = new ArrayList<>();
        books.add(new PaperBook("자바의 정석"));
        books.add(new PaperBook("토비의 스프링"));
        books.add(new PaperBook("이것이 자바다"));
    }

    public void showAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void rentBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                if (book.isAvailable()) {
                    System.out.println("도서를 대여합니다.");
                    book.rent();
                } else {
                    System.out.println("이미 대여 중인 도서입니다.");
                }
                return;
            }
        }
        System.out.println("해당 제목의 도서를 찾을 수 없습니다.");


    }
    public void returnBook(String title){
        for (Book book : books) {
            if (book.getTitle().equals(title)){
                book.returnBook();
                System.out.println("도서를 반납합니다.");
                return;
            }
        }
        System.out.println("해당 제목의 도서를 찾을 수 없습니다.");
    }
}