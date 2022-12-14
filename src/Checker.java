public class Checker {
    public static boolean isInteger( Object s){
        try {
            Integer.parseInt((String) s);
        } catch (NumberFormatException e){
            System.out.println("Неверный тип значения");
            return  false;
        }
        return true;
    }

    public static boolean isDouble( Object s){
        try {
            Double.parseDouble((String) s);
        } catch (NumberFormatException e){
            System.out.println("Неверный тип значения");
            return  false;
        }
        return true;
    }
}
