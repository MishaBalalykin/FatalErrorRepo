package com.jet.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/addUser")
public class AddUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("AddUser.jsp").forward(req, resp);
    }
}
/* C:\Users\mr.balalykin\Downloads\CommonTestSiriusRepo\myFirstActiviy\out\artifacts\myFirstActiviy_jar
mvn install:install-file -Dfile=C:\Users\mr.balalykin\Downloads\CommonTestSiriusRepo\myFirstActiviy\target\myFirstActiviy-1.0-SNAPSHOT.jar -DpomFile=C:\Users\mr.balalykin\Downloads\CommonTestSiriusRepo\myFirstActiviy\pom.xml
mvn install:install-file -Dfile=C:\Users\mr.balalykin\Downloads\CommonTestSiriusRepo\myFirstActiviy\out\artifacts\myFirstActiviy_jar\myFirstActiviy.jar -DpomFile=C:\Users\mr.balalykin\Downloads\CommonTestSiriusRepo\myFirstActiviy\pom.xml*/