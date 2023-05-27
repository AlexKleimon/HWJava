package HomeWork06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Acer x1", "16 Гб", "512 Гб", "Windows 10", "Черный");
        Notebook notebook2 = new Notebook("Acer x2", "16 Гб", "1 Тб", "Windows 10", "Серый");
        Notebook notebook3 = new Notebook("Lenovo x1", "32 Гб", "512 Гб", "Windows 11", "Черный");
        Notebook notebook4 = new Notebook("HP 520", "32 Гб", "1 Тб", "Windows 11", "Серый");
        Notebook notebook5 = new Notebook("MSI 333", "64 Гб", "2 Тб", "Linux", "Белый");
        Set<Notebook> noteBooks = new HashSet<>(Arrays.asList(notebook1, notebook2, notebook3, notebook4, notebook5));
        System.out.println(
                "Введите цифру, соответствующую необходимому критерию:\n1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет.");
        int numberSw = sc.nextInt();
        filterNB(numberSw, noteBooks);
        sc.close();
    }

    // Конкретный выбор по выбранному критерию
    private static void filterNB(int numberSw, Set<Notebook> noteBooks) {
        switch (numberSw) {
            case 1:
                System.out.println(
                        "Введите цифру, соответствующую необходимой ОЗУ:\n1 - 16 Гб\n2 - 32 Гб\n3 - 64 Гб.");
                int numberRam = sc.nextInt();
                String[] dataRam = arrayParam(numberSw);
                switch (numberRam) {
                    case 1:
                        filterRam(dataRam, numberRam, noteBooks);
                        break;
                    case 2:
                        filterRam(dataRam, numberRam, noteBooks);
                        break;
                    case 3:
                        filterRam(dataRam, numberRam, noteBooks);
                        break;
                }
                break;

            case 2:
                System.out.println(
                        "Введите цифру, соответствующую необходимому объему ЖД:\n1 - 512 Гб\n2 - 1 Тб\n3 - 2 Тб.");
                int numberRamD = sc.nextInt();
                String[] dataRamD = arrayParam(numberSw);
                switch (numberRamD) {
                    case 1:
                        filterRamDisk(dataRamD, numberRamD, noteBooks);
                        break;
                    case 2:
                        filterRamDisk(dataRamD, numberRamD, noteBooks);
                        break;
                    case 3:
                        filterRamDisk(dataRamD, numberRamD, noteBooks);
                        break;
                }
                break;
            case 3:
                System.out.println(
                        "Введите цифру, соответствующую необходимой ОС:\n1 - Windows\n2 - Windows 11\n3 - Linux.");
                int numberOC = sc.nextInt();
                String[] dataOC = arrayParam(numberSw);
                switch (numberOC) {
                    case 1:
                        filterOC(dataOC, numberOC, noteBooks);
                        break;
                    case 2:
                        filterOC(dataOC, numberOC, noteBooks);
                        break;
                    case 3:
                        filterOC(dataOC, numberOC, noteBooks);
                        break;
                }
                break;
            case 4:
                System.out.println(
                        "Введите цифру, соответствующую необходимому цвету:\n1 - Черный 10\n2 - Серый\n3 - Белый.");
                int numberColor = sc.nextInt();
                String[] dataColor = arrayParam(numberSw);
                switch (numberColor) {
                    case 1:
                        filterColor(dataColor, numberColor, noteBooks);
                        break;
                    case 2:
                        filterColor(dataColor, numberColor, noteBooks);
                        break;
                    case 3:
                        filterColor(dataColor, numberColor, noteBooks);
                        break;
                }
                break;
        }

    }

    // Исходные данные для сравнения параметров
    private static String[] arrayParam(int numberSw) {
        String[] data = new String[3];
        switch (numberSw) {
            case 1:
                data[0] = "16 Гб";
                data[1] = "32 Гб";
                data[2] = "64 Гб";
                break;
            case 2:
                data[0] = "512 Гб";
                data[1] = "1 Тб";
                data[2] = "2 Тб";
                break;
            case 3:
                data[0] = "Windows 10";
                data[1] = "Windows 11";
                data[2] = "Linux";
                break;
            case 4:
                data[0] = "Черный";
                data[1] = "Серый";
                data[2] = "Белый";
                break;
        }
        return data;
    }

    // Фильтр ОЗУ
    private static void filterRam(String[] dataRam, int numberRam, Set<Notebook> noteBooks) {
        Iterator<Notebook> it = noteBooks.iterator();
        while (it.hasNext()) {
            Notebook nb = it.next();
            if (nb.getRam().equals(dataRam[numberRam - 1])) {
                System.out.println(nb);
            }
        }
    }

    // Фильтр ЖД
    private static void filterRamDisk(String[] dataRamD, int numberRamD, Set<Notebook> noteBooks) {
        Iterator<Notebook> it = noteBooks.iterator();
        while (it.hasNext()) {
            Notebook nb = it.next();
            if (nb.getRamDisk().equals(dataRamD[numberRamD - 1])) {
                System.out.println(nb);
            }
        }
    }

    // Фильтр ОС
    private static void filterOC(String[] dataOC, int numberOC, Set<Notebook> noteBooks) {
        Iterator<Notebook> it = noteBooks.iterator();
        while (it.hasNext()) {
            Notebook nb = it.next();
            if (nb.getOc().equals(dataOC[numberOC - 1])) {
                System.out.println(nb);
            }
        }
    }

    // Фильтр цвета
    private static void filterColor(String[] dataColor, int numberColor, Set<Notebook> noteBooks) {
        Iterator<Notebook> it = noteBooks.iterator();
        while (it.hasNext()) {
            Notebook nb = it.next();
            if (nb.getColor().equals(dataColor[numberColor - 1])) {
                System.out.println(nb);
            }
        }
    }
}
