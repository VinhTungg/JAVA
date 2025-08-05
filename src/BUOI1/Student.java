package BUOI1;

public class Student {
    private String name, address;
    private int age;
    private double mathPoint, lecPoint, engPoint;

    public Student(String name, String address, int age, double mathPoint, double lecPoint, double engPoint) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mathPoint = mathPoint;
        this.lecPoint = lecPoint;
        this.engPoint = engPoint;
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public int getAge() { return age; }
    public double getMathPoint() { return mathPoint; }
    public double getLecPoint() { return lecPoint; }
    public double getEngPoint() { return engPoint; }
}
