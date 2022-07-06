package employee;

public class PartTimeEmp extends Employee {

	private int hours;
	
	public PartTimeEmp() 
	{
		hours = 0;
	
	}
	
	public PartTimeEmp(int id, String name, DepartmentEnum department, int hours) 
	{
		super(id, name, department);
		this.hours = hours;
	}
	
	@Override
	public void print() 
	{
		System.out.println("================");
		System.out.println("id :" + id);
		System.out.println("name: " + name);
		System.out.println("department: " + department.message);
		System.out.println("hours: " + hours);
		System.out.println(" ");
	}
	
	
	public int getHours()
	{
		return hours;
	}

	
	public void setHours(int hours) 
	{
		this.hours = hours;
	}
	

}
