package com.pm.back_end_project.controller;

import com.pm.back_end_project.dto.JobDTO;
import com.pm.back_end_project.entity.Job;
import com.pm.back_end_project.service.JobService;
import com.pm.back_end_project.utility.APIResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController //multipart data ehema use karana nisa
@RequestMapping("api/v1/job") //api versioning
@RequiredArgsConstructor //constructor through injection ekak dagannawa
@CrossOrigin
@Slf4j //meka optional ,meka dnmot -- logger neme danne  -- log
//netnm mehema dnna puluwan -- private static final Logger logger = LoggerFactory.getLogger(JobController.class);
public class JobController {

    private static final Logger logger = LoggerFactory.getLogger(JobController.class); // @Slf4j danmot meka use karanna puluwan
    private final JobService jobService;

    @PostMapping("create")
    public ResponseEntity<APIResponse<String>> createJob(@RequestBody @Valid JobDTO jobDTO) {
        //logger.info("Job created successfully"); //business logic related information
        log.info("Job created successfully"); //business logic related information

        //logger.debug("Job details is {}", jobDTO); //details of debugging info
        log.debug("Job details is {}", jobDTO); //details of debugging info

        // logger.error("Job creation failed"); //system error or faliers
        log.error("Job creation failed"); //system error or faliers

        // logger.trace("Job creation trace"); //data tracing
        log.trace("Job creation trace"); //data tracing

        // logger.warn("job creation warn"); //potential problems
        log.warn("job creation warn"); //potential problems

        jobService.saveJob(jobDTO);
        System.out.println(jobDTO.getJobTitle());
        //dn js eke if ekak dala wenas karanna wenawa logic eka created danma nisa methana
        return new ResponseEntity(new APIResponse<>(200, "create job", ""), HttpStatus.CREATED);
    }

    //get mapping 2k tiyena nisa  name damma wena wenama.ambigus mapping tiyena nisa
    @GetMapping("getall")
    public ResponseEntity<APIResponse<List<JobDTO>>> getAllJob() {
        List<JobDTO> jobDTOS = jobService.getAllJob();
        //sampurna responce entity ekama return kara
        return ResponseEntity.ok(new APIResponse<>(200, "job list fetched successfully", jobDTOS));
    }

    @PutMapping("update")
    public ResponseEntity<APIResponse<String>> updateJob(@RequestBody @Valid Job job) {
        jobService.updateJob(job);
        System.out.println(job.getJobTitle());
        return ResponseEntity.ok(new APIResponse<>(200, "update job", ""));
    }

    //    industry eke delete mapping use wenawa adui
    @DeleteMapping("delete/{id}")
    public String deleteJob(@PathVariable("id") String jobId) {
        jobService.deleteJob(jobId);
        return "Job deleted successfully";
    }

    //full object ekama update wenne neti nisai patch mapping ekak gatte
    @PatchMapping("status/{id}")
    public ResponseEntity<APIResponse<List<String>>> updateJobStatus(@PathVariable("id") String jobId, @RequestBody Map<String, String> body) {
        String status = body.get("status");
        jobService.updateJobStatus(jobId, status);
        return ResponseEntity.ok(new APIResponse<>(200, "update job status successfully", null));
    }

    @GetMapping("search/{keyword}")
    public ResponseEntity<APIResponse<List<JobDTO>>> searchJob(@PathVariable("keyword") String keyword) {
        List<JobDTO> jobByJobTitle = jobService.getJobByJobTitle(keyword);

        if (jobByJobTitle == null || jobByJobTitle.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new APIResponse<>(404, "No job found for keyword: " + keyword, null));
        }
        return ResponseEntity.ok(new APIResponse<>(200, "job searched successfully", jobByJobTitle));
    }
}
