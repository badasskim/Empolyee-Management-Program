package employee;

public abstract class Employee {

	protected int id;
	protected String name;
	protected DepartmentEnum department;

	
	
	public Employee()
	{
		id = 0;
		name = "not";
		department =	null;
	}
	
	public Employee(int id, String name, DepartmentEnum department)
	{
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public DepartmentEnum getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentEnum department) {
		this.department = department;
	}
	
	public abstract void print();

	
}
