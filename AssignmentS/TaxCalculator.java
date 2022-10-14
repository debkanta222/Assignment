package com.cognizant.tax;
public class TaxCalculator {//1st class creation
	float basicSalary;//test case 2
	boolean citizenship;//taking boolean variable
 void calculateTax(){//method for calculating tax
	 int tax=(int) (30*basicSalary/100);//given logic of calculation of tax , typecasting to convert float to int
	 System.out.println("The Tax of the employee for  "+ basicSalary+" is "+ tax+" rupees");	
}
 void deductTax() {//2nd method to get nettsalary
	 float tax1=30*basicSalary/100;
	int nettSalary=(int) (basicSalary-tax1);//typecasting to convert float to int
	System.out.println("The nett salary of the employee : "+nettSalary +" rupees");
 }
  void validateSalary(){//method for checking citizenship eligibility
	 if(basicSalary>100000||citizenship==true) {
		 System.out.println("The salary citizenship eligibility : true");
	 }
	 else
	System.out.println("The salary citizenship eligibility :false");
 }
}
