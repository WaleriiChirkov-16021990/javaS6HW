import java.util.*;

public class Filter extends Laptop {
    public Map<Object, Object> getCriteriy(Scanner scanner){
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
        Map<Object, Object> inputCategory = new HashMap<>();
        String filter;
        for (String s:
                input) {
            System.out.printf("Введите значение по %s \n", Criteriy.get(Integer.parseInt(s)));
            filter = scanner.nextLine();
            getCritery.setParam(s, filter);
//            try {
//                Double.parseDouble(filter);
//            } catch (NumberFormatException e) {
//                try{
//                    Integer.parseInt(filter);
//                } catch (NumberFormatException ex){
//
//                    }
//                }

            inputCategory.put(Criteriy.get(Integer.parseInt(s)), filter);
        }
        return inputCategory;
    }
//    public HashSet<Object> getFilterObject(List<Laptop> object, Map<Object,Object> category){
//        HashSet<Object> result = new HashSet<>();
//        for (Map.Entry<Object, Object> entry: category.entrySet()
//             ) {
//            String key = (String) entry.getKey();
//            System.out.println(key);
//            Object value = entry.getValue();
//            System.out.println(value);
//            for (Laptop s: object
//                 ) {
//                System.out.println(s.GetterParam(key) == value);
//                System.out.println(s.GetterParam(key).getClass().getName());
//                if ( s.GetterParam(key).equals(value) ){
//                    result.add(s);
//                }
//                if (result.size() > 0){
//                    for (Object obj: result
//                         ) {
//                        if (s.GetterParam(key) != value){
//                            result.remove(obj);
//                        }
//                    }
//                }
//            }
//        }
//        return result;
//    }
}
