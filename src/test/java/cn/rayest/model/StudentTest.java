package cn.rayest.model;

import cn.rayest.persistence.GradePersistence;
import cn.rayest.persistence.StudentPersistence;
import cn.rayest.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * Created by Rayest on 2016/6/24 0024.
 */
public class StudentTest {
    private SqlSession sqlSession = null;
    private StudentPersistence studentPersistence = null;
    private GradePersistence gradePersistence = null;

    @Before
    public void setUp() {
        sqlSession = SqlSessionFactoryUtil.openSession();
        studentPersistence = sqlSession.getMapper(StudentPersistence.class);
        gradePersistence = sqlSession.getMapper(GradePersistence.class);
    }

    @After
    public void tearDown() {
        sqlSession.close();
    }

    @Test
    public void testAdd() {
        Student student = new Student("Paris", 20);
        studentPersistence.add(student);
        sqlSession.commit();
    }

    @Test
    public void testUpdate() {
        Student student = new Student(9, "Candy Pay", 22);
        studentPersistence.update(student);
        sqlSession.commit();
    }

    @Test
    public void testDelete() {
        studentPersistence.delete(11);
        sqlSession.commit();
    }

    @Test
    public void testFindById() {
        Student student = studentPersistence.findById(5);
        assertEquals("Pay", student.getName());
        // sqlSession.commit();
        System.out.println(student);
    }

    @Test
    public void testFind() {
        List<Student> studentList = studentPersistence.find();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Test
    public void testFindStudentWithAddress() {
        Student student = studentPersistence.findStudentWithAddress(1);
        // assertEquals("Ray", student.getName());
        System.out.println(student);
    }

    @Test
    public void testFindGradeWithStudents() {
        Grade grade = gradePersistence.findById(2);
        System.out.println(grade);
    }

    @Test
    public void testFindStudentWithGrade() {
        Student student = studentPersistence.findStudentWithAddress(2);
        // assertEquals("Ray", student.getName());
        System.out.println(student);
    }
}
