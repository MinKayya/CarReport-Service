package com.main.webserver.repository;

import com.main.webserver.entity.DamageReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DamageReportRepository extends JpaRepository<DamageReport, Long> {

}

