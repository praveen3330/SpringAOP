package in.ineuron.dao;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

	public void saveEmployee() {
		System.out.println("Employee object is saved");
	}
	
	public void getEmployee() {
		System.out.println("Employee Retreived from database");
	}
	
	public String deleteEmployee() {
		System.out.println("Record Deleted");
		return "employee got deleted";
	}
	
}
