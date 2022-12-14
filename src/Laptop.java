import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * Это класс ноутбуков
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
     * описываем сущность ноутбуков
     *
     *
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
        if(param.equalsIgnoreCase("ram"))  this.RAM = (Integer) object;
        else if (param.equalsIgnoreCase("id")) {
            this.ID = (Integer) object;
        } else if (param.equalsIgnoreCase("brand")) {
            this.brand = (String) object;
        } else if (param.equalsIgnoreCase("hddcapacity")) {
            this.HDDCapacity = (Integer) object;
        } else if (param.equalsIgnoreCase("operatingsystem")){
            this.operatingSystem = (String) object;
        } else if (param.equalsIgnoreCase("color")) {
            this.color = (String) object;
        } else if (param.equalsIgnoreCase("numberofcores")) {
            this.numberOfCores = (Integer) object;
        } else if (param.equalsIgnoreCase("frequency")) {
            this.frequency = (Double) object;
        } else if (param.equalsIgnoreCase("screenresolution")) {
            this.screenResolution = (Integer) object;
        } else if (param.equalsIgnoreCase("diagonal")) {
            this.diagonal = (Integer) object;
        } else if (param.equalsIgnoreCase("videomemorycapacity")) {
            this.videoMemoryCapacity = (Integer) object;
        } else if (param.equalsIgnoreCase("price")) {
            this.price = (Integer) object;
        } else if (param.equalsIgnoreCase("discount")){
            this.discount = (Integer) object;
        } else if (param.equalsIgnoreCase("quantity")) {
            this.quantity = (Integer) object;
        } else {
            System.out.println("Нет такого параметррра.");
        }
    }


    public Object GetterParam(String param){
        if(param.equals("RAM")) return this.RAM;
        else if (param.equalsIgnoreCase("id")) {
            return this.ID;
        } else if (param.equalsIgnoreCase("brand")) {
            return this.brand;
        } else if (param.equalsIgnoreCase("hddcapacity")) {
            return (Integer) this.HDDCapacity;
        } else if (param.equalsIgnoreCase("operatingsystem")){
            return this.operatingSystem;
        } else if (param.equalsIgnoreCase("color")) {
            return this.color;
        } else if (param.equalsIgnoreCase("numberofcores")) {
            return this.numberOfCores;
        } else if (param.equalsIgnoreCase("frequency")) {
            return  this.frequency;
        } else if (param.equalsIgnoreCase("screenresolution")) {
            return  this.screenResolution;
        } else if (param.equalsIgnoreCase("diagonal")) {
            return this.diagonal;
        } else if (param.equalsIgnoreCase("videomemorycapacity")) {
            return this.videoMemoryCapacity;
        } else if (param.equalsIgnoreCase("price")) {
            return  this.price;
        } else if (param.equalsIgnoreCase("discount")){
            return this.discount;
        } else if (param.equalsIgnoreCase("quantity")) {
            return this.quantity;
        }
        System.out.println("Нет такого параметррра.");
        return false;
    }




}
