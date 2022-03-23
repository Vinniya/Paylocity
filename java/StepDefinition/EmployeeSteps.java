package StepDefinition;

import PageObjects.EmployeePage;

public class EmployeeSteps {

	EmployeePage emp = new EmployeePage();
	
	@Given("add employee \"([^\"]*)\, \"([^\"]*)\ and \"([^\"]*)\")
	public void add_employee() {
		emp.addEmployee(firstname, lastname, dependent);
	}
	
	@Then("verify the added employee is shown in the employees table")
	public void verify_employee_in_employee_table() {
		emp.employeeTable();
	
	@And("And verify employee firstname can be edited")
	public void edit_employee_firstname() {
		emp.editEmployee();
	}
	
	@Then("Then verify employee can be deleted")
    public void delete_employee() {
		emp.deleteEmployee();
	}
		
	}
}
