package com.healthcareplatform.AnalyticsService.service;

import com.healthcareplatform.AnalyticsService.dto.AnalyticsReportDto;
import com.healthcareplatform.AnalyticsService.dto.AnalyticsRequestDto;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AnalyticsService {
    public List<AnalyticsReportDto> getAllReports() {
        return null;
    };

    public AnalyticsReportDto getReportById(UUID reportId){
        return null;
    };

    public AnalyticsReportDto generateReport(@Valid AnalyticsRequestDto request){
        return null;
    };
}
