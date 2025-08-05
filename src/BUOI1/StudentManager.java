package BUOI1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> studentList = new ArrayList<>();

    private double averagePoint(Student student) {
        return (student.getMathPoint() + student.getLecPoint() + student.getEngPoint()) / 3;
    }

    public double getAveragePoint(Student student) { return averagePoint(student); }

    public String getStudentPerformance(Student student) {
        double averagePoint = getAveragePoint(student);
        if (averagePoint >= 8) {
            return "Xuất sắc";
        }
        else if (averagePoint >= 7) {
            return "Giỏi";
        }
        else if (averagePoint >= 6) {
            return "Khá";
        }
        else if (averagePoint >= 5) {
            return "Trung bình";
        }
        return "Yếu";
    }

    public Student inputStudent(int i) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        String address = sc.next();
        double mathPoint = sc.nextDouble();
        double lecPoint = sc.nextDouble();
        double engPoint = sc.nextDouble();
        Student student = new Student(name, address, age, mathPoint, lecPoint, engPoint);
        return student;
    }

    public void printStudent(Student student) {
        System.out.println(student.getName() + " " + student.getAge() + " " + student.getAddress() +
        " " + student.getMathPoint() + " " + student.getLecPoint() + " " + student.getEngPoint() +
        " " + getAveragePoint(student) + " " + getStudentPerformance(student));
    }
}