package com.bvsahasrabuddhe;

class   Bike
{
    private String brand;
    private int milage;

    public Bike(String brand, int milage) {
        this.brand = brand;
        this.milage = milage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }
}
class Book
{
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
class Heart{
    private float weight;
    private int bpm;

    public Heart(float weight, int bpm) {
        this.weight = weight;
        this.bpm = bpm;
    }
}
class Brain{

    private float weight;
    private String color;

    public Brain(float weight, String color) {
        this.weight = weight;
        this.color = color;
    }
}
class Student
{
    Heart h = new Heart(232, 72);
    Brain b = new Brain(1400, "Gray");

    void hasA(Bike b){
        System.out.println(b.getBrand());
        System.out.println(b.getMilage());
    }
    void hasA(Book bo)
    {
        System.out.println(bo.getName());
        System.out.println(bo.getAuthor());
    }

}
public class AgreegationCompositionEx2 {
    public static void main(String[] args) {
        Student s = new Student();
        Bike b = new Bike("Java", 35);
    }
}
