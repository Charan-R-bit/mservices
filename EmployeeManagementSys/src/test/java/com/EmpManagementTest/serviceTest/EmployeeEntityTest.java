package com.EmpManagementTest.serviceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.EmployeManagement.entity.Employee;
import com.EmployeManagement.service.EmployeeService;

@ExtendWith(MockitoExtension.class)
class EmployeeEntityTest {
	

	@Test
	void testGetIdSetters() {
		Employee employee = new Employee();
		Employee employee1 = new Employee();
		employee.setCity(null);
		employee1.setCity(null);
		assertEquals(employee.getCity(), employee1.getCity());
		employee.setName(null);
		employee1.setName(null);
		assertEquals(employee.getName(), employee1.getName());
		employee.setPassword(null);
		employee1.setPassword(null);
		assertEquals(employee.getPassword(), employee1.getPassword());
		employee.setState(null);
		employee1.setState(null);
		assertEquals(employee.getState(), employee1.getState());
		employee.setUsername(null);
		employee1.setUsername(null);
		assertEquals(employee.getUsername(), employee1.getUsername());

		employee.setId(0);
		employee1.setId(0);
		assertEquals(employee.getId(), employee1.getId());
		employee.setPincode(0);
		employee1.setPincode(0);
		assertEquals(employee.getPincode(), employee1.getPincode());
		employee.setSalary(0);
		employee1.setSalary(0);
		assertEquals(employee.getSalary(), employee1.getSalary());
		
		
		assertEquals(employee.toString(),employee1.toString());
	}
    @Test
    void testAllArgs() {
    	Employee employee2 = new Employee(1,"asd",123,"sda","asd","asd","asd",123);
		Employee employee3 = new Employee(1,"asd",123,"sda","asd","asd","asd",123);
		employee2.toString();
		employee3.toString();
        assertEquals(employee2.getCity(), employee3.getCity());
    }
}
