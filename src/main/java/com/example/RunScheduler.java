package com.example;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class RunScheduler {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job job;

    public void run() {
        try {
            String dateParam = new Date().toString();
            JobParameters params = new JobParametersBuilder()
                    .addString("date", dateParam)
                    .toJobParameters();

            System.out.println(dateParam);

            JobExecution execution = jobLauncher.run(job, params);
            System.out.println("Exit Status: " + execution.getStatus());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
