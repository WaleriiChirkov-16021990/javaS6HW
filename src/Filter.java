import java.util.*;

public class Filter extends Laptop {
    
    static String[] filters;
    
    /**
     * Метод заполняет новый временный экземпляр класса ноутбук, для дальнейшей фильтрации экземпляров из коллекции по требуемуему фильтру(или фильтрам).
     * @param scanner - принимает экземпляр класса Scanner.
     * @return Laptop object - экземпляр из входящей информации для отсеивания "лишних" ноутбуков.
     */
    public Laptop getCriteriy(Scanner scanner){
        Laptop getCritery = new Laptop();
        Map<Object, Object> Criteriy = new HashMap<>();
        Criteriy.put(0, "ID");
        Criteriy.put(1, "brand");
        Criteriy.put(2, "RAM");
        Criteriy.put(3, "HDDCapacity");
        Criteriy.put(4, "operatingSystem");
        Criteriy.put(5, "color");
        Criteriy.put(6, "numberOfCores");
        Criteriy.put(7, "frequency");
        Criteriy.put(8, "screenResolution");
        Criteriy.put(9, "diagonal");
        Criteriy.put(10, "videoMemoryCapacity");
        Criteriy.put(11, "price");
        Criteriy.put(12, "discount");
        Criteriy.put(13, "quantity");
        new Printer().printMap(Criteriy);
        System.out.print("Выберети фильтр цифрой ( можно несколько через пробел ) : ");
        String[] input = scanner.nextLine().split(" ");
        Filter.filters = input;
        String filter;
        for (String s:
                input) {
            if (Checker.isInteger(s)) {
                if (Criteriy.containsKey(Integer.parseInt(s))) {
                    while (true) {
                        System.out.printf("Введите значение по %s \n", Criteriy.get(Integer.parseInt(s)));
                        filter = scanner.nextLine();
                        if(Checker.isTrue(Criteriy.get(Integer.parseInt(s)), filter)){
                            break;
                        } else {
                            System.out.println("вы ввели неверное значение параметра.");
                        }
                    }
                    getCritery.setParam((String) Criteriy.get(Integer.parseInt(s)), filter);
                } else System.out.println("Нет такого ключа");
            } else System.out.printf("Вы ввели не число: %s \n", s);
        }
        return getCritery;
    }
    
    /**
     *  метод сравнивает кажды йноутбук из коллекции с "эталонным".
     * @param object - Список ноутбуков
     * @param category - экземпляр для сравнения
     * @return - HashSet<Object> - коллекция отфильтрованных ноутбуков
     */
    public HashSet<Object> getFilterObject(List<Laptop> object, Laptop category){
        HashSet<Object> result = new HashSet<>();
        for (Laptop s: object){
            if (s.equals(category)){
                result.add(s);
            }
        }
        return result;
    }
}
