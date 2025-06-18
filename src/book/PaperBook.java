package book;

public class PaperBook implements Book{
    private String title;
    private boolean available = true;

    public PaperBook(String title){
        this.title = title;
    }
    @Override
    public void rent() {
        System.out.println("책을 빌립니다.");
        available = false;
    }

    @Override
    public void returnBook() {
        System.out.println("책을 반납합니다.");
        available = true;
    }
    @Override
    public boolean isAvailable() {
        return available;
    }
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "책 제목: " + title + " / " + (available ? "대여 가능" : "대여 중");
    }
}
