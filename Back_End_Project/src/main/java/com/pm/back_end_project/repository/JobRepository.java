package com.pm.back_end_project.repository;

import com.pm.back_end_project.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <b>Header</b>
 * <p>
 * Description
 * </p>
 *
 * @author Lucky Prabath
 * @since 2025-07-07
 */
@Repository //meka danna onama nehe extend karala tiyena nisa
public interface JobRepository extends JpaRepository<Job,Integer> {
}
