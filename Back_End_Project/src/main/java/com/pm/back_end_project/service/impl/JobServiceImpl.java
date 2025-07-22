package com.pm.back_end_project.service.impl;

import com.pm.back_end_project.dto.JobDTO;
import com.pm.back_end_project.entity.Job;
import com.pm.back_end_project.exceptions.ResourceNotFound;
import com.pm.back_end_project.repository.JobRepository;
import com.pm.back_end_project.service.JobService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //context eka atule bean eka hadaganna eka karanne(component @ eka dano wagemai)
@RequiredArgsConstructor
@Slf4j
public class JobServiceImpl implements JobService {
    private final JobRepository jobRepository;
    private final ModelMapper modelMapper; //dto ekai entity ekai map karano

    @Override
    public void saveJob(JobDTO jobDTO) {
        System.out.println(jobDTO.getJobTitle());
        System.out.println(jobDTO.getJobDescription());
        System.out.println(jobDTO.getCompany());

        if (jobDTO == null) {
            log.error("job id can't be null");
            throw new IllegalArgumentException("job id can't be null");
        }

        jobRepository.save(modelMapper.map(jobDTO, Job.class));
    }

    @Override
    public void updateJob(Job jobDTO) {
        if (jobDTO.getId() == null || jobDTO == null) {
            throw new IllegalArgumentException("Job id is can't be null");
        } else if (jobRepository.existsById(jobDTO.getId())) {
            jobRepository.save(modelMapper.map(jobDTO, Job.class));
        }
    }

    @Override
    public List<JobDTO> getAllJob() {
        List<Job> jobList = jobRepository.findAll();
        if (jobList.isEmpty()) {
            throw new ResourceNotFound("Job not found");
        }
        return jobList.stream()
                .map(job -> modelMapper.map(job, JobDTO.class))
                .toList();
    }

    @Override
    public void updateJobStatus(String jobId, String status) {
        if (jobId == null || jobId.isEmpty()) {
            throw new IllegalArgumentException("Job id is can't be null");
        }
        jobRepository.updateJobStatus(Integer.valueOf(jobId), status);
    }

    @Override
    public List<JobDTO> getJobByJobTitle(String jobTitle) {
        List<Job> alljobs = jobRepository.findJobByJobTitleContainingIgnoreCase(jobTitle);
        if (jobTitle == null || jobTitle.isEmpty()) {
            throw new IllegalArgumentException("Job title is null");
        }
        if (alljobs.isEmpty()) {
            throw new ResourceNotFound("Job not found");
        }
        //{}java wala diamond syntax eka, for each ekak gahala all jobs tika job dto ekakata set karana part ekama e mokut noda mehema karagena tiyenawa type token use karala
        return modelMapper.map(alljobs, new TypeToken<List<JobDTO>>() {}.getType());
    }

    @Override
    public void deleteJob(String jobId) {
        jobRepository.deleteById(Integer.valueOf(jobId));
    }
}
