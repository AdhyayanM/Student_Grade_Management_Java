import java.util.Scanner;

public class StudentGradeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int numSubjects = sc.nextInt();

        String[] studentNames = new String[numStudents];
        String[] subjectNames = new String[numSubjects];
        int[][] marks = new int[numStudents][numSubjects];

        for (int j = 0; j < numSubjects; j++) {
            System.out.print("Enter name of subject " + (j + 1) + ": ");
            subjectNames[j] = sc.next();
        }

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = sc.next();
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter marks of " + studentNames[i] + " in " + subjectNames[j] + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nStudent Grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\n" + studentNames[i] + ":");
            for (int j = 0; j < numSubjects; j++) {
                String grade;
                int mark = marks[i][j];
                if (mark >= 90) grade = "A+";
                else if (mark >= 80) grade = "A";
                else if (mark >= 70) grade = "B";
                else if (mark >= 60) grade = "C";
                else if (mark >= 50) grade = "D";
                else grade = "F";

                System.out.println(subjectNames[j] + " - Marks: " + mark + " - Grade: " + grade);
            }
        }

        sc.close();
    }
}
