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
    * ���Է���ǰ����
     * */
    @Before
    public void setUp(){
        sqlSession = SqlSessionFactoryUtil.openSession();
        studentPersistence = sqlSession.getMapper(StudentPersistence.class);
    }

    /**
     * ���Է��������
     * */
    @After
    public void tearDown(){
        sqlSession.close();
    }

    @Test
    public void testAdd(){
        logger.info("���ѧ��");
        Student student = new Student("Paris", 20);
        studentPersistence.add(student);
        sqlSession.commit();
    }

    @Test
    public void testUpdate(){
        logger.info("�޸�ѧ��");
        Student student = new Student(9, "Candy Pay", 22);
        studentPersistence.update(student);
        sqlSession.commit();
    }

    @Test
    public void testDelete(){
        logger.info("ɾ��ѧ��");
        studentPersistence.delete(11);
        sqlSession.commit();
    }

    @Test
    public void testFindById(){
        logger.info("ͨ��id����ѧУ��");
        Student student = studentPersistence.findById(5);
        //�����ύ��sqlSession.commit();
        System.out.println(student);
    }

    @Test
    public void testFind(){
        logger.info("��������ѧ��");
        List<Student> studentList = studentPersistence.find();
        for(Student student: studentList){
            System.out.println(student);
        }
    }
}
