import org.testng.annotations.Test;

public class MyFirstNGTest2 {
	
	@Test(groups= {"Student Details"}) 
	public void verifyStudentName() {
		System.out.println("I am college student");
	}
	@Test(groups= {"Student Details"})
	public void verifyStudentGrade() {
		System.out.println("My Grade is A+");
	}
	@Test(groups= {"Student Details"})
	public void verifyStudentPlacement() {
		System.out.println("All Students are placed");
	}
	@Test(groups= {"Employee Details"})
	public void verifyEmployeeName() {
		System.out.println("I am Office Employee");
	}
	@Test(groups= {"Employee Details"})
	public void verifyEmployeeOffice() {
		System.out.println("My office is located at Bangalore");
	}
	
	@Test(groups= {"Employee Details"})
	public void verifyEmployeeGrade() {
		System.out.println("Employee grade is System Analyst");
	}

}
