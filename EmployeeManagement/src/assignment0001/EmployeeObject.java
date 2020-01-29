package assignment0001;

public class EmployeeObject {

	private String employeeName;
	private String employeeNID;
	private double employeeSalary;
	private double workingHour;
	private double employeeSell;
	public EmployeeObject() {
		
	}
	
	
	public EmployeeObject(String employeeName, String employeeNID,double employeeSalary) {
		this.employeeName=employeeName;
		this.employeeNID=employeeNID;
		this.employeeSalary=employeeSalary;
	}




	public EmployeeObject(String employeeName, String employeeNID, double employeeSalary, double workingHour,
			double employeeSell) {
		super();
		this.employeeName = employeeName;
		this.employeeNID = employeeNID;
		this.employeeSalary = employeeSalary;
		this.workingHour = workingHour;
		this.employeeSell = employeeSell;
	}


	public EmployeeObject(String employeeName, String employeeNID, double employeeSalary, double workingHour) {
		this.employeeName = employeeName;
		this.employeeNID = employeeNID;
		this.employeeSalary = employeeSalary;
		this.workingHour = workingHour;
	}
	
	
	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmployeeNID() {
		return employeeNID;
	}


	public void setEmployeeNID(String employeeNID) {
		this.employeeNID = employeeNID;
	}


	public double getEmployeeSalary() {
		return employeeSalary;
	}


	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}


	public double getWorkingHour() {
		return workingHour;
	}


	public void setWorkingHour(double workingHour) {
		this.workingHour = workingHour;
	}

	public double getEmployeeSell() {
		return employeeSell;
	}


	public void setEmployeeSell(double employeeSell) {
		this.employeeSell = employeeSell;
	}
	
	public void salaryOfFixedEmployee() {
		System.out.println("Employee Name: "+getEmployeeName()+ "Employee NID: "+employeeNID+"Employee Salary"+employeeSalary);
	}
    
	

}
