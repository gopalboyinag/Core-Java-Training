package oops1;

public class EmpDemoTest {

	public static void main(String[] args) {
		
		EmpTest emp =  new EmpTest();
		emp.setEmpName("Siva");
		emp.setSalary(20000);
		emp.setEmpAddress("USA");
		
		
		
		System.out.println(emp.getEmpAddress());

		System.out.println(emp.getEmpName());

		System.out.println(emp.getSalary());

	}

}
