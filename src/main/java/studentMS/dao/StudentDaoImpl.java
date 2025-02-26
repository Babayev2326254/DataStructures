package studentMS.dao;

import studentMS.studentfield.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDaoImpl implements StudentDao {
    List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public void save(Student student) {
        studentList.add(student);
    }

    @Override
    public void studentall() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }

    @Override
    public int studentisze() {
        return studentList.size();
    }

    @Override
    public Student find() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the student index to find:");
        int find = scanner.nextInt();
        if (find >= 0 && find < studentList.size()) {
            Student findst = studentList.get(find);
            return findst;
        } else {
            System.out.println("Invalid index. No student found at this index.");
            return null;
        }
    }

    @Override
    public Student find(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the student name to find:");
        String find = scanner.nextLine();
        for (Student student : studentList) {
            if (student.getName().equalsIgnoreCase(find)) {
                return student;
            }
        }
        return null;
    }
}
