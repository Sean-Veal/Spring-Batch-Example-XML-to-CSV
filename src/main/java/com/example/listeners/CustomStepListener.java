package com.example.listeners;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class CustomStepListener implements StepExecutionListener {

    public void beforeStep(StepExecution stepExecution) {
        System.out.println("Step Execution Listener - before step");
    }

    public ExitStatus afterStep(StepExecution stepExecution) {
        System.out.println("Step Execution Listener - after step");
        return null;
    }
}
