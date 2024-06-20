package com.BlueYonder.Jobapplication.controller;

import com.BlueYonder.Jobapplication.model.Jobinfo;
import com.BlueYonder.Jobapplication.service.Jobservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {
    @Autowired
    private Jobservice service;

    @PostMapping("/addjob")
    public Jobinfo addJob(@RequestBody Jobinfo job) {
        return  service.saveJob(job);

    }
    @PostMapping("/addjobs")
    public List<Jobinfo> addJobs(@RequestBody  List<Jobinfo> jobs) {
        return service.saveJobs(jobs);
    }

    @GetMapping("/findalljobs")
    public List<Jobinfo> findAllJobs() {
        return service.getJobs();
    }
    @GetMapping("/findjobbyid/{id}")
    public Jobinfo findJobById(@PathVariable int id) {
        return service.getJobById(id);
    }
    @PutMapping("/updatejob/{id}")
    public Jobinfo updateJob(@RequestBody Jobinfo job,@PathVariable int id) {
        return service.updateJob(job,id);
    }
    @DeleteMapping("/deletejob/{id}")
    public String deleteJob(@PathVariable int id) {
        return service.deleteJob(id);
    }

}
