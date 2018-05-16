package com.jet.edu.services;

import com.jet.edu.api.Remover;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseRemoverService {

    private Remover remover;

    @Autowired
    public void setRemover(Remover remover) {
        this.remover = remover;
    }

    public void removeFromOracleBD() {
        remover.removeFromBD();
    }
}
