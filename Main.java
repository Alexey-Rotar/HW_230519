package org.example.hw230519;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Laptop> laptopList = DataEntry.getLaptopList();
        Map<Integer, String> sortParametersMap = Interface.request(laptopList);
        Sort.sort(laptopList, sortParametersMap);
    }
}
