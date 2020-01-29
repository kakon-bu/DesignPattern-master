package assignment0001;

import assignment0001.AbstractEmployee;

public class CommisionSalaryEmployee extends AbstractEmployee {
	private double employeeSalary;
	private double employeeSell;
	
	public CommisionSalaryEmployee(String employeeName, String employeeNID,double employeeSalary,double employeeSell) {
		super(employeeName, employeeNID);
		setEmployeeSalary(employeeSalary);
		setEmployeeSell(employeeSell);
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public double getEmployeeSell() {
		return employeeSell;
	}

	public void setEmployeeSell(double employeeSell) {
		this.employeeSell = employeeSell;
	}

	
	@Override
	public double calculateSalary() {
		double sal,total = 0;
		if( getEmployeeSell()>=30000){
			total= getEmployeeSalary()+getEmployeeSalary()*0.5;
				
		}
		else if( getEmployeeSalary()<30000){
			total=getEmployeeSalary()+getEmployeeSalary()*0.2;
			
		}
		else{
			total=getEmployeeSalary();
		}
		return total;
		
	}
	

	
	
	
}

