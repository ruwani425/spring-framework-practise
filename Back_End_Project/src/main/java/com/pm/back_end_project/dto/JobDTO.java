package com.pm.back_end_project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <b>Header</b>
 * <p>
 * Description
 * </p>
 *
 * @author Ruwani Ranthika
 * @since 2025-07-07
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JobDTO {
    public String jobTitle;
    private String company;
    private String location;
    private String jobDescription;
}
