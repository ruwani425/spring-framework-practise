package com.pm.back_end_project.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JobDTO {
    private Integer id;

    @JsonProperty("jobtitle")
    @NotBlank(message = "job title is mandatory")
    private String jobTitle;

    @Pattern(regexp = "^[a-zA-Z]+$",message = "company name is mandatory")
    @JsonProperty("company")
    private String company;

    @JsonProperty("jobLocation")
    private String location;

    @JsonProperty("jobType")
    private String jobType;

    @JsonProperty("status")
    private String status;

    @JsonProperty("jobDescription")
    private String jobDescription;
}
