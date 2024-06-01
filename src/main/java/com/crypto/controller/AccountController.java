package com.crypto.controller;

import com.crypto.client.remotive.client.RemotiveClient;
import com.crypto.client.remotive.dto.RemotiveJobResponseDTO;
import com.crypto.persistance.entity.Jobs;
import com.crypto.service.JobScratcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController("/recruiter")
public class AccountController {

    @Autowired
    JobScratcherService jobScratcherService;

    @Autowired
    RemotiveClient remotiveClient;

    @GetMapping("/scratch")
    public void scratchJobs() throws IOException, InterruptedException {
        jobScratcherService.persistJobs();
    }

    @GetMapping("/dummy/jobs")
    public void geDummyJobs() throws IOException, InterruptedException {


        System.out.println("test");
    }

    @GetMapping("/jobs")
    public List<Jobs> getJobs() {
        return jobScratcherService.getJobs();
    }

}
