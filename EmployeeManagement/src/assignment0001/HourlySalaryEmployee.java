package assignment0001;

public class HourlySalaryEmployee extends AbstractEmployee {

	private double employeeSalary;
	private double workinghour;
	
	public HourlySalaryEmployee(String employeeName, String employeeNID,double employeeSalary,double workinghour ) {
		super(employeeName, employeeNID);
		setEmployeeSalary(employeeSalary);
		setWorkingHour(workinghour );
	}

	
	
	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	public void setWorkingHour(double workinghour ) {
		this.workinghour = workinghour;
	}
	public double getWorkingHour() {
		return workinghour;
	}

	@Override
	public double calculateSalary() {
		double sal,total = 0;
		
		if( getWorkingHour()>172){
			sal= (getWorkingHour()-172)*200;
			
			total=getEmployeeSalary()+sal;
			
		}
		else{
			total=getEmployeeSalary();
		}
		return total;
		
	}

	
}
