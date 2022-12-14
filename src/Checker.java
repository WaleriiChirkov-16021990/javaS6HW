public class Checker {
    public static boolean isInteger( String s){
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e){
            return  false;
        }
        return true;
    }

    public static boolean isDouble( String s){
        try {
            Double.parseDouble(s);
        } catch (NumberFormatException e){
            return  false;
        }
        return true;
    }
}
