package com.main.webserver.service;

import com.main.webserver.entity.DamageReport;
import com.main.webserver.repository.DamageReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DamageReportService {
    @Autowired
    private DamageReportRepository repository;

    public List<DamageReport> getAllReports() {
        return repository.findAll();
    }

    public DamageReport saveReport(DamageReport report) {
        return repository.save(report);
    }
}
