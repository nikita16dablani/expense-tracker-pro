package com.example.expense_tracker.controller;

import com.example.expense_tracker.model.Expense;
import com.example.expense_tracker.service.ExpenseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ExpenseController {

    private final ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("expense", new Expense());

        model.addAttribute("expenses",
                service.getAllExpenses());

        model.addAttribute("totalExpense",
                service.getTotalExpense());

        model.addAttribute("totalTransactions",
                service.getTotalTransactions());
   model.addAttribute(
        "foodAmount",
        service.getCategoryTotal("Food"));

model.addAttribute(
        "travelAmount",
        service.getCategoryTotal("Travel"));

model.addAttribute(
        "shoppingAmount",
        service.getCategoryTotal("Shopping"));

model.addAttribute(
        "billsAmount",
        service.getCategoryTotal("Bills"));
        return "index";
    }

    @PostMapping("/save")
    public String saveExpense(
            @ModelAttribute Expense expense) {

        service.saveExpense(expense);

        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteExpense(
            @PathVariable Long id) {

        service.deleteExpense(id);

        return "redirect:/";
    }


@GetMapping("/edit/{id}")
public String editExpense(
        @PathVariable Long id,
        Model model) {

    Expense expense = service.getExpenseById(id);

    model.addAttribute("expense", expense);

    return "edit";
}

@PostMapping("/update")
public String updateExpense(
        @ModelAttribute Expense expense) {

    service.updateExpense(expense);

    return "redirect:/";
}
@GetMapping("/search")
public String searchExpenses(
        @RequestParam(required = false) String category,
        Model model) {

    model.addAttribute(
            "expenses",
            service.getExpensesByCategory(category));

    model.addAttribute(
            "totalExpense",
            service.getTotalExpense());

    model.addAttribute(
            "totalTransactions",
            service.getTotalTransactions());
model.addAttribute(
        "foodAmount",
        service.getCategoryTotal("Food"));

model.addAttribute(
        "travelAmount",
        service.getCategoryTotal("Travel"));

model.addAttribute(
        "shoppingAmount",
        service.getCategoryTotal("Shopping"));

model.addAttribute(
        "billsAmount",
        service.getCategoryTotal("Bills"));
    return "index";
}
}