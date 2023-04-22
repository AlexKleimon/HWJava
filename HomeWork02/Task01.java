package HomeWork02;

import java.util.logging.*;
import java.io.IOException;

public class Task01 {

    private static Logger logger = Logger.getLogger(Task01.class.getName());

    public static void main(String[] args) throws IOException {
        /*
         * Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
         * результат после каждой итерации запишите в лог-файл.
         */
        FileHandler fh = new FileHandler("HomeWork02/log.txt");
        fh.setEncoding("UTF-8");
        logger.addHandler(fh);
        SimpleFormatter txt = new SimpleFormatter();
        fh.setFormatter(txt);
        int[] dataArry = { 5, 5, 1, 3, 4, 2 };
        bubbleSort(dataArry);
        printArry(dataArry);
    }

    public static void bubbleSort(int[] arry) {
        int lengthArry = arry.length;
        for (int i = 0; i + 1 < lengthArry; i++) {
            for (int j = 0; j + 1 < lengthArry; j++) {
                if (arry[j] > arry[j + 1]) {
                    logger.info(printArry(arry)); // Поставил сюда, чтобы исходный массив было видно в логах
                    int temp = arry[j + 1];
                    arry[j + 1] = arry[j];
                    arry[j] = temp;
                }
            }
        }
    }

    public static String printArry(int[] arry) {
        String elements = "";
        for (int i = 0; i < arry.length; i++) {
            elements += arry[i] + " ";
        }
        return elements;
    }
}