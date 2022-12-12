import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

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
}
