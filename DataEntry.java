package org.example.hw230519;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataEntry {
    public static List<Laptop> getLaptopList() {
        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(new Laptop("Apple", "MacBook Air", 13.3F, 3.2F, 8, 16, 512, "MacOS", "Space Grey"));
        laptopList.add(new Laptop("Samsung", "Galaxy Book NP750", 15.0F, 2.8F, 4, 8, 1000, "Windows 10 Professional", "Blue"));
        laptopList.add(new Laptop("Dell", "Latitude 5520", 15.6F, 2.4F, 4, 8, 512, "Linux", "Black"));
        laptopList.add(new Laptop("Acer", "Aspire 3", 15.0F, 1.0F, 4, 8, 256, "Windows 10", "Black"));
        laptopList.add(new Laptop("Apple", "MacBook Air", 13.6F, 3.49F, 8, 16, 256, "MacOS", "Silver"));
        laptopList.add(new Laptop("Dell", "Vosrto 3510", 15.0F, 2.8F, 4, 8, 1000, "Linux", "Black"));
        return laptopList;
    }

    public static Map<Integer, String> getParametersMap() {
        Map<Integer, String> parametersMap = new HashMap<>();
        parametersMap.put(1, "Диагональ экрана");
        parametersMap.put(2, "Частота процессора");
        parametersMap.put(3, "Количество ядер");
        parametersMap.put(4, "Объем RAM");
        parametersMap.put(5, "Объём диска");
        return parametersMap;
    }
}
