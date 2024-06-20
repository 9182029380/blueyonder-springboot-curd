package com.BlueYonder.Jobapplication.repository;

import com.BlueYonder.Jobapplication.model.Jobinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<Jobinfo,Integer> {
}
