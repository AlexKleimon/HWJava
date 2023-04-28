package HomeWork03;

import java.util.ArrayList;
import java.util.Random;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task03 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        fillArrayList(numberList);
        printArray(numberList);
        searchMinMaxNumber(numberList);
        searchAverage(numberList);
    }

    public static void fillArrayList(ArrayList<Integer> numberList) {
        Random randNumber = new Random();
        for (int i = 0; i < randNumber.nextInt(15) + 5; i++) {
            numberList.add(randNumber.nextInt(20));
        }
    }

    public static void printArray(ArrayList<Integer> numberList) {
        System.out.println(numberList.toString());
    }

    public static void searchMinMaxNumber(ArrayList<Integer> numberList) {
        numberList.sort(null);
        System.out.printf("Минимальное число в списке: %d;\nМаксимальное число в списке: %d;", numberList.get(0),
                numberList.get(numberList.size() - 1));
    }

    public static void searchAverage(ArrayList<Integer> numberList) {
        int sumNumbers = 0;
        for (Integer integer : numberList) {
            sumNumbers += integer;
        }
        System.out.printf("\nСреднее арфиметическое чисел списка: %.2f.", (double) sumNumbers / (numberList.size()));
    }
}
