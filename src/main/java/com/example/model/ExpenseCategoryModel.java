package com.example.model;

import org.springframework.stereotype.Component;

@Component
public class ExpenseCategoryModel {
		
		private int id;
	    private String categoryName;
	    
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
