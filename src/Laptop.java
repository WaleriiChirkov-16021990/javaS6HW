import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Это класс ноутбуков
 */
public class Laptop {
    String brand;
    int RAM;
    int HDDCapacity;
    String operatingSystem;
    String color;
    int numberOfCores;
    double frequency;
    int screenResolution;
    int diagonal;
    int videoMemoryCapacity;
    int price;
    int discount;
    int quantity;

    /**
     * описываем сущность ноутбук
     *
     */

    Laptop(){
        brand = "None";
        RAM = 0;
        HDDCapacity = 0;
        operatingSystem = "None";
        color = "None";
        numberOfCores = 0;
        frequency = 0.0;
        screenResolution = 0;
        diagonal = 0;
        videoMemoryCapacity = 0;
        price = 0;
        discount = 0;
        quantity = 0;
    }

    Laptop(String Brand, int RAM, int HDDCapacity, String operatingSystem, String color, int numberOfCores, double frequency, int screenResolution, int diagonal, int videoMemoryCapacity, int price, int discount, int quantity){
        brand = Brand;
        RAM = RAM;
        HDDCapacity = HDDCapacity;
        operatingSystem = operatingSystem;
        color = color;
        numberOfCores = numberOfCores;
        frequency = frequency;
        screenResolution = screenResolution;
        diagonal = diagonal;
        videoMemoryCapacity = videoMemoryCapacity;
        price = price;
        discount = discount;
        quantity = quantity;
    }

//    @Override
//    public boolean equalsRAM(Object obj) {
//        return super.equals(obj);
//    }

    @Override
    public String toString() {
        return String.format("\n Бренд : %s\n Оперативная память : %d Гб.\n Объём жестког диска : %d Гб.\n Операционная система : %s\n Цвет : %s\n Количество ядер : %d\n Тактовая частота : %s Гц.\n Разрешение Экрана : %d пикс.\n Диагональ : %d дюймов\n Объём видеопамяти : %d Гб.", brand,RAM,
                HDDCapacity, operatingSystem, color, numberOfCores, frequency, screenResolution, diagonal, videoMemoryCapacity);
    }


}
