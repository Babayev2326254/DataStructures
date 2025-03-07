package ManytoMany;

import java.util.Scanner;

import static ManytoMany.StudentCourseViewer.showAllStudentsWithCourses;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Yeni tələbə əlavə et");
            System.out.println("2. Yeni kurs əlavə et");
            System.out.println("3. Tələbəni kursa yaz");
            System.out.println("4.Bütün telebeleri göstər");
            System.out.println("5. Çıxış");
            System.out.print("Seçim edin: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Tələbə adı: ");
                    String studentName = scanner.nextLine();
                    StudentCourseManager.addStudent(studentName);
                    break;
                case 2:
                    System.out.print("Kurs adı: ");
                    String courseTitle = scanner.nextLine();
                    StudentCourseManager.addCourse(courseTitle);
                    break;
                case 3:
                    System.out.print("Tələbə ID: ");
                    int studentId = scanner.nextInt();
                    System.out.print("Kurs ID: ");
                    int courseId = scanner.nextInt();
                    StudentCourseManager.enrollStudentInCourse(studentId, courseId);
                    break;
                case 4:
                    showAllStudentsWithCourses();
                    return;
                case 5:
                    System.out.println("Çıxış edilir...");
                    scanner.close();
                default:
                    System.out.println("Yanlış seçim. Yenidən cəhd edin.");
            }
        }
    }
}

