package employee;
import java.util.Scanner;
import java.util.Vector;
import utils.Utils;

public class EmployeeSet
{
	
	Scanner in = new Scanner(System.in);
	final int MAX_SIZE = 100;	// �迭 ����
	Vector<Employee> vt1;
	int sumPartTime;				// ��ü �迭�ȿ� �ִ� �ο� ��
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
		System.out.println(">>> ������ ��� <<<");
		
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
		System.out.println(">>> �ӽ��� ��� <<<");
		
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
		System.out.println("�˻��� �̸��� �Է��ϼ���");
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
			System.out.println("!!! �ش� �̸��� ������ �����ϴ�.");
			return -1;
	}
	
	
	public void rename()
	{
		System.out.println("������ ������ id Ȯ���� ���� ���� �̸��� �˻��մϴ�.");
		System.out.println(" ");
		int arr = SearchName();
		
		if(arr == -1)
		{
			return;
		}
		
			System.out.println("������ ������ id�� �Է��Ͻÿ�.");
			int id = Utils.getID(in);
			System.out.println("������ ������ �Է��Ͻÿ�.");
			String name = Utils.getName(in);
			DepartmentEnum department = Utils.getDepartment(in);
			
			if(id <=50100) //������
			{
				PositionEnum position = Utils.getPosition(in);
				int grade = Utils.getGrade(in);
				vt1.removeElementAt(arr);
				vt1.add(arr, new FullTimeEmp(id, name, department, position, grade));
				System.out.println(" ");
				System.out.println("===���Ű��===");
				vt1.get(arr).print();
			}
			else if(id>50100) //�ӽ���
			{
				int hours = Utils.getHours(in);
				vt1.removeElementAt(arr);
				vt1.add(arr,  new PartTimeEmp(id, name, department, hours));
				System.out.println(" ");
				System.out.println("===���Ű��===");
				vt1.get(arr).print();
			}
			
	}
	
	public void deleteId()
	{
		System.out.println("������ ������ id Ȯ���� ���� ���� �̸��� �˻��մϴ�.");
		System.out.println(" ");
		int num = SearchName();
		
		if(num == -1)
		{
			return;
		}
		
		System.out.println("������ ������ id�� �Է��Ͻÿ�.");
		int id = Utils.getID(in); //��� �� �ǹ� ���� ��
		
		while(true)
		{
			System.out.println(vt1.get(num).name + " �����Ͻðڽ��ϱ�?(1: ��, 2: �ƴϿ�)");
			System.out.print("����>>>");
			int sel = in.nextInt();
			if(sel == 1)
			{
				vt1.removeElementAt(num);
				System.out.println("�ش� ������ �����Ͽ����ϴ�.");
				break;
			}
			else if(sel == 2)
			{
				System.out.println("�۾��� ����Ͽ����ϴ�.");
				break;
			}
			else
			{
				System.out.println("invalid! �ٽ� �����Ͻʽÿ�");
			}
			
		}
	
	}
}
