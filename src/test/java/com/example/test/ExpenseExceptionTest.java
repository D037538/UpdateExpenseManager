/*
 * package com.example.test;
 * 
 * import static org.junit.jupiter.api.Assertions.*;
 * 
 * import org.junit.jupiter.api.Test; import org.junit.runner.RunWith; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.test.context.junit4.SpringRunner;
 * 
 * import com.example.service.ExpenseService;
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @SpringBootTest class ExpenseExceptionTest { private String requestedURI =
 * "/api/expenses/6"; private String errorMessage = "Expense not found";
 * 
 * @Autowired private ExpenseService expenseService; private String baseUrl =
 * "http://localhost:8090";
 * 
 * private String endpointToThrowException = "/employee/2010";
 * 
 * @Autowired private TestRestTemplate testRestTemplate;
 * 
 * @Test(expected = YearViolationException.class) public void
 * testhandleBanNotNumericException() { testRestTemplate.getForObject(baseUrl +
 * endpointToThrowException, String.class); } }
 */