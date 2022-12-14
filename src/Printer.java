import java.util.*;

public class Printer {
    /**
     * Метод вывода на экран, полученные коллекции.
     * @param hashSet - коллекция HashSet для вывода в консоль
     */

    public void printHashSet(HashSet<Object> hashSet){
        hashSet.forEach(System.out::println);
    }
    
    /**
     * Метод вывода на экран, полученные коллекции обьектов.
     * @param object - коллекция для вывода в консоль.
     */
    public void printCollection(Collection<Object> object){
        object.forEach(System.out::println);
    }
    
    /**
     * Метод вывода на экран, полученные коллекции обьектов.
     * @param array - массив объектов для вывода в консоль.
     */
    public void printArray(Object[] array){
        System.out.println(Arrays.toString(array));
    }
    
    /**
     * Метод вывода на экран, полученные коллекции обьектов.
     * @param list - список List <Object> list
     */

    public void printList(List<Object> list) {
        System.out.println(list);
    }
    
    /**
     * Метод вывода на экран, полученные коллекции обьектов.
     * @param objectObjectMap - Словарь <Object, Object>
     */

    public void printMap(Map<Object,Object> objectObjectMap){objectObjectMap.entrySet().forEach(System.out::println);
    }
    
    /**
     * Метод вывода на экран, полученные коллекции обьектов.
     * @param laptops - вывод списка ноутбуков List<Laptop>laptops
     */
    public void printShop(List<Laptop> laptops){
        laptops.forEach(System.out::println);
    }
    
    /**
     * Метод вывода на экран, полученные коллекции обьектов.
     * @param name - вывод в консоль параметров одного ноутбука name.
     */

    public void printLaptop(Laptop name){
        name.toString();
    }
}
