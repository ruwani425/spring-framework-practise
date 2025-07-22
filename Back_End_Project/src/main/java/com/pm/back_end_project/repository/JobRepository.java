package com.pm.back_end_project.repository;

import com.pm.back_end_project.entity.Job;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //meka danna onama nehe extend karala tiyena nisa,spring context eka atule me class eken object ekak hadaganna ona nisa dnma,eken puluwan database operation karaganna
//JpaRepository<Job(entity eke type eka),Integer(primary key eke type eka)>
public interface JobRepository extends JpaRepository<Job,Integer> {
    //me wge update ekak commit karanna nam Transactional annotation eka danna ona
    @Transactional
    //update query ekak nam Modifying annotation ek dnna ona
    @Modifying //optional,danmat nodanmat update karanna puluwan
    //tani column ekak update karaddi  me wage query liyanna ona
    //row ekakma update karaddi liyanna ona nehe
    @Query(value = "UPDATE job SET status = :status WHERE id = :jobId", nativeQuery = true)
    void updateJobStatus(Integer jobId, String status);

    //JPA query methods
    List<Job> findJobByJobTitleContainingIgnoreCase(String keyword);
}
