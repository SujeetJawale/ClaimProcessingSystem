package com.claim.demo.service;

import com.claim.demo.dto.ClaimReportDTO;
import com.claim.demo.dto.ClaimsSummaryDTO;

import java.util.List;

public interface ReportServiceI {

    List<ClaimReportDTO> generateReportByStatus();

    ClaimsSummaryDTO generateClaimsSummary();
}
