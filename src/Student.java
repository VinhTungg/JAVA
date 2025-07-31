public class Student {
    private String name, address;
    private int age, id;
    private double mathPoint, lecPoint, engPoint;

    private double averagePoint() {
        return (mathPoint + lecPoint + engPoint) / 3;
    }

    public Student(String name, String address, int age, int id, double mathPoint, double lecPoint, double engPoint) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.id = id;
        this.mathPoint = mathPoint;
        this.lecPoint = lecPoint;
        this.engPoint = engPoint;
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public int getAge() { return age; }
    public int getId() { return id; }
    public double getMathPoint() { return mathPoint; }
    public double getLecPoint() { return lecPoint; }
    public double getEngPoint() { return engPoint; }
    public double getAveragePoint() { return averagePoint(); }
}
