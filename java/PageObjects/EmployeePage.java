package PageObjects;


public class EmployeePage {
	
	WebDriver driver;
	WebElement btn_addEmployee_id = driver.findElement(By.id("add"));
	WebElement text_firstname_id = driver.findElement(By.id("firstname"));
	WebElement text_lastname_id = driver.findElement(By.id("lastName"));
	WebElement text_dependents_id = driver.findElement(By.id("dependants"));
	WebElement btn_add_id = driver.findElement(By.id("addEmployee"));
	WebElement table_employee_id = driver.findElement(By.id("employeesTable"));
	WebElement delete_emoloyee_id = driver.findElement(By.id("deleteEmployee"));
	
	String firstname;
	String lastName;
	int dependents;
	float dependents_result;
	float benefits_cost;
	float net_pay;
			
	final float salary= 52000.00;
	final float gross_pay=2000.00;
	// cost of benefits = 2000/26;
	final float cost_of_benefits=38.46;
	//dependents_incur = 500/26
	final float dependents_incur=19.23;
	// Send employees details to the textfield//
	
	
	public void addEmployee(String fn, String ln, int dep) {
		
		//assign arguments values to the global variables
		this.firstname = fn;
		this.lastName = ln;
		this.dependents = dep;
		btn_addEmployee_id.click();
		text_firstname_id.sendKeys(fn);
		text_lastname_id.sendKeys(ln);
		text_dependents_id.sendKeys(dep);
		btn_add_id.click();
	}
	
	public void employeeTable() {
		//dependents_incur=19.23* dep;
		dependents_result= dependents_incur * dep;
				
		//benefits_cost= 38.46+ dependents_result
		benefits_cost= cost_of_benefits + dependents_result;
				
		//net_pay = gross_pay - benefits_cost(2000-38.46)
		net_pay= gross_pay - benefits_cost;
				
		//get all rows from the table
		List<WebElements> rows = table_employee_id.findElements(By.tagName("tr"));
		
		//iterate rows from employees table
		for(int i=1; i<=rows.size(); i++) {
			
			//get firstname, lastname, dependent from column
			List<WebElements> columns = rows.get(i).findElements(By.tagName("td"));
			
			//iterate each column
			for(int j=1; j<=columns.size(); j++) {
				
				if(columns.get(j+1).getText() == firstname &&
				columns.get(j+2).getText() == lastName &&
				columns.get(j+3).getText() == dependents &&
				columns.get(j+4).getText() == salary &&
				columns.get(j+5).getText() == gross_pay &&
				columns.get(j+6).getText() == benefits_cost &&
				columns.get(j+7).getText() == net_pay) {
					System.out.println("Employee is added in the table");
					break;
				}
				
						}
					}
		
		
	}

	public void editEmployee() {
		
		//get all rows from the table
		List<WebElements> rows = table_employee_id.findElements(By.tagName("tr"));
		
		//iterate employees table
		for(int i=1; i<=rows.size(); i++) {
			
			//get firstname, lastname, dependent column values
			List<WebElements> columns = rows.get(i).findElements(By.tagName("td"));
			
			//iterate each column
			for(int j=1; j<=columns.size(); j++) {
				
				if(columns.get(j+1).getText() == "vinniya" &&
				columns.get(j+2).getText() == "velusamy" &&
				columns.get(j+3).getText() == "2") {
				WebElement edit = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td/i[@class='fas fa-edit']"));
				
				edit.click();
				
				text_firstname_id.clear();
				text_firstname_id.sendKeys("vinni");
				
				text_lastname_id.clear();
				text_lastname_id.sendKeys("velu");
				
				text_dependents_id.clear();
				text_dependents_id.sendKeys("3");
				
				btn_add_id.click();
				
				break;
				}
				
						}
		}
	}
	
	public void deleteEmployee() {
		//get all rows from the table
				List<WebElements> rows = table_employee_id.findElements(By.tagName("tr"));
				
				//iterate rows from employees table
				for(int i=1; i<=rows.size(); i++) {
					
					//get firstname, lastname, dependent from column 
					List<WebElements> columns = rows.get(i).findElements(By.tagName("td"));
					
					//iterate each column
					for(int j=1; j<=columns.size(); j++) {
						
						if(columns.get(j+1).getText() == "John" &&
						columns.get(j+2).getText() == "Martin" &&
						columns.get(j+3).getText() == "2") {
						WebElement delete = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td/i[@class='fas fa-times']"));
						
						delete_emoloyee_id.click();
						
						break;
						}
						
								}
				}
	}
}
