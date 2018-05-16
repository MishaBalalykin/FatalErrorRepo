package com.jet.edu.services;

import com.jet.edu.api.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseReaderService {
    private Reader reader;

    public List<User> readFromOracleBD() {
        List<User> users = new ArrayList<>();
        //com.jet.edu.services.DatabaseReaderService reader = new com.jet.edu.services.DatabaseReaderService();
        users = reader.readFromBD();
        return users;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }
}