package book;

public interface Book {
    void rent();
    void returnBook();
    String getTitle();
    boolean isAvailable();
}
