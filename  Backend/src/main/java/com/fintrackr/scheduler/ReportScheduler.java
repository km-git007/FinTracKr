package com.fintrackr.scheduler;

import com.fintrackr.service.ReportService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportScheduler {
    private final ReportService reportService;

    public ReportScheduler(ReportService reportService) {
        this.reportService = reportService;
    }

    @Scheduled(cron = "0 0 9 1 * ?") // Runs on the 1st day of every month at 9 AM
    public void generateMonthlyReports() {
        reportService.generateReports();
    }

    @Scheduled(fixedRate = 86400000) // Runs every 24 hours
    public void sendBudgetReminders() {
        reportService.sendBudgetReminders();
    }
}
