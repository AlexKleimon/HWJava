package OOP.HomeWork01;

/*
Задача 1:
Создайте класс "Кот" (Cat) со следующими свойствами:
Приватное поле "Имя" (name) типа String для хранения имени кота.
Приватное поле "Возраст" (age) типа int для хранения возраста кота.
Публичные методы доступа доступа (геттеры и сеттеры) для полей "имя" и "возраст".
Публичный метод "приветствие" (greet), который выводит на консоль приветсвие вида "Мяу! меня зовут <имя>.
Мне <возраст> года (лет)"
Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. Добавьте соответствующее поле
в классе "Кот" и методы доступа для него. Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие
вида "Мяу! меня зовут <имя>. Мне <возраст> года (лет). Мой владелец - <имя владельца>."
*/
public class Task1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Вася", 10, new Owner("Виктор"));
        Cat cat2 = new Cat();
        Cat cat3 = new Cat("Лёва", new Owner("Татьяна"));
        cat1.great();
        cat2.great();
        cat3.great();
    }
}