package com.bvsahasrabuddhe;

class Charger
{
   private String brand ;
   private int voltage ;

    public Charger(String brand, int voltage) {
        this.brand = brand;
        this.voltage = voltage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }
}

class OS{
    private String name;
    private int size;

    public OS(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
class Mobile {
    OS os = new OS("Android", 512);
    void hasCharger(Charger c)
    {
        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());
    }
}
public class AggregationComposition {
    public static void main(String[] args) {
     Mobile  m = new Mobile();
     Charger c = new Charger("OnePlus", 25);
        System.out.println(m.os.getName());
        System.out.println(m.os.getSize());
        m.hasCharger(c);

        m= null;
        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());
    }
}
