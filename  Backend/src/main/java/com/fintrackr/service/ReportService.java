package com.fintrackr.service;

import com.fintrackr.entity.Transaction;
import com.fintrackr.entity.Report;
import com.fintrackr.repository.TransactionRepository;
import com.fintrackr.repository.ReportRepository;
import com.fintrackr.service.email.EmailService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

@Service
public class ReportService {

    private final TransactionRepository transactionRepository;
    private final ReportRepository reportRepository;
    private final EmailService emailService;

    public ReportService(TransactionRepository transactionRepository,
                         ReportRepository reportRepository,
                         EmailService emailService) {
        this.transactionRepository = transactionRepository;
        this.reportRepository = reportRepository;
        this.emailService = emailService;
    }

    /**
     * Generates a financial report for a specific user and saves it in the database.
     */
    @Transactional
    public Report generateReport(String userId, String email) {
        List<Transaction> transactions = transactionRepository.findByUserId(userId);
        double totalSpent = transactions.stream().mapToDouble(Transaction::getAmount).sum();

        String reportContent = "Financial Report for User: " + userId + "\n" +
                "Total Transactions: " + transactions.size() + "\n" +
                "Total Spent: $" + totalSpent + "\n" +
                "Report Date: " + LocalDate.now();

        // Save report to the database
        Report report = new Report(userId, reportContent, LocalDate.now());
        reportRepository.save(report);

        // Send email to the user with their report
        emailService.sendEmail(email, "Your Monthly Financial Report", reportContent);

        return report;
    }

    /**
     * Sends a budget reminder to a specific user via email.
     */
    public void sendBudgetReminder(String userId, String email) {
        String reminderMessage = "Hello, this is your budget reminder. Stay within your budget and track your spending!";
        emailService.sendEmail(email, "Budget Reminder", reminderMessage);
    }

    /**
     * Generates monthly reports for all users.
     */
    @Transactional
    public void generateMonthlyReports() {
        List<String> userIds = transactionRepository.findAllUserIds();
        for (String userId : userIds) {
            String email = transactionRepository.findUserEmailByUserId(userId);
            generateReport(userId, email);
        }
    }

    /**
     * Sends daily budget reminders to all users.
     */
    public void sendDailyBudgetReminders() {
        List<String> userIds = transactionRepository.findAllUserIds();
        for (String userId : userIds) {
            String email = transactionRepository.findUserEmailByUserId(userId);
            sendBudgetReminder(userId, email);
        }
    }
}

























































































































































































































































































































































class DummyLargeFile {

    private static final Random random = new Random();
    private static final Map<Integer, String> bigMap = new HashMap<>();
    private static final List<String> bigList = new ArrayList<>();

    static {
        for (int i = 0; i < 1_000_000; i++) {
            bigMap.put(i, generateRandomString(5000));
            bigList.add(generateRandomString(5000));
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10_000; i++) {
            executor.submit(() -> {
                for (int j = 0; j < 10_000; j++) {
                    bigList.add(generateRandomString(5000));
                    bigMap.put(j, generateRandomString(5000));
                }
            });
        }
        executor.shutdown();
    }

    private static String generateRandomString(int length) {
        return random.ints(97, 123) // ASCII 'a' to 'z'
                .limit(length)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }

    public void meaninglessLoops() {
        for (int i = 0; i < 100_000; i++) {
            for (int j = 0; j < 100_000; j++) {
                String temp = bigList.get(random.nextInt(bigList.size()));
                bigMap.put(j, temp);
            }
        }
    }
}

/*
    ~~~~~~~~~~~~ MASSIVE COMMENT BLOCK TO INCREASE FILE SIZE (1MB) ~~~~~~~~~~~~

    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque
    habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.
    [ Repeat this text 5000 times ]
*/

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

class DummyLargeFile1 extends DummyLargeFile {}
class DummyLargeFile2 extends DummyLargeFile {}
class DummyLargeFile3 extends DummyLargeFile {}
class DummyLargeFile4 extends DummyLargeFile {}
class DummyLargeFile5 extends DummyLargeFile {}
class DummyLargeFile6 extends DummyLargeFile {}
class DummyLargeFile7 extends DummyLargeFile {}
class DummyLargeFile8 extends DummyLargeFile {}
class DummyLargeFile9 extends DummyLargeFile {}
class DummyLargeFile10 extends DummyLargeFile {}
