package com.jet.edu.impl;

import com.jet.edu.api.Writer;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BpmnWriter implements JavaDelegate {
    private ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Writer writer = context.getBean("oracleWriter", OracleWriter.class);
        writer.write(delegateExecution.getVariables());
    }
}
