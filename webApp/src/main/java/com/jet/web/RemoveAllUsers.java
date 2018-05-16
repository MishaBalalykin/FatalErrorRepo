package com.jet.web;

import com.jet.edu.services.DatabaseReaderService;
import com.jet.edu.services.DatabaseRemoverService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/removeUsers")
public class RemoveAllUsers extends HttpServlet {
    private ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
    private DatabaseRemoverService dbRemover = context.getBean("databaseRemoverService", DatabaseRemoverService.class);

    //    DBRemover dbRemover = new OracleRemover();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        dbRemover.removeFromOracleBD();
        req.getRequestDispatcher("UsersRemoved.jsp").forward(req, resp);
    }
}
