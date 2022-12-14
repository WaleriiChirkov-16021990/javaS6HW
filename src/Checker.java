public class Checker {
    /**
     * Класс проверки содержимого обьекта, обобщенного классом (Стринг).
     * @param s - объект переданные на проверку принадлежности к определенному числовому классую
     * @return - ложь или истина
     */
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
