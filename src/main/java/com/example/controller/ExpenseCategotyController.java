package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.ExpenseCategory;
import com.example.model.ExpenseCategoryModel;
import com.example.service.ExpenseCategoryService;
import com.example.service.ExpenseCategoryServiceException;
import com.example.exceptionhandling.ResourceNotFoundException;

@RestController
@RequestMapping("/api")
public class ExpenseCategotyController {

	@Autowired
	private ExpenseCategoryService expenseCategoryService;

	@PostMapping("/addCategory")
	public ExpenseCategory createExpensesCategories(@RequestBody ExpenseCategoryModel expenseCategoryDto) {
		System.out.println("Expense name" + expenseCategoryDto.getCategoryName());
		return expenseCategoryService.save(expenseCategoryDto);
	}

	@GetMapping("/categories")
	public List<ExpenseCategory> getAllExpensesCategory()throws ResourceNotFoundException, ExpenseCategoryServiceException {
		//System.out.print(expenseCategoryService.getAllExpensesCategory());
		List<ExpenseCategory> expenseCategory =expenseCategoryService.getAllExpensesCategory();
		if (expenseCategory == null) {
			throw new ResourceNotFoundException("Expense category not found");
		}

		return expenseCategory;
		//return expenseCategoryService.getAllExpensesCategory();
	}
	@GetMapping("/categories4")
	public ExpenseCategory getAllExpensesCategoryNull()throws ResourceNotFoundException, ExpenseCategoryServiceException {
		//System.out.print(expenseCategoryService.getAllExpensesCategory());
		ExpenseCategory expenseCategory = expenseCategoryService.getExpenseCategoryNull();
		if (expenseCategory == null) {
			throw new ResourceNotFoundException("Expense category not found");
		}

		return expenseCategory;
		//return expenseCategoryService.getAllExpensesCategory();
	}
	@PostMapping("/showcategoriesbyname")
	public ExpenseCategory getByNameExpensesCategories(@RequestBody ExpenseCategory expenseCategory) {
		System.out.println("Expense name" + expenseCategory.getCategoryName());
		String name = expenseCategory.getCategoryName(); // return
		expenseCategoryService.getByName(name);
		return expenseCategoryService.getByName(name);
	}
   @DeleteMapping("/deletecategories")
   public ExpenseCategory deleteByNameExpensesCategories(@RequestBody ExpenseCategory expenseCategory) {
		System.out.println("Expense name" + expenseCategory.getCategoryName());
		String name = expenseCategory.getCategoryName(); 
		return expenseCategoryService.getByName(name);
	}
   
   @RequestMapping(value = "/categories2", method = RequestMethod.GET)
	public ExpenseCategory getExpenseCategory() throws ResourceNotFoundException, ExpenseCategoryServiceException{
		try {
			ExpenseCategory expenseCategory = expenseCategoryService.getExpenseCategoryException();
			if (expenseCategory == null) {
				throw new ResourceNotFoundException("Expense category not found");
			}
			return expenseCategory;
		} catch (ExpenseCategoryServiceException e) {
			throw new ExpenseCategoryServiceException("Internal Server Exception while getting exception");
		}
	}
}
