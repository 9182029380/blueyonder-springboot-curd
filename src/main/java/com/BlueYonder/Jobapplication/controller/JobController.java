package com.BlueYonder.Jobapplication.controller;

import com.BlueYonder.Jobapplication.model.Jobinfo;
import com.BlueYonder.Jobapplication.service.Jobservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
public class JobController {
    @Autowired
    private Jobservice service;

    @PostMapping("/addjob")
    public Jobinfo addJob(@RequestBody Jobinfo job) {
        return  service.saveJob(job);

    }
}
