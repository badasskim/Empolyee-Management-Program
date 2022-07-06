package employee;

public class FullTimeEmp extends Employee {

	private int grade;
	private PositionEnum position;
	
	public FullTimeEmp()
	{
		// 코드 작성
		grade = 0;
		position = null; 
	
	}

	public FullTimeEmp(int id, String name, DepartmentEnum department, PositionEnum position, int grade)
	{
		super(id, name, department);
		this.position = position;
		this.grade = grade;
		
	}
	
	public void print() 
	{
		System.out.println("================");
		System.out.println("id :" + id);
		System.out.println("name: " + name);
		System.out.println("department: " + department.message);
		System.out.println("position: " + position.message);
		System.out.println("grade: " + grade);
		System.out.println(" ");                                 
	}

	

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public PositionEnum getPosition() {
		return position;
	}
	public void setPosition(PositionEnum position) {
		this.position = position;
	}

}
