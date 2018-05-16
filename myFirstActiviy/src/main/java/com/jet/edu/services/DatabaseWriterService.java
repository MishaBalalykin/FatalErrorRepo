package com.jet.edu.services;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class DatabaseWriterService {
    private ProcessEngine processEngine;

    public DatabaseWriterService() {
    }

    @Autowired
    public void setProcessEngine(ProcessEngine processEngine) {
        this.processEngine = processEngine;
    }

    public void write(Map users) {
        RuntimeService runtimeService = processEngine.getRuntimeService();
        runtimeService.startProcessInstanceByKey("myProcess", users);
    }
}
