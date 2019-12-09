package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.ExpenseCategory;

@Repository
public interface ExpenceCategoryRepository extends JpaRepository<ExpenseCategory, Long> {
	ExpenseCategory findByCategoryName(@Param("name") String name);

	ExpenseCategory deleteByCategoryName(@Param("name") String name);
}
