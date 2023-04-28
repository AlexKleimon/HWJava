package HomeWork03;

import java.util.ArrayList;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class Task02 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        fillArrayList(numberList);
        printArray(numberList);
        creatArrayList(numberList);
        printArray(numberList);

    }

    public static void fillArrayList(ArrayList<Integer> numberList) {
        Random randNumber = new Random();
        for (int i = 0; i < randNumber.nextInt(15)+5; i++) {
            numberList.add(randNumber.nextInt(20));
        }
    }

    public static void printArray(ArrayList<Integer> numberList) {
        System.out.println(numberList.toString());
    }

    public static void creatArrayList(ArrayList<Integer> numberList) {
        for (int i = numberList.size()-1; i >= 0; i--) {
            if ((numberList.get(i) % 2) == 0)
                numberList.remove(i);
        }
    }
}
