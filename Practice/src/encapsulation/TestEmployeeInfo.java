package encapsulation;

public class TestEmployeeInfo {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setEmpID(524163);
		emp1.setEmpName("SAYEM");
		emp1.setEmpDOB("01-12-1998");
		emp1.setEmpSalary(800000);
				
		System.out.println(emp1.getEmpID()+ " " + emp1.getEmpName()+ " " + emp1.getEmpDOB()+ " " + emp1.getEmpSalary());
		
		Employee emp2 = new Employee();
		emp2.setEmpID(584769);
		emp2.setEmpName("PRINCE");
		emp2.setEmpDOB("02-10-1992");
		emp2.setEmpSalary(70000);
		
		System.out.println(emp2.getEmpID()+ " " + emp2.getEmpName()+ " " + emp2.getEmpDOB()+ " " + emp2.getEmpSalary());
	
	}

}
