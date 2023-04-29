package HomeWork04;

import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
public class Task01 {
    public static void main(String[] args) {
        LinkedList<Integer> numberList = new LinkedList<>();
        for (int i = 1; i < 6; i++) {
            numberList.add(i);
        }
        System.out.println(numberList.toString());
        System.out.println(reverseList(numberList).toString());
    }

    private static LinkedList<Integer> reverseList(LinkedList<Integer> numberList) {
        int sizeList = numberList.size();
        for (int i = 0; i < sizeList/2; i++) {
            int temp = numberList.get(i);
            numberList.set(i, numberList.get(sizeList - 1 - i));
            numberList.set(sizeList - 1 - i, temp);
        }
        return numberList;
    }
}
