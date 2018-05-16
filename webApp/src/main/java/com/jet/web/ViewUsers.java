package com.jet.web;


import com.jet.edu.services.DatabaseReaderService;
import com.jet.edu.services.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/viewUsers")
public class ViewUsers extends HttpServlet {
    private static List<User> users;
//    private ClassPathXmlApplicationContext context;
//    private DBReader dbReader;

    public ViewUsers() {
        /*context = new ClassPathXmlApplicationContext("applicationContext.xml");
        dbReader = (DBReader) context.getBean("oracleReader");*/
    }

    public static List<User> getUsers() {
        return users;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        DatabaseReaderService dbReader = context.getBean("databaseReaderService", DatabaseReaderService.class);
//        DatabaseReaderService dbReader = new DatabaseReaderService();
        users = dbReader.readFromOracleBD();
        req.setAttribute("users", users);
        req.getRequestDispatcher("ViewUser.jsp").forward(req, resp);
    }
}
