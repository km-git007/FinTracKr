package com.fintrackr.service;

import com.fintrackr.dto.AccountDTO;
import com.fintrackr.entity.Account;
import com.fintrackr.repository.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    /**
     * Fetch all accounts belonging to a user.
     */
    public List<Account> getUserAccounts(String userId) {
        return accountRepository.findByUserId(userId);
    }

    /**
     * Create a new account.
     */
    @Transactional
    public Account createAccount(String userId, AccountDTO accountDTO) {
        boolean isDefault = accountDTO.isDefault();
        if (isDefault) {
            // Ensure only one default account per user
            List<Account> userAccounts = accountRepository.findByUserId(userId);
            userAccounts.forEach(acc -> acc.setDefault(false));
            accountRepository.saveAll(userAccounts);
        }

        Account account = new Account(userId, accountDTO.getName(), accountDTO.getBalance(), isDefault);
        return accountRepository.save(account);
    }

    /**
     * Update an existing account.
     */
    @Transactional
    public Account updateAccount(Long accountId, AccountDTO accountDTO) {
        Account account = accountRepository.findById(accountId)
                .orElseThrow(() -> new RuntimeException("Account not found"));

        account.setName(accountDTO.getName());
        account.setBalance(accountDTO.getBalance());

        if (accountDTO.isDefault()) {
            // Ensure only one default account per user
            List<Account> userAccounts = accountRepository.findByUserId(account.getUserId());
            userAccounts.forEach(acc -> acc.setDefault(false));
            accountRepository.saveAll(userAccounts);

            account.setDefault(true);
        }

        return accountRepository.save(account);
    }

    /**
     * Delete an account.
     */
    public void deleteAccount(Long accountId) {
        if (!accountRepository.existsById(accountId)) {
            throw new RuntimeException("Account not found");
        }
        accountRepository.deleteById(accountId);
    }
}
