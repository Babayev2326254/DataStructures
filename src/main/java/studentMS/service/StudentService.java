package studentMS.service;

import studentMS.studentfield.Student;

public interface StudentService {
    void save(Student student);

    void studentall();

    void find();

    void find(String name);
}
