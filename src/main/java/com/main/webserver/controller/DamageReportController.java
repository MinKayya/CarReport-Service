package com.main.webserver.controller;

import com.main.webserver.entity.DamageReport;
import com.main.webserver.service.DamageReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/damage-report")
public class DamageReportController {

    @Autowired
    private DamageReportService service;

    @GetMapping
    public List<DamageReport> getAllReports() {
        return service.getAllReports();
    }

    @PostMapping
    public DamageReport createReport(@RequestBody DamageReport report) {
        return service.saveReport(report);
    }
}
