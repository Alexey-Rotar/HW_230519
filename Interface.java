package org.example.hw230519;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Interface {
    public static void printMap(Map<Integer, String> someMap) {
        for (Map.Entry<Integer, String> entry : someMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }

    public static Map<Integer, String> request(List<Laptop> laptopList) {
        Map<Integer, String> sortParametersMap = Sort.getSortParametersMap(laptopList);
        Map<Integer, String> parametersMap = DataEntry.getParametersMap();
        printMap(parametersMap);
        int parameter;
        String value = "0";
        // заполнение пользовательскими минимальными значениями
        Scanner sc = new Scanner(System.in);
        System.out.print("Выберете параметр 1-5 (0 - завершить выбор): ");
        parameter = Integer.parseInt(sc.nextLine());
        if ((parameter > 0) && (parameter < 6)){
            System.out.print("Введите минимальное значение параметра " + parametersMap.get(parameter) + ": ");
            value = sc.nextLine();
        }
        while ((parameter > 0) && (parameter < 6)) {
            sortParametersMap.put(parameter, value);
            System.out.print("Выберете параметр 1-5 (0 - завершить выбор): ");
            parameter = Integer.parseInt(sc.nextLine());
            if ((parameter > 0) && (parameter < 6)) {
                System.out.print("Введите минимальное значение параметра " + parametersMap.get(parameter) + ": ");
                value = sc.nextLine();
            }
        }
        return sortParametersMap;
    }
}
