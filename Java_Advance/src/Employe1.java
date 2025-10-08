
public class Employe1  extends Person implements InterfacesEx1{



	private double salary;



	public void Employee(String name , Double salary)
	{
		this.name = name;
		this.salary = salary; 
	}





	@Override
	public void processsalary() {
		System.out.println("Salary is processing");

	}

	@Override
	public double payableamount() 
	{

		return salary;
	}

	@Override
	void showRole() 
	{
		System.out.println("Role : Softwware Developer");

	}


	public static void companyInfo() 
	{
		System.out.println("Company: ABC Tech Pvt. Ltd.");
	}


	public void increaseSalary(double percent) 
	{
		salary += salary * percent / 100;
		System.out.println("Salary increased by " + percent + "%");
	}


	public double getAnnualSalary() 
	{
		return salary * 12;
	}

	private double calculateBonus() 
	{
		return salary * 0.1;
	}

	public void showBonus() 
	{
		System.out.println("Bonus: " + calculateBonus());
	}
}
