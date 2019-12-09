package com.example.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "expensescategory")
public class ExpenseCategory {
	/*
	 * public ExpenseCategory( int id, String name) { ec_id=id; ec_name=name; }
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String categoryName;

	/*
	 * @OneToOne(mappedBy = "expenseCategory") private Expenses expenses;
	 *//*
		 * @OneToMany private List<Expenses> expenses;
		 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
