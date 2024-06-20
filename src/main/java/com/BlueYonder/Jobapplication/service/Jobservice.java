package com.BlueYonder.Jobapplication.service;

import com.BlueYonder.Jobapplication.model.Jobinfo;
import com.BlueYonder.Jobapplication.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Jobservice {
    @Autowired
    private JobRepo repo;
    public Jobinfo saveJob(Jobinfo job) {
        return repo.save(job);
    }

    public List<Jobinfo> saveJobs(List<Jobinfo> jobs) {
        return repo.saveAll(jobs);
    }

    public List<Jobinfo> getJobs() {
        return repo.findAll();
    }

    public Jobinfo getJobById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Jobinfo updateJob(Jobinfo job, int id) {
        Jobinfo existingJob = repo.findById(id).orElse(null);
        if (existingJob != null) {
            existingJob.jobtitle = job.jobtitle;
            existingJob.jobdescription = job.jobdescription;
            existingJob.joblocation = job.joblocation;
            existingJob.jobtype = job.jobtype;
            existingJob.jobexperience = job.jobexperience;
            existingJob.jobsalary = job.jobsalary;
            existingJob.jobskills = job.jobskills;
            existingJob.jobcompany = job.jobcompany;
            existingJob.jobposteddate = job.jobposteddate;
            existingJob.jobclosingdate = job.jobclosingdate;
            existingJob.joblink = job.joblink;
            existingJob.jobstatus = job.jobstatus;
            return repo.save(existingJob);
        } else {
            return null;
        }

    }

    public String deleteJob(int id) {
        repo.deleteById(id);
        return "Job removed !! " + id;
    }
}
