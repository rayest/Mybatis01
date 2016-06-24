package cn.rayest.persistence;

import cn.rayest.model.Student;

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
}
