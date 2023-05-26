package HomeWork05;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
2. Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности Имени.
 */
public class Task02 {
    public static void main(String[] args) {
        String[] userArray = { "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
                "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", "Иван Ежов" };
        System.out.println("Список людей:\n" + Arrays.toString(userArray));
        String[] nameArray = subStrUserArray(userArray);
        HashMap<String, Integer> nameMap = countName(nameArray);
        LinkedHashMap<String, Integer> sortMap = sortNameMap(nameMap);
        System.out.println("Повторяющиеся имена:");
        printMap(sortMap);
    }

    private static String[] subStrUserArray(String[] dataArray) {
        int count = 0;
        for (String s : dataArray) {
            int index = s.indexOf(" ");
            dataArray[count] = s.substring(0, index);
            count++;
        }
        return dataArray;
    }

    private static HashMap<String, Integer> countName(String[] dataArray) {
        HashMap<String, Integer> countNames = new HashMap<>();
        for (int i = 0; i < dataArray.length; i++) {
            int count = 1;
            for (int j = i + 1; j < dataArray.length; j++) {
                if (dataArray[i].equals(dataArray[j])) {
                    count++;
                }
            }
            if (!countNames.containsKey(dataArray[i]) && count > 1) {
                countNames.put(dataArray[i], count);
            }
        }
        return countNames;
    }

    private static LinkedHashMap<String, Integer> sortNameMap(HashMap<String, Integer> nameMap) {
        LinkedHashMap<String, Integer> sortMap = new LinkedHashMap<>();
        String[] keyArray = nameMap.keySet().toArray(new String[0]);
        for (int i = 0; i < keyArray.length; i++) {
            int max = nameMap.get(keyArray[i]);
            int index = i;
            for (int j = i + 1; j < keyArray.length; j++) {
                int tmp = nameMap.get(keyArray[j]);
                if (tmp > max) {
                    max = tmp;
                    index = j;
                }
            }
            String temp = keyArray[index];
            keyArray[index] = keyArray[i];
            keyArray[i] = temp;
        }
        for (String s : keyArray) {
            sortMap.put(s, nameMap.get(s));
        }
        return sortMap;
    }

    private static void printMap(LinkedHashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> data : map.entrySet()) {
            System.out.println(data.getKey() + " - " + data.getValue());
        }
    }
}
