package OOP.HomeWork01;

/*
Задача 3: По желанию, для тех кто уже проходил ООП, чтобы было не скучно.
Реализуйте систему управления библиотекой. Создайте классы "Книга" (Book) и "Библиотека" (Library) со
следующими свойствами и методами:
Класс "Книга" (Book):
Приватные поля "Название" (title) и "Автор" (author) типа String для хранения названия и автора книги
соответсвенно.
Приватное поле "Доступность" (available) типа boolean для указания доступности книги.
Публичные методы доступа (геттеры и сеттеры) для полей "название" и "автор".
Публичные методы доступа (геттеры и сеттеры) для поля "доступность".
Публичный метод "показать информацию" (displayinfo), который выводит на консоль информацию о книге
(назване, автор, доступность).
Класс "Библиотека" (Library):
Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения списка книг в библиотеке.
Публичный метод "добавить книгу" (addBook), который принимает объект типа Book и добавляет его в
каталог библиотеки.
Публичный метод "удалить книгу" (removeBook), который рпинимает объект типа Book и удаляет его из
каталога библиотеки.
Публичный метод "показать доступные книги" (displayAvailableBook), который выводит на консоль
информацию о доступных книгах в библиотеке.
Публичный метод "поиск книги по автору" (searchByAuthor), который принимает имя автора в качестве параметра и
выводит на консоль информацию о книгах данного автора, находящихся в каталоге библиотеки.
 */
public class Task3 {
    public static void main(String[] args) {
        Book bk1 = new Book("Книга 1", true);
        Book bk2 = new Book("Книга 2", "Петров", false);
        Book bk3 = new Book("Книга 3", "Петров", true);
        Book bk4 = new Book("Книга 4", "Иванов", true);
        Book bk5 = new Book("Книга 5", "Петров", false);
        Book bk6 = new Book("Книга 6", "Васильев", true);
        Library lb1 = new Library();
        lb1.addBook(bk1);
        lb1.addBook(bk2);
        lb1.addBook(bk3);
        lb1.addBook(bk4);
        lb1.addBook(bk5);
        lb1.addBook(bk6);
        lb1.removeBook(bk4);
        lb1.displayAvailableBook();
        System.out.println("Поиск всех книг автора: Петров:");
        lb1.searchByAuthor("Петров");
    }
}
