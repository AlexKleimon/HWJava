package HomeWork02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/*Дана строка (получение через обычный текстовый файл!!!)

"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода в консоль:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика. */

public class Task02 {
    public static void main(String[] args) {
        String fileName = "HomeWork02/School.txt";
        try {
            parsingData(readFile(fileName));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Парсинг..Получился сложный алгоритм...
    public static void parsingData(String[] data) {
        StringBuilder text = new StringBuilder();
        String[] pattern = { "[фамилия]", "[оценка]", "[предмет]" };
        int indexChar = 0;
        for (int i = 0; i < data.length; i++) {
            text.append("Студент [фамилия] получил [оценка] по предмету [предмет].");
            String[] textArry = data[i].replace("\"", "").split("[,:]");
            int count = 0;
            for (int j = 1; j < textArry.length; j += 2) {
                indexChar = text.indexOf(pattern[count]);
                text.delete(indexChar, indexChar + pattern[count].length());
                count++;
                text.replace(indexChar, indexChar, textArry[j]);
            }
            System.out.println(text);
            text.delete(0, text.length());
        }
    }

    // Чтение файла
    public static String[] readFile(String fileName) throws IOException {
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
        String line;
        String[] data = new String[countStringInFile(fileName)];
        int count = 0;
        while ((line = br.readLine()) != null) {
            data[count] = line;
            count++;
        }
        br.close();
        return data;
    }

    // Подсчет строк в файле
    public static int countStringInFile(String fileName) throws IOException {
        Scanner sc = new Scanner(new FileReader(fileName));
        int numLine = 0;
        while (sc.hasNextLine()) {
            sc.nextLine();
            numLine++;
        }
        return numLine;
    }
}
