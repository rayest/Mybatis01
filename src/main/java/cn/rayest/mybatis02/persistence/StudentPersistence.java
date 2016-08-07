package cn.rayest.mybatis02.persistence;

import cn.rayest.mybatis02.model.Student;

import java.util.List;

/**
 * Created by Rayest on 2016/6/24 0024.
 */

//Ó³ÉäÆ÷½Ó¿Ú
public interface StudentPersistence {
    int add(Student student);
    int update(Student student);
    int delete(Integer id);
    Student findById(Integer id);
    List<Student> find();

    Student findStudentWithAddress(Integer id);

    Student findByGradeId(Integer gradeId);
}
