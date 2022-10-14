package com.cognizant.tax;

public class EmployeeTax {//new class for invoking the methods

	public static void main(String[] args) {
		TaxCalculator tc=new TaxCalculator();
		tc.calculateTax();//invoking 1st method
		tc.deductTax();//invoking 2nd method
		tc.validateSalary();//invoking 3rd method

	}

}
