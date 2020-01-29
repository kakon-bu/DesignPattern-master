package assignment0001;



public class EmployeeManage {

	public static void main(String[] args) {
		
		FixedSalaryEmployee abstractEmployee=new FixedSalaryEmployee("Md. ", "5697485", 12000);
		System.out.println(abstractEmployee.calculateSalary());
		
		HourlySalaryEmployee abstract3Employee=new HourlySalaryEmployee("Md. ", "5697485", 12000, 300);
		System.out.println(abstract3Employee.calculateSalary());
		
		CommisionSalaryEmployee abstract2Employee=new CommisionSalaryEmployee("Md. ", "5697485", 12000,30000);
		System.out.println(abstract2Employee.calculateSalary());
	}

}
