package com.banyuan.tankproject.controller;



import com.banyuan.tankproject.domain.DO.Login_user;
import com.banyuan.tankproject.mapper.ILoginDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author edz
 */
@Controller
public class LoginServlet extends HttpServlet {
    private InputStream in;
    private SqlSession sqlSession;
    private ILoginDao loginDao;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("============");
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        sqlSession = factory.openSession();
        loginDao = sqlSession.getMapper(ILoginDao.class);
//        从前台获取数据，封装到DO
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");
        Login_user login = new Login_user();
        login.setLogin_name(name);
        login.setPassword(pwd);

        Login_user logins = loginDao.findAll(login);

        if (logins != null) {
            HttpSession session=req.getSession();
            session.setAttribute("id",logins.getId());
            req.getRequestDispatcher("jsp/main.jsp").forward(req, resp);
        }else{
            req.getRequestDispatcher("jsp/login.jsp").forward(req, resp);
        }
        destroys();

    }


    public void destroys() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

}







