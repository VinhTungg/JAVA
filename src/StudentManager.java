import java.util.Scanner;

public class StudentManager {
    class StudentPerformance extends Student {
        public StudentPerformance(String name, String address, int age, int id, double mathPoint, double lecPoint, double engPoint) {
            super(name, address, age, id, mathPoint, lecPoint, engPoint);
        }

        public String getStudentPerformance() {
            double averagePoint = getAveragePoint();
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
    }
    public StudentPerformance inputStudent(int i) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        String address = sc.next();
        double mathPoint = sc.nextDouble();
        double lecPoint = sc.nextDouble();
        double engPoint = sc.nextDouble();
        StudentPerformance student = new StudentPerformance(name, address, age, i, mathPoint, lecPoint, engPoint);
        return student;
    }

    public void printStudent(StudentPerformance student) {
        System.out.println(student.getName() + " " + student.getAge() + " " + student.getAddress() +
        " " + student.getMathPoint() + " " + student.getLecPoint() + " " + student.getEngPoint() +
        " " + student.getAveragePoint() + " " + student.getStudentPerformance());
    }
}