package studentMS.dao;

import studentMS.studentfield.Student;

public interface StudentDao {

    void save(Student student);

    void studentall();

    int studentisze();

    Student find();

    Student find(String name);
}
