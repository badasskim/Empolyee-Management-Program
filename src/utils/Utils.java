package utils;
import java.util.InputMismatchException;
import java.util.Scanner;
import employee.DepartmentEnum;
import employee.PositionEnum;

public class Utils {
	
	static public int checkInputInteger(Scanner s, String msg) 
	{
		int n=0;
		boolean valid; // ��ȿ�� �� �Է� Ȯ��
		
		do 
		{
				valid = true;
				System.out.print(msg);
	
				try
				{
					n = s.nextInt(); // ���� �Է�
				}
				catch(InputMismatchException e) 
				{ // ���� �Է� Ȯ��
					System.out.println("���� �Է��ϼ���.");
					s.next(); // �Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū�� ������.
					valid = false;
				}
		} while(!valid);
		
		return n;
	}
	
	public static int getID(Scanner s) 
	{
		int id = Utils.checkInputInteger(s, ">> id: ");
		return id;
	}
	
	public static String getName(Scanner s) 
	{
		String name=null;
		System.out.print(">> name: ");
		name = s.next(); 
		
	
		// �ڵ� �ۼ�
		return name;
	}

	public static DepartmentEnum getDepartment(Scanner s) {
		int dept;
		DepartmentEnum department = null;
		while(true) {
			System.out.print("== �μ� ���: ");
			for(DepartmentEnum d : DepartmentEnum.values()) {
				System.out.print(d.getMessage() + "(" + d.getCode() + ") ");
			}
			System.out.println("");
			dept = Utils.checkInputInteger(s, ">> department: ");
			
			// ��ȿ�� �� �Է� Ȯ��
			boolean valid = false;
			for(DepartmentEnum d : DepartmentEnum.values()) {
				if(dept == d.getCode()) {
					valid = true;
					department = d;
					break;
				}
			}
			if(valid)
			{
				break;
			}
		}
		return department;
	}
	
	public static PositionEnum getPosition(Scanner s) {
		int pos;
		PositionEnum position = null;

		while(true)
		{
			System.out.print("== ���� ���: ");
			for(PositionEnum p : PositionEnum.values())
			{
				System.out.print(p.getMessage() + "(" + p.getCode() + ") ");
			}
			System.out.println("");
			pos = Utils.checkInputInteger(s, ">> position: ");
			
			boolean valid = false;
			for(PositionEnum p : PositionEnum.values()) {
				if(pos == p.getCode()) {
					valid = true;
					position = p;
					break;
				}
			}
			if(valid) 
			{
				break;
			}
		}
		// �ڵ� �ۼ�
		return position;
	}
	
	public static int getGrade(Scanner s) {
		int grade = -1;
		
		// �ڵ� �ۼ�
		grade = Utils.checkInputInteger(s, ">> grade: ");
		
		
		return grade;
	}

	public static int getHours(Scanner s) {
		int hours = -1;
		
		// �ڵ� �ۼ�
		hours = Utils.checkInputInteger(s, ">> hours: ");
		return hours;
	}
	
}
