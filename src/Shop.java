import java.util.*;

public class Shop extends Laptop{
    HashSet<Object> LaptopSet;
    public Shop(List<Object> ed){
        LaptopSet = new HashSet<>(Arrays.asList(ed));
    }
    public Shop(){
        LaptopSet = new HashSet<>();
    }

}
