
public class Shop{
    final static String IO = "" +
            "\n1. Показать ноутбуки " +
            "\n2. Выбрать сортировку по фильтам " +
            "\n3. Выход" +
            "\n\n Ваш выбор : ";
    
    /**
     * на данном класс предоставляет интерфес пользователю, для работы с экземплярами класса лэптоп.
     */

    public Shop(){
    }

    public void Application(){
        System.out.println(IO);
    }
}
