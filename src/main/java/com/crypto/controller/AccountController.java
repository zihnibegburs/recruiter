package com.crypto.controller;

import com.crypto.persistance.entity.Jobs;
import com.crypto.service.JobScratcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/recruiter")
public class AccountController {

    @Autowired
    JobScratcherService jobScratcherService;

    @GetMapping("/scratch")
    public void scratchJobs() {
        jobScratcherService.scratch();
    }

    @GetMapping("/jobs")
    public List<Jobs> getJobs() {
        System.out.println("Test");
        Jobs test = new Jobs();
        test.setTitle("title");
        test.setUrl("localhost:3030");
        test.setDescription("description");
        return List.of(test);
    }

}
