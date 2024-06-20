package com.BlueYonder.Jobapplication.service;

import com.BlueYonder.Jobapplication.model.Jobinfo;
import com.BlueYonder.Jobapplication.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Jobservice {
    @Autowired
    private JobRepo repo;
    public Jobinfo saveJob(Jobinfo job) {
        return repo.save(job);
    }
}
