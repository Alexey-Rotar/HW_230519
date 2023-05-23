package org.example.hw230519;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sort {
    public static Map<Integer, String> getSortParametersMap(List<Laptop> laptopList) {
        Map<Integer, String> sortParametersMap = new HashMap<>();
        sortParametersMap.put(1, String.valueOf(laptopList.get(0).displaySize));
        sortParametersMap.put(2, String.valueOf(laptopList.get(0).CPUFreq));
        sortParametersMap.put(3, String.valueOf(laptopList.get(0).CPUCores));
        sortParametersMap.put(4, String.valueOf(laptopList.get(0).RAMSize));
        sortParametersMap.put(5, String.valueOf(laptopList.get(0).diskSize));

        for (Laptop item : laptopList) {
            if (item.displaySize <= Float.parseFloat(sortParametersMap.get(1))) {
                sortParametersMap.put(1, String.valueOf(item.displaySize));
            }
            if (item.CPUFreq <= Float.parseFloat(sortParametersMap.get(2))) {
                sortParametersMap.put(2, String.valueOf(item.CPUFreq));
            }
            if (item.CPUCores <= Integer.parseInt(sortParametersMap.get(3))) {
                sortParametersMap.put(3, String.valueOf(item.CPUCores));
            }
            if (item.RAMSize <= Integer.parseInt(sortParametersMap.get(4))) {
                sortParametersMap.put(4, String.valueOf(item.RAMSize));
            }
            if (item.diskSize <= Integer.parseInt(sortParametersMap.get(5))) {
                sortParametersMap.put(5, String.valueOf(item.diskSize));
            }
        }
        return sortParametersMap;
    }

    public static void sort(List<Laptop> laptopList, Map<Integer, String> sortParametersMap) {
        System.out.println();
        for (Laptop item : laptopList) {
            if ((item.displaySize >= Float.parseFloat(sortParametersMap.get(1))) &&
                    (item.CPUFreq >= Float.parseFloat(sortParametersMap.get(2))) &&
                    (item.CPUCores >= Integer.parseInt(sortParametersMap.get(3))) &&
                    (item.RAMSize >= Integer.parseInt(sortParametersMap.get(4))) &&
                    (item.diskSize >= Integer.parseInt(sortParametersMap.get(5)))) {
                System.out.println(item.brand + " " + item.model + ", " + item.displaySize + "\", "
                        + item.CPUCores + "x" + item.CPUFreq + "ГГц, RAM: " + item.RAMSize + "Мб, HDD(SSD): "
                        + item.diskSize + "Гб, ОС: " + item.osName + ", Цвет: " + item.color);
            }
        }
    }
}
