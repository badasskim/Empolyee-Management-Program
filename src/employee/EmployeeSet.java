package employee;
import java.util.Scanner;
import java.util.Vector;
import utils.Utils;

public class EmployeeSet
{
	
	Scanner in = new Scanner(System.in);
	final int MAX_SIZE = 100;	// 배열 길이
	Vector<Employee> vt1;
	int sumPartTime;				// 전체 배열안에 있는 인원 수
	int full;
	int part;
	
	
	public EmployeeSet() 
	{

		sumPartTime = 0;
		part = 0;
		full = 0;
		vt1 = new Vector<Employee>(MAX_SIZE);
	}
	
	public void RegisterFullTimeEmp(Scanner s)
	{
		System.out.println("");
		System.out.println(">>> 정규직 등록 <<<");
		
		int id = 10101 + full;
		String name = Utils.getName(s);
		DepartmentEnum department = Utils.getDepartment(s);
		PositionEnum position = Utils.getPosition(s);
		int grade = Utils.getGrade(s);
		

		vt1.add(new FullTimeEmp(id, name, department, position, grade));
		full++;
		sumPartTime++;
	}
	
	public void RegisterFullTimeEmp(String name, DepartmentEnum department, PositionEnum position, int grade)
	{
		int id = 10101 + full;
		vt1.add(new FullTimeEmp(id, name, department, position, grade));
		full++;
		sumPartTime++;
	}
	
	
	public void RegisterPartTimeEmp(Scanner s) 
	{
		System.out.println("");
		System.out.println(">>> 임시직 등록 <<<");
		
		int id = 50101 + part;
		String name = Utils.getName(s);
		DepartmentEnum department = Utils.getDepartment(s);
		int hours = Utils.getHours(s);

		vt1.add(new PartTimeEmp(id, name, department, hours));
		part++;
		sumPartTime++;

	}
	
	public void RegisterPartTimeEmp(String name, DepartmentEnum department, int hours) 
	{
		int id = 50101 + part;	
		vt1.add(new PartTimeEmp(id, name, department, hours));
		part++;
		sumPartTime++;

	}
	
	public void SearchAll() 
	{
		for(int i = 0; i < sumPartTime; i++)
		{
			try
			{
				vt1.get(i).print();	
			}
			catch(Exception e)
			{
				continue;
			}
			
		
		}
	}
	
	public void SearchFull()
	{
		for(int i = 0; i < sumPartTime; i++)
		{
			try
			{
				if(vt1.get(i) instanceof FullTimeEmp)
				{
					
					vt1.get(i).print();
				}
				else
				{
					continue;
				}
			}
			catch(Exception e)
			{
				continue;
			}
			
		}
		
	}
	
	public void SearchPart()
	{

		for(int i = 0; i < sumPartTime; i++)
		{
			try
			{
				if(vt1.get(i) instanceof PartTimeEmp)
				{
					vt1.get(i).print();
				}
				else
				{
					continue;
				}
			}
			catch(Exception e)
			{
				continue;
			}

		}
	}
	
	public int SearchName()
	{
		System.out.println("검색할 이름을 입력하세요");
		System.out.print(">>> name: ");
		String name = in.next();
		
		for(int i = 0; i < sumPartTime; i++)
		{
			if(vt1.get(i).getName().equals(name))
			{
				vt1.get(i).print();
				return i;
			}
		}
			System.out.println("!!! 해당 이름의 직원이 없습니다.");
			return -1;
	}
	
	
	public void rename()
	{
		System.out.println("갱신할 직원의 id 확인을 위해 직원 이름을 검색합니다.");
		System.out.println(" ");
		int arr = SearchName();
		
		if(arr == -1)
		{
			return;
		}
		
			System.out.println("갱신할 직원의 id를 입력하시오.");
			int id = Utils.getID(in);
			System.out.println("갱신할 정보를 입력하시오.");
			String name = Utils.getName(in);
			DepartmentEnum department = Utils.getDepartment(in);
			
			if(id <=50100) //정규직
			{
				PositionEnum position = Utils.getPosition(in);
				int grade = Utils.getGrade(in);
				vt1.removeElementAt(arr);
				vt1.add(arr, new FullTimeEmp(id, name, department, position, grade));
				System.out.println(" ");
				System.out.println("===갱신결과===");
				vt1.get(arr).print();
			}
			else if(id>50100) //임시직
			{
				int hours = Utils.getHours(in);
				vt1.removeElementAt(arr);
				vt1.add(arr,  new PartTimeEmp(id, name, department, hours));
				System.out.println(" ");
				System.out.println("===갱신결과===");
				vt1.get(arr).print();
			}
			
	}
	
	public void deleteId()
	{
		System.out.println("삭제할 직원의 id 확인을 위해 직원 이름을 검색합니다.");
		System.out.println(" ");
		int num = SearchName();
		
		if(num == -1)
		{
			return;
		}
		
		System.out.println("삭제할 직원의 id를 입력하시오.");
		int id = Utils.getID(in); //사실 별 의미 없는 듯
		
		while(true)
		{
			System.out.println(vt1.get(num).name + " 삭제하시겠습니까?(1: 예, 2: 아니오)");
			System.out.print("선택>>>");
			int sel = in.nextInt();
			if(sel == 1)
			{
				vt1.removeElementAt(num);
				System.out.println("해당 직원을 삭제하였습니다.");
				break;
			}
			else if(sel == 2)
			{
				System.out.println("작업을 취소하였습니다.");
				break;
			}
			else
			{
				System.out.println("invalid! 다시 선택하십시오");
			}
			
		}
	
	}
}
