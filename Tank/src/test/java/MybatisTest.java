
import com.tank.domain.DO.Experience;
import com.tank.mapper.IExperienceDao;
import com.tank.mapper.ILoginDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class MybatisTest {
    private InputStream in;
    private SqlSession sqlSession;
    private IExperienceDao experienceDao;
    private ILoginDao loginDao;

    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        sqlSession = factory.openSession();
        experienceDao = sqlSession.getMapper(IExperienceDao.class);
        loginDao= sqlSession.getMapper(ILoginDao.class);
    }

    @After
    public void destroy() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }


//    @Test
//    public void testQuery(){
//        List<Login_user> logins=loginDao.findAll();
//        for (Login_user login:logins) {
//            System.out.println(login);
//        }
//    }
    @Test
    public void testSavew(){
        Experience experience=new Experience();
        experience.setProject_name("mayunyun");
        experience.setProject_url("dddd");
        experience.setBegin_time("1992-3-3");
        experience.setEnd_time("1999-2-2");
        experience.setProject_describe("scdhcjsbiwb");
        experience.setAchievement("4eueueueuei");
        experience.setUser_id(1);
        experience.setDelete_status(3);
        experienceDao.saveExperience(experience);
    }

}
