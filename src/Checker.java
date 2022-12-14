public class Checker {
    /**
     * Метод проверки содержимого обьекта, обобщенного классом (Стринг). проверяет является ли объект целым числом.
     * @param s - объект переданные на проверку принадлежности к определенному числовому классу.
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
    
    /**
     * Метод проверки содержимого обьекта, обобщенного классом (Стринг). проверяет является ли объект вещественным числом.
     * @param s - объект переданные на проверку принадлежности к определенному числовому классу.
     * @return - ложь или истина
     */
    public static boolean isDouble( Object s){
        try {
            Double.parseDouble((String) s);
        } catch (NumberFormatException e){
            System.out.println("Неверный тип значения");
            return  false;
        }
        return true;
    }
    
    /**
     * Метод проверки актуальности ввода значения фильтра пользователем.
     * @param obj - поле фильтрации ноутбуков.
     * @param newValue - минимальное значение фильтрации.
     * @return - истина или ложь.
     */
    public static boolean isTrue(Object obj, String newValue){
        String field = (String) obj;
        if (field.equalsIgnoreCase("brand") ||
                field.equalsIgnoreCase("color") ||
                field.equalsIgnoreCase("operatingSystem")){
            if (!Checker.isInteger(newValue) && !Checker.isDouble(newValue)) return true;
        } else if (field.equalsIgnoreCase("frequency")) {
            if(Checker.isDouble(newValue)) return true;
        } else {
            if (Checker.isInteger(newValue)) return true;
        }
        return false;
    }
}
