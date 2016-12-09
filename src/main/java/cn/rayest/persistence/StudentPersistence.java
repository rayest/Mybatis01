package cn.rayest.persistence;

import cn.rayest.model.Student;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * Created by Rayest on 2016/6/24 0024.
 */

public interface StudentPersistence {
    int add(Student student);

    int update(Student student);

    int delete(Integer id);

    Student findById(Integer id);

    List<Student> find();

    Student findStudentWithAddress(Integer id);

    Student findByGradeId(Integer gradeId);

    List<Student> searchStudents(Map<String, Object> map);

    List<Student> searchStudents2(Map<String, Object> map);

    List<Student> searchStudents3(Map<String, Object> map);

    List<Student> searchStudents5(Map<String, Object> map);

    void updateStudent(Student student);

    void insertStudent(Student student);

    Student getStudentById(int i);

    List<Student> findStudents(RowBounds rowBounds);

    List<Student> findStudents2(Map<String, Object> map);
}
