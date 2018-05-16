package com.jet.edu.api;

import com.jet.edu.services.User;

import java.util.List;

public interface Reader {
    List<User> readFromBD();
}
