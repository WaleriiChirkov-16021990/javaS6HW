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

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptop ntbk1 = new Laptop();
        Laptop ntbk2 = new Laptop(
                333,
                "Lenovo",
                2,
                250,
                "Windows",
                "red",
                4,
                3.0,
                800*1270,
                14,
                2,
                30_000,
                20,
                100);

        Laptop ntbk3 = new Laptop(320,
                "Apple",
                16 ,
                1000,
                "IOS",
                "grey space",
                6,
                4.5,
                1920* 1080,
                15,
                8,
                160_000,
                15,
                10);

        Laptop ntbk4 = new Laptop(320,
                "HP4K",
                32 ,
                2000,
                "Windows",
                "grey",
                64,
                6.0,
                3800* 9270,
                18,
                24,
                300_000,
                2,
                2);

        Laptop ntbk5 = new Laptop(
                320,
                "Acer",
                4 ,
                250,
                "Windows",
                "black",
                8,
                4.0,
                800* 1270,
                14,
                2,
                40_000,
                15,
                40);
        Laptop ntbk6 = new Laptop(
                320,
                "Apple",
                16 ,
                1000,
                "IOS",
                "grey space",
                6,
                4.5,
                1920* 1080,
                15,
                8,
                160_000,
                15,
                10);
        Laptop notebook = new Laptop();
        List<Laptop> LaptopSet = new ArrayList<>(Arrays.asList( ntbk1, ntbk2, ntbk3, ntbk4, ntbk5, ntbk6  , notebook));
//        Shop LaptopSet = new Shop(Arrays.asList( ntbk1, ntbk2, ntbk3, ntbk4, ntbk5, ntbk6  , notebook));


        ntbk1.setParams(16,
                "HP_OMEN",
                16,
                1000,
                "Windows",
                "grafite",
                6,
                4.2,
                1920*1080,
                17,
                8,
                100_000,
                5,
                11);

        new Printer().printShop(LaptopSet);
        Scanner scanner = new Scanner(System.in);
        Map <Object, Object> category = new Filter().getCriteriy(scanner);
        new Printer().printMap(category);
        HashSet<Object> resultLaptop = new Filter().getFilterObject(LaptopSet, category);
        System.out.println("=========______++++++++=========");
        new Printer().printHashSet(resultLaptop);
        scanner.close();
    }
}