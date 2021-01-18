package com.ganesh.api.controller;

import com.ganesh.api.model.Expense;
import com.ganesh.api.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expense")
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseService expenseService;

    @PostMapping
    public ResponseEntity addExpense(@RequestBody Expense expense) {
        expenseService.addExpense(expense);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<Expense>> getAllExpenses(){
        return ResponseEntity.ok(expenseService.getAllExpenses());
    }

    @PutMapping
    public ResponseEntity updateExpense(@RequestBody Expense expense){
        expenseService.updateExpense(expense);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/{name}")
    public ResponseEntity getExpenseByName(@PathVariable String name) {
        return ResponseEntity.ok(expenseService.getExpense(name));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteExpense(@PathVariable String id) {
        expenseService.deleteExpense(id);
        return ResponseEntity.noContent().build();
    }
}
