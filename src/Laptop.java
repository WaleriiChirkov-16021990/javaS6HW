
import java.util.Random;


/**
 * Класс описывает ноутбуки
 */
public class Laptop {
    private int ID;
    private String brand;
    private int RAM;
    private int HDDCapacity;
    private String operatingSystem;
    private String color;
    private int numberOfCores;
    private double frequency;
    private int screenResolution;
    private int diagonal;
    private int videoMemoryCapacity;
    private int price;
    private int discount;
    private int quantity;
    
    /**
     *
     * @param IDs - ИД ноутбука
     * @param Brands - Брэнд производителя ноутбука
     * @param RAMs - размер оперативной памяти в ГБ.
     * @param HDDCapacitys - объём жёсткого диска в ГБ.
     * @param operatingSystems - операционная система
     * @param colors - цвет корпуса ноутбука
     * @param numberOfCoress - количество ядер (шт.)
     * @param frequencys - тактовая частота ядра (ГГц)
     * @param screenResolutions - разрешение экрана (всего пикс.)
     * @param diagonals - диагональ экрана в дюймах
     * @param videoMemoryCapacitys - объём видеопамяти в ГБ.
     * @param prices - цена в рублях.
     * @param discounts - максимальная скидка от цены в рублях. (%)
     * @param quantitys - остаток на складе ( шт.)
     */


    
    public Laptop(int IDs ,String Brands, int RAMs, int HDDCapacitys, String operatingSystems, String colors, int numberOfCoress, double frequencys, int screenResolutions, int diagonals, int videoMemoryCapacitys, int prices, int discounts, int quantitys){
        if(IDs > 0) ID = IDs;
        else {
            Random rnd = new Random();
            ID = rnd.nextInt(1000, 100000);
        }
        brand = Brands;
        if(RAMs > 0)RAM = RAMs;
        else RAM = 0;
        if(HDDCapacitys > 0)HDDCapacity = HDDCapacitys;
        else HDDCapacity = 0;
        operatingSystem = operatingSystems;
        color = colors;
        numberOfCores = numberOfCoress;
        frequency = frequencys;
        screenResolution = screenResolutions;
        diagonal = diagonals;
        videoMemoryCapacity = videoMemoryCapacitys;
        price = prices;
        discount = discounts;
        quantity = quantitys;
    }
    
    public Laptop(){
        Random rnd = new Random();
        ID = rnd.nextInt(-1000, 0);
        brand = "None";
        RAM = 0;
        HDDCapacity = 0;
        operatingSystem = "None";
        color = "None";
        numberOfCores = 0;
        frequency = 0.0;
        screenResolution = 0;
        diagonal = 0;
        videoMemoryCapacity = 0;
        price = 0;
        discount = 0;
        quantity = 0;
    }

    @Override
    public String toString() {
        return String.format("\nИД : %d\n Бренд : %s\n Оперативная память : %d Гб.\n Объём жестког диска : %d Гб.\n Операционная система : %s\n Цвет : %s\n Количество ядер : %d\n Тактовая частота : %s Гц.\n Разрешение Экрана : %d пикс.\n Диагональ : %d дюймов\n Объём видеопамяти : %d Гб. \n Цена за 1 модель : %d рублей \n Максимально допустимая скидка : %d \n Остаток на складе : %d штук(а)\n", ID, brand,RAM,
                HDDCapacity, operatingSystem, color, numberOfCores, frequency, screenResolution, diagonal, videoMemoryCapacity, price, discount, quantity);
    }

    @Override
    public boolean equals(Object object) {
        Laptop obj = (Laptop) object;
        if(obj.ID > 0){
            if (this.ID < obj.ID) return false;
        }
        if (!obj.brand.equalsIgnoreCase("none")){
            if (!this.brand.equalsIgnoreCase(obj.brand)) return false;
        }
        if (obj.RAM > 0){
            if (this.RAM < obj.RAM ) return false;
        }
        if (obj.HDDCapacity > 0){
            if (this.HDDCapacity < obj.HDDCapacity) return false;
        }
        if (!obj.operatingSystem.equalsIgnoreCase("none")){
            if (!this.operatingSystem.equalsIgnoreCase(obj.operatingSystem)) return false;
        }
        if (!obj.color.equalsIgnoreCase("none")){
            if (!this.color.equalsIgnoreCase(obj.color)) return false;
        }
        if (obj.numberOfCores > 0){
            if (this.numberOfCores < obj.numberOfCores) return false;
        }
        if (obj.frequency > 0){
            if (this.frequency < obj.frequency) return false;
        }
        if (obj.screenResolution > 0){
            if (this.screenResolution < obj.screenResolution) return false;
        }
        if (obj.diagonal > 0){
            if (this.diagonal < obj.diagonal) return false;
        }
        if (obj.videoMemoryCapacity > 0){
            if (this.videoMemoryCapacity < obj.videoMemoryCapacity) return false;
        }
        if (obj.price > 0){
            if (this.price < obj.price) return false;
        }
        if (obj.discount > 0){
            if (this.discount < obj.discount) return false;
        }
        if (obj.quantity > 0){
            if (this.quantity < obj.quantity) return false;
        }
        return true;
    }

