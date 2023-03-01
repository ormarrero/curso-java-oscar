package com.example.interfaces3;
//(4)
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Tipo CONCRETO:
 */

public class BankAccountServiceImpl implements IBankAccountService {

    public static final double REWARD_PER_YEAR_EUROS = 10d;

    Map<Long, BankAccount> accounts = new HashMap<>();
    @Override
    public List<BankAccount> findAll() { return new ArrayList<>(accounts.values()); }

    @Override
    public BankAccount findById(Long id) { return accounts.get(id); }

    @Override
    public Double calculateReward(BankAccount account) {
        Integer currentYear = LocalDate.now().getYear();
        Integer totalYears = currentYear - account.getOpeningYear();
        return totalYears * REWARD_PER_YEAR_EUROS;
    }

    @Override
    public BankAccount create(String nif, BankAccountType type, Double amount) { return null; }

    @Override
    public BankAccount update(BankAccount bankAccount) { return null; }

    @Override
    public boolean incrementAmount(Long accountId, Double newAmount) { return false; }
}
