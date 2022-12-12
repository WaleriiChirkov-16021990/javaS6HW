import java.util.*;

public class Shop {
    HashSet<Object> Laptop;
    public Shop(List<Object> ed){
        Laptop = new HashSet<>(ed);
    }


    public Map<String, Object> getCriteriy(Scanner scanner){
        Map<Integer, String> Criteriy = new HashMap<>();
        Criteriy.put(0, "brand");
        Criteriy.put(1, "RAM");
        Criteriy.put(2, "HDDCapacity");
        Criteriy.put(3, "operatingSystem");
        Criteriy.put(4, "color");
        Criteriy.put(5, "numberOfCores");
        Criteriy.put(6, "frequency");
        Criteriy.put(7, "screenResolution");
        Criteriy.put(8, "diagonal");
        Criteriy.put(9, "videoMemoryCapacity");
        System.out.println(Criteriy);
        System.out.print("Выберети фильтр цифрой ( можно несколько через пробел ) : ");
        String[] input = scanner.nextLine().split(" ");
        Map<String, Object> inputCategory = new HashMap<>();
        String filter;
        for (String s:
                input) {
            System.out.printf("Введите значение по %s \n", Criteriy.get(Integer.parseInt(s)));
            filter = scanner.nextLine();
            inputCategory.put(Criteriy.get(s), filter);
        }
        return inputCategory;
    }

}