    public void setParams(int IDs,
                          String Brands,
                          int RAMs,
                          int HDDCapacitys,
                          String operatingSystems,
                          String colors,
                          int numberOfCoress,
                          double frequencys,
                          int screenResolutions,
                          int diagonals,
                          int videoMemoryCapacitys,
                          int prices,
                          int discounts,
                          int quantitys){
        if(IDs > 0) ID = IDs;
        else {
            Random rnd = new Random();
            ID = rnd.nextInt(1000, 100000);
        }
        brand = Brands;
        if(RAMs > 0)RAM = RAMs;
        else RAM = 0;
        if(HDDCapacitys > 0)HDDCapacity = HDDCapacitys;
        else HDDCapacity = 0;
        operatingSystem = operatingSystems;
        color = colors;
        numberOfCores = numberOfCoress;
        frequency = frequencys;
        screenResolution = screenResolutions;
        diagonal = diagonals;
        videoMemoryCapacity = videoMemoryCapacitys;
        price = prices;
        discount = discounts;
        quantity = quantitys;
    }

    public void setParam(String param, Object object){
        if(param.equalsIgnoreCase("ram"))  {
            if(Checker.isInteger(object)) {
                RAM = Integer.parseInt((String) object);
            }
        } else if (param.equalsIgnoreCase("id")) {
            if(Checker.isInteger(object)) {
                ID = Integer.parseInt((String) object);
            }
        } else if (param.equalsIgnoreCase("brand")) {
                brand = (String) object;
        } else if (param.equalsIgnoreCase("hddcapacity")) {
            if(Checker.isInteger(object)) {
                HDDCapacity = Integer.parseInt((String) object);
            }
        } else if (param.equalsIgnoreCase("operatingsystem")){
            this.operatingSystem = (String) object;
        } else if (param.equalsIgnoreCase("color")) {
            color = (String) object;
        } else if (param.equalsIgnoreCase("numberofcores")) {
            if(Checker.isInteger(object)) {
                numberOfCores = Integer.parseInt((String) object);
            }
        } else if (param.equalsIgnoreCase("frequency")) {
            if(Checker.isDouble(object)) {
                frequency = Double.parseDouble((String) object);
            }
        } else if (param.equalsIgnoreCase("screenresolution")) {
            if(Checker.isInteger(object)) {
                screenResolution = Integer.parseInt((String) object);
            }
        } else if (param.equalsIgnoreCase("diagonal")) {
            if(Checker.isInteger(object)) {
                diagonal = Integer.parseInt((String) object);
            }
        } else if (param.equalsIgnoreCase("videomemorycapacity")) {
            if(Checker.isInteger(object)) {
                videoMemoryCapacity = Integer.parseInt((String) object);
            }
        } else if (param.equalsIgnoreCase("price")) {
            if(Checker.isInteger(object)) {
                price = Integer.parseInt((String) object);
            }
        } else if (param.equalsIgnoreCase("discount")){
            if(Checker.isInteger(object)) {
                discount = Integer.parseInt((String) object);
            }
        } else if (param.equalsIgnoreCase("quantity")) {
            if(Checker.isInteger(object)) {
                quantity = Integer.parseInt((String) object);
            }
        } else {
            System.out.println("Нет такого параметррра.");
        }
    }

// рабочий геттер, но не успел написать применение, а конкретно по заданию он не нужен.
//    public Object GetterParam(String param){
//        if(param.equals("RAM")) return this.RAM;
//        else if (param.equalsIgnoreCase("id")) {
//            return this.ID;
//        } else if (param.equalsIgnoreCase("brand")) {
//            return this.brand;
//        } else if (param.equalsIgnoreCase("hddcapacity")) {
//            return (Integer) this.HDDCapacity;
//        } else if (param.equalsIgnoreCase("operatingsystem")){
//            return this.operatingSystem;
//        } else if (param.equalsIgnoreCase("color")) {
//            return this.color;
//        } else if (param.equalsIgnoreCase("numberofcores")) {
//            return this.numberOfCores;
//        } else if (param.equalsIgnoreCase("frequency")) {
//            return  this.frequency;
//        } else if (param.equalsIgnoreCase("screenresolution")) {
//            return  this.screenResolution;
//        } else if (param.equalsIgnoreCase("diagonal")) {
//            return this.diagonal;
//        } else if (param.equalsIgnoreCase("videomemorycapacity")) {
//            return this.videoMemoryCapacity;
//        } else if (param.equalsIgnoreCase("price")) {
//            return  this.price;
//        } else if (param.equalsIgnoreCase("discount")){
//            return this.discount;
//        } else if (param.equalsIgnoreCase("quantity")) {
//            return this.quantity;
//        }
//        System.out.println("Нет такого параметррра.");
//        return false;
//    }




}
