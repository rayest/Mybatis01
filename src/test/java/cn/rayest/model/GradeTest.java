package cn.rayest.model;

import cn.rayest.persistence.GradePersistence;
import cn.rayest.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by Rayest on 2016/6/24 0024.
 */
public class GradeTest {
    private SqlSession sqlSession = null;
    private GradePersistence gradePersistence = null;


    @Before
    public void setUp() {
        sqlSession = SqlSessionFactoryUtil.openSession();
        gradePersistence = sqlSession.getMapper(GradePersistence.class);
    }

    @After
    public void tearDown() {
        sqlSession.close();
    }

    @Test
    public void testFindGradeWithStudents() {
        Grade grade = gradePersistence.findById(1);
        // assertEquals("Ray", student.getName());
        System.out.println(grade);
    }
}
