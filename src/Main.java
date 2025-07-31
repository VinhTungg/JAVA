import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<StudentManager.StudentPerformance> studentList = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            StudentManager.StudentPerformance newStudent = new StudentManager().inputStudent(i);
            studentList.add(newStudent);
        }

        int q = scanner.nextInt();
        while (q-- > 0) {
            int stt = scanner.nextInt();
            for (int i = 1; i <= n; ++i) {
                if (i == stt) {
                    StudentManager manager = new StudentManager();
                    manager.printStudent(studentList.get(i - 1));
                }
            }
        }
    }
}
