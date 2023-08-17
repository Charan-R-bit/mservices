package com.EmpManagementTest.serviceTest;

import java.util.HashSet;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.EmployeManagement.EmployeManagementApplication;
import com.EmployeManagement.entity.Employee;
import com.EmployeManagement.service.EmployeeService;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiseTest {

	@Mock
	private EmployeeService employeeServise;

	@InjectMocks
	public static Employee employee = new Employee();
	public HashSet<Employee> empset = new HashSet<Employee>();

	@BeforeAll
	static void beforeAll() {
		Employee emp1=new Employee(101,"John",25000,"john123","1234","MH","airoli",675890);
		Employee emp2=new Employee(102,"kush",25000,"kush12","1234","MH","MG road",675450);
		employee.setCity("qwe");
		employee.setId(1);

	}


	
	@Test
	void testViewEmployee() {
		
		Employee emp=new Employee (1,"asd",123,"sda","asd","asd","asd",123);
		employeeServise.viewAllEmps();
		
	}
	
	   @Test
	   public void main() {
		   EmployeManagementApplication.main(new String[] {});
	   }


}
