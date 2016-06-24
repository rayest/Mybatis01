package cn.rayest.model;

import cn.rayest.persistence.StudentPersistence;
import cn.rayest.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


/**
 * Created by Rayest on 2016/6/24 0024.
 */
public class StudentTest {
    private static Logger logger = Logger.getLogger(StudentTest.class);
    private SqlSession sqlSession = null;
    private StudentPersistence studentPersistence = null;

    /**
    * 测试方法前调用
     * */
    @Before
    public void setUp(){
        sqlSession = SqlSessionFactoryUtil.openSession();
        studentPersistence = sqlSession.getMapper(StudentPersistence.class);
    }

    /**
     * 测试方法后调用
     * */
    @After
    public void tearDown(){
        sqlSession.close();
    }

    @Test
    public void testAdd(){
        logger.info("添加学生");
        Student student = new Student("Paris", 20);
        studentPersistence.add(student);
        sqlSession.commit();
    }

    @Test
    public void testUpdate(){
        logger.info("修改学生");
        Student student = new Student(9, "Candy Pay", 22);
        studentPersistence.update(student);
        sqlSession.commit();
    }

    @Test
    public void testDelete(){
        logger.info("删除学生");
        studentPersistence.delete(11);
        sqlSession.commit();
    }

    @Test
    public void testFindById(){
        logger.info("通过id查找学校生");
        Student student = studentPersistence.findById(5);
        //不用提交：sqlSession.commit();
        System.out.println(student);
    }

    @Test
    public void testFind(){
        logger.info("查找所有学生");
        List<Student> studentList = studentPersistence.find();
        for(Student student: studentList){
            System.out.println(student);
        }
    }
}
