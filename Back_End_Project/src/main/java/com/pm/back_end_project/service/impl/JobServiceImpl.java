package com.pm.back_end_project.service.impl;

import com.pm.back_end_project.dto.JobDTO;
import com.pm.back_end_project.entity.Job;
import com.pm.back_end_project.repository.JobRepository;
import com.pm.back_end_project.service.JobService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 * <b>Header</b>
 * <p>
 * Description
 * </p>
 *
 * @author Ruwani Ranthika
 * @since 2025-07-07
 */
@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService {
    private final JobRepository jobRepository;
    private final ModelMapper modelMapper;

    @Override
    public void saveJob(JobDTO jobDTO) {
        System.out.println(jobDTO.getJobTitle());
        System.out.println(jobDTO.getJobDescription());
        System.out.println(jobDTO.getCompany());

//        Job job = new Job();
//        job.setJobTitle(jobDTO.getJobTitle());
//        job.setJobDescription(jobDTO.getJobDescription());
//        job.setCompany(jobDTO.getCompany());
//        jobRepository.save(job);

        jobRepository.save(modelMapper.map(jobDTO, Job.class));
    }
}
