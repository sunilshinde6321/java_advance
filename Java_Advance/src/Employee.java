import java.nio.file.FileSystemAlreadyExistsException;
import java.security.PermissionCollection;
import java.util.IllegalFormatPrecisionException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Employee  {



	private String name;
	private double salary;

	public Employee(String name , double salary)
	{ 
		this.name = name;
		this.salary = salary;


	}

	public void showdetails()
	{
		System.out.println("Name: "+name + " "+ salary);
	}


	private double calculateBouns()
	{
		return salary * 0.10;


	}

	public static void companyinfo()
	{
		System.out.println("Complay :ACL");
	}



	public void increasesalary(double precent)
	{
		salary = salary + (salary * precent / 100);

		System.out.println("Salary Increased by "+precent + "%");
	}



	public double getanulasalary()
	{
		return salary * 12;
	}




	public void setEmployee(String name )
	{
		this.name = name;
	}

	public void setEmployee(String name ,double salary)
	{
		this.name = name;
		this.salary = salary;
	}


	public void showdetail1s()
	{
		System.out.println(name + " "+ salary);
	}


	public static double converttoUSD(double amountInINR)
	{
		double usdrate = 83.0;
		return amountInINR / usdrate;
	}



	public void showfullInfo()
	{
		showdetail1s();
		showdetails();

		double bonus = calculateBouns();
		System.out.println("Bouns: "+ bonus);
	}

	public static void main(String[] args) 
	{



		Employee emp = new Employee("Sunil", 45000);


		companyinfo();


		System.out.println("Bouns : "+ emp.calculateBouns());


		emp.increasesalary(10);

		System.out.println("Annual slary : "+ emp.getanulasalary());


		emp.setEmployee("Anil");
		emp.setEmployee("Sunil", 50000);







	}




}
