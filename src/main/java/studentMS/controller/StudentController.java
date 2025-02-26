package studentMS.controller;

import studentMS.service.StudentServiceImpl;
import studentMS.studentfield.Student;

import java.util.Scanner;

public class StudentController {

    Scanner scanner = new Scanner(System.in);
    StudentServiceImpl studentService = new StudentServiceImpl();
    Student student = new Student();
    String name;


    public void console() {
        while (true) {
            System.out.println("Welcome Studen MAnagment System");
            System.out.println("""
                    1.Student add
                    2.Student find id
                    3.Student find name
                    4.Student all
                    """);
            int choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    addStudent();
                    studentService.save(student);
                    break;
                case 2:
                    studentService.find();
                    break;
                case 3:
                    studentService.find(name);
                case 4:
                    studentService.studentall();
                    break;
                default:
                    System.out.println("Exit");
            }

        }
    }

    public void addStudent() {
        System.out.println("ID enter");
        student.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Name enter");
        student.setName(scanner.nextLine());
        System.out.println("Age enter");
        student.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Grade enter");
        student.setGrade(scanner.nextDouble());
    }

}
