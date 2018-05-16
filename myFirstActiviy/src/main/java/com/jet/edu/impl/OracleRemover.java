package com.jet.edu.impl;

import com.jet.edu.api.Remover;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class OracleRemover implements Remover {
    private ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
    private DataSource dataSource = (DataSource) context.getBean("dataSource");
    @Override
    public void removeFromBD() {
        final String REMOVE_ALL = "TRUNCATE TABLE BALALYKIN.USERS";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(REMOVE_ALL)) {
            preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
