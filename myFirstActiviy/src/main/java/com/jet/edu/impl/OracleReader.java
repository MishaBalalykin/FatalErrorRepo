package com.jet.edu.impl;

import com.jet.edu.api.Reader;
import com.jet.edu.services.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class OracleReader implements Reader {
    private ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
    private DataSource dataSource = (DataSource) context.getBean("dataSource");

    @Override
    public List<User> readFromBD() {
        List<User> users = new ArrayList<>();
        final String GET_ALL = "SELECT * FROM BALALYKIN.USERS";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                users.add(new User(resultSet.getString("FIRSTNAME"),
                        resultSet.getString("SURNAME"), resultSet.getString("AGE")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}
