package com.pm.back_end_project.controller;

import com.pm.back_end_project.dto.JobDTO;
import com.pm.back_end_project.service.JobService;
import com.pm.back_end_project.service.impl.JobServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/job")
@RequiredArgsConstructor //constructor through injection ekak dagannawa
public class JobController {

    private final JobService jobService;

    @PostMapping("create")
    public String createJob(@RequestBody JobDTO jobDTO) {
        jobService.saveJob(jobDTO);
        System.out.println(jobDTO.getJobTitle());
        return "create job";
    }

    //get mapping 2k tiyena nisa  name damma wena wenama.ambigus mapping tiyena nisa
    @GetMapping("getall")
    public String getAllJob() {
        return "get all job";
    }

    @PutMapping("update")
    public String updateJob() {
        return "update job";
    }

    //industry eke delete mapping use wenawa adui
    @DeleteMapping("delete")
    public String deleteJob() {
        return "delete job";
    }

    @PutMapping("changestatus")
    public String updateJoStatus() {
        return "update job status";
    }

    @GetMapping("search")
    public String searchJob() {
        return "search job";
    }
}
