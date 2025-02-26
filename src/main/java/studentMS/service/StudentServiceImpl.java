package studentMS.service;

import studentMS.dao.StudentDaoImpl;
import studentMS.studentfield.Student;

public class StudentServiceImpl implements StudentService {
    StudentDaoImpl studentDao = new StudentDaoImpl();


    @Override
    public void save(Student student) {
        if (student.getId() != 1) {
            if (student.getId() == studentDao.studentisze() + 1) {
                studentDao.save(student);
            } else {
                System.out.println("This id number have chance number ");
            }
        } else {
            studentDao.save(student);
        }
    }


    @Override
    public void find() {
        if (studentDao.getStudentList() != null && !studentDao.getStudentList().isEmpty()) {
            studentDao.find();
        }
    }

    @Override
    public void find(String name) {
        if (studentDao.getStudentList() != null && !studentDao.getStudentList().isEmpty()) {
            studentDao.find(name);
        }
    }

    @Override
    public void studentall() {
        studentDao.studentall();
    }
}
