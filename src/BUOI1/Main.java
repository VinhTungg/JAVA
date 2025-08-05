package BUOI1;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StudentManager studentManager = new StudentManager();
        for (int i = 1; i <= n; ++i) {
            studentManager.studentList.add(studentManager.inputStudent(i));
        }

        int q = scanner.nextInt();
        while (q-- > 0) {
            int stt = scanner.nextInt();
            studentManager.printStudent(studentManager.studentList.get(stt - 1));
        }
    }
}
