package book;

public class Ebook implements Book{
    private String title;
    private boolean available;
    @Override
    public void rent() {
        System.out.println("책을 빌립니다.");
        available = false;
    }

    @Override
    public void returnBook() {
        System.out.println("책을 반납합니다.");
    }

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public boolean isAvailable() {
        return false;
    }
}
