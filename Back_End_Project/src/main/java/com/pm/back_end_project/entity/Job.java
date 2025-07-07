package com.pm.back_end_project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String jobTitle;
    private String company;
    private String location;
    private String jobDescription;
}
