package OOP.HomeWork01;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalog = new ArrayList<>();

    public ArrayList<Book> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<Book> catalog) {
        this.catalog = catalog;
    }

    public void addBook(Book book) {
        this.catalog.add(book);
    }

    public void removeBook(Book book) {
        this.catalog.remove(book);
    }

    public void displayAvailableBook() {
        for (Book book : this.catalog) {
            if (book.getAvailable())
                System.out.printf("Автор: %s, название: %s\n", book.getAuthor(), book.getTitle());
        }
    }

    public void searchByAuthor(String author) {
        for (Book book : this.catalog) {
            if (book.getAuthor().equals(author))
                System.out.printf("Автор: %s, название: %s, доступность: %s.\n", book.getAuthor(), book.getTitle(),
                        book.getAvailable());
        }
    }
}
