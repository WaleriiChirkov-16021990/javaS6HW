import java.util.*;

public class Printer {

    public void printHashSet(HashSet<Object> hashSet){
        hashSet.forEach(System.out::println);
    }
    public void printCollection(Collection<Object> object){
        object.forEach(System.out::println);
    }
    public void printArray(Object[] array){
        System.out.println(Arrays.toString(array));
    }

    public void printList(List<Object> list) {
        System.out.println(list);
    }

    public void printMap(Map<Object,Object> objectObjectMap){objectObjectMap.entrySet().forEach(System.out::println);
    }

    public void printShop(List<Laptop> laptops){
        laptops.forEach(System.out::println);
    }

    public void printLaptop(Laptop name){
        name.toString();
    }
}
