package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.ExpenseModel;
import com.example.model.Expenses;
import com.example.service.ExpenseService;
/*
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/

@RestController
@RequestMapping("/api")
public class ExpenseController {
	// private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private ExpenseService expenseService;

	@GetMapping("/expenses")
	public List<Expenses> getAllExpenses() {

		/*
		 * logger.debug("Debug message"); logger.info("Info message");
		 * logger.warn("Warn message"); logger.error("Error message");
		 */return expenseService.getAllExpenses();
	}

	@GetMapping("/showmonthwise")
	public List<Object[]> getMOnthWiseExpenses() {

		return expenseService.getListOfExpensesmonthWise();
	}

	@PostMapping("/addExpenses")
	public Expenses createExpenses(@RequestBody ExpenseModel expenseModel) {
		System.out.print(expenseModel.getEc_id());
		return expenseService.save(expenseModel);
	}

}
