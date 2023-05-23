package org.example.hw230519;

public class Laptop {
    String brand;
    String model;
    Float displaySize;
    Float CPUFreq;
    Integer CPUCores;
    Integer RAMSize;
    Integer diskSize;
    String osName;
    String color;

    public Laptop(String brand, String model, Float displaySize, Float CPUFreq,
                  Integer CPUCores, Integer RAMSize, Integer diskSize, String osName, String color) {
        this.brand = brand;
        this.model = model;
        this.displaySize = displaySize;
        this.CPUFreq = CPUFreq;
        this.CPUCores = CPUCores;
        this.RAMSize = RAMSize;
        this.diskSize = diskSize;
        this.osName = osName;
        this.color = color;
    }
}
