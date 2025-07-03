package nested.test.ex1;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int num){
        books = new Book[num];
        bookCount = 0;
    }
    private static class Book {
        private String title;
        private String author;
        public Book(String title,String author){
            this.title = title;
            this.author = author;
        }
    }

    public void addBook(String title,String author){
        if (bookCount < books.length){
            books[bookCount] = new Book(title,author);
            bookCount += 1;
        }
        else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }
    public void showBooks(){
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < books.length; i++) {
            System.out.println("도서 제목: "+books[i].title+", 저자: "+books[i].author);
        }
    }

}
