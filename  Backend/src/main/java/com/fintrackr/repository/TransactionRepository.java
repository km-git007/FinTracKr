package com.fintrackr.repository;

import com.fintrackr.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUserId(String userId);

    @Query("SELECT DISTINCT t.userId FROM Transaction t")
    List<String> findAllUserIds();

    @Query("SELECT u.email FROM User u WHERE u.id = :userId")
    String findUserEmailByUserId(String userId);
}
