/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии)
 фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Laptop ntbk1 = new Laptop();
        Laptop ntbk2 = new Laptop();
        Laptop ntbk3 = new Laptop();
        Laptop ntbk4 = new Laptop();
        Laptop ntbk5 = new Laptop();
        Laptop ntbk6 = new Laptop("Apple", 16 , 1000, "IOS", "grey space", 6, 4.5,1920* 1080, 15,8, 160_000, 15, 10);
        Laptop notebook = new Laptop();
        Shop LaptopSet = new Shop(Arrays.asList(ntbk1, ntbk2, ntbk3, ntbk4, ntbk5, ntbk6,notebook ));
        HashSet<Object> lap = new HashSet<>();
//        lap = Laptop;
//        LaptopSet = Arrays.asList(ntbk1, ntbk2, ntbk3, ntbk4, ntbk5, ntbk6,notebook );

        ntbk1.brand = "HP_OMEN";
        ntbk1.RAM = 16;
        ntbk1.HDDCapacity = 1000;
        ntbk1.operatingSystem = "Windows";
        ntbk1.color ="grafite";
        ntbk1.numberOfCores = 6;
        ntbk1.frequency = 4.2;
        ntbk1.screenResolution = 1920*1080;
        ntbk1.diagonal = 17;
        ntbk1.videoMemoryCapacity = 8;

        ntbk3.brand = "Acer";
        ntbk3.RAM = 8;
        ntbk3.HDDCapacity = 500;
        ntbk3.operatingSystem = "Windows";
        ntbk3.color = "white";
        ntbk3.numberOfCores = 4;
        ntbk3.frequency = 3.5;
        ntbk3.screenResolution = 1920*1080;
        ntbk3.diagonal = 15;
        ntbk3.videoMemoryCapacity = 4;


        ntbk2.brand = "Acer";
        ntbk2.RAM = 4;
        ntbk2.HDDCapacity = 250;
        ntbk2.operatingSystem = "Windows";
        ntbk2.color = "black";
        ntbk2.numberOfCores = 8;
        ntbk2.frequency = 4.0;
        ntbk2.screenResolution = 800*1270;
        ntbk2.diagonal = 14;
        ntbk2.videoMemoryCapacity = 2;


        ntbk4.brand = "HP4K";
        ntbk4.RAM = 32;
        ntbk4.HDDCapacity = 2000;
        ntbk4.operatingSystem = "Windows";
        ntbk4.color = "Grey";
        ntbk4.numberOfCores = 64;
        ntbk4.frequency = 6.0;
        ntbk4.screenResolution = 3800*9270;
        ntbk4.diagonal = 18;
        ntbk4.videoMemoryCapacity = 24;


        ntbk5.brand = "Lenovo";
        ntbk5.RAM = 2;
        ntbk5.HDDCapacity = 250;
        ntbk5.operatingSystem = "Windows";
        ntbk5.color = "Red";
        ntbk5.numberOfCores = 4;
        ntbk5.frequency = 3.0;
        ntbk5.screenResolution = 800*1270;
        ntbk5.diagonal = 14;
        ntbk5.videoMemoryCapacity = 2;



//        System.out.println(ntbk1);
//        System.out.println(ntbk2);
//        System.out.println(ntbk3);
//        System.out.println(ntbk4);
//        System.out.println(ntbk5);

//        System.out.println(noteBookSet);

        LaptopSet.forEach(System.out::println);


    }
}