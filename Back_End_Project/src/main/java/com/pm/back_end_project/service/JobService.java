package com.pm.back_end_project.service;

import com.pm.back_end_project.dto.JobDTO;
import com.pm.back_end_project.entity.Job;

import java.util.List;

/**
 * <b>Header</b>
 * <p>
 * Description
 * </p>
 *
 * @author Lucky Prabath
 * @since 2025-07-07
 */
public interface JobService {
    void saveJob(JobDTO jobDTO);

    void updateJob(Job jobDTO);

    List<JobDTO> getAllJob();

    void updateJobStatus(String jobId, String status);

    List<JobDTO> getJobByJobTitle(String jobTitle);

    void deleteJob(String jobId);
}
