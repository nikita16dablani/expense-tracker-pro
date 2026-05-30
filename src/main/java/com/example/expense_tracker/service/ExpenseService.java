package com.example.expense_tracker.service;

import com.example.expense_tracker.model.Expense;
import com.example.expense_tracker.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository repository;

    public ExpenseService(ExpenseRepository repository) {
        this.repository = repository;
    }

    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    public Expense saveExpense(Expense expense) {
        return repository.save(expense);
    }

    public void deleteExpense(Long id) {
        repository.deleteById(id);
    }

       public double getTotalExpense() {
        return repository.findAll()
                .stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }

    public long getTotalTransactions() {
        return repository.count();
    }
    public Expense getExpenseById(Long id) {
    return repository.findById(id).orElse(null);
}

public Expense updateExpense(Expense expense) {
    return repository.save(expense);
}

public List<Expense> getExpensesByCategory(String category) {

    if(category == null || category.isBlank()) {
        return repository.findAll();
    }

    return repository.findByCategory(category);
}
public Double getCategoryTotal(String category) {

    Double total =
            repository.getTotalByCategory(category);

    return total == null ? 0 : total;
}
}