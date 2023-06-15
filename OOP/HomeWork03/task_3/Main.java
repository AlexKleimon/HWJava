package OOP.HomeWork03.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 Задача: Написать функцию, которая принимает список объектов и компаратор 
 для сортировки объектов по заданному критерию. Функция должна возвращать отсортированный список объектов.
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Victor", 33);
        Person p2 = new Person("Alex", 22);
        Person p3 = new Person("John", 55);
        Person p4 = new Person("Bob", 28);
        List<Person> persons = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));
        Comparator<Person> nameComparator = (pam1, pam2) -> (pam1.getName().compareTo(pam2.getName()));
        for (Person person : sortList(persons,nameComparator)) {
            System.out.println(person.getName() + " - " + person.getAge());
        }

    }

    public static List<Person> sortList(List<Person> dataList, Comparator<Person> comp) {
        Collections.sort(dataList, comp);
        return dataList;
    }
}
