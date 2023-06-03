package OOP.HomeWork01;

public class Book {
    private String title, author;
    private Boolean available;

    public Book(String title, String author, Boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public Book(String title, Boolean available) {
        this.title = title;
        this.available = available;
        this.author = "Неизвестно";
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public void displayInfo() {
        System.out.printf("Название: %s, автор: %s, доступность: %s\n", title, author, available);
    }
}
