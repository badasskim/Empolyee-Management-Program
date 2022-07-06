package employeeTest;

import java.util.Scanner;

import employee.EmployeeSet;
import menus.DeleteMenuEnum;
import menus.MainMenuEnum;
import menus.Menu;
import menus.RegisterMenuEnum;
import menus.SearchMenuEnum;
import menus.UpdateMenuEnum;


public class EmployeeTest 
{
	public static void main(String[] args) 
	{
		Menu menu = new Menu();
		Scanner scanner = new Scanner(System.in);
		EmployeeSet set = new EmployeeSet();
		
		while(true) 
		{
			MainMenuEnum mm = menu.MainMenu(scanner);
			
			if(mm == MainMenuEnum.REGISTER)
			{
				System.out.println("Register");
				
				// ���� ��� �޴� ��� �� �Է� ó��
				while(true) 
				{
					RegisterMenuEnum rm = menu.RegisterMenu(scanner);
					if(rm == RegisterMenuEnum.NEW)
					{
					
						set.RegisterFullTimeEmp(scanner);
					}
					else if(rm == RegisterMenuEnum.NEW1)
					{
					
						set.RegisterPartTimeEmp(scanner);
					}
					else if(rm == RegisterMenuEnum.BACK)
					{
						break;
					}
				}
			}
			
			else if(mm == MainMenuEnum.SEARCH) {
				System.out.println("Search");
				while(true) 
				{
					SearchMenuEnum sm = menu.SearchMenu(scanner);
					if(sm == SearchMenuEnum.SERCH)
					{
						System.out.println(">>>�ϰ� �˻�<<<");
						set.SearchAll();
					}
					else if(sm == SearchMenuEnum.PART)
					{
						System.out.println(">>>�ӽ��� �˻�<<<");
						set.SearchPart();
					}
					else if(sm == SearchMenuEnum.FULL)
					{
						System.out.println(">>>������ �˻�<<<");
						set.SearchFull();
					}
					else if(sm == SearchMenuEnum.NAME)
					{
						set.SearchName();
					}
					else if(sm == SearchMenuEnum.BACK)
					{
						break;
					}
				}
			}
			
			
			else if(mm == MainMenuEnum.UPDATE)
			{
				System.out.println("UPDATE");
				
				while(true)
				{
					UpdateMenuEnum um = menu.UpdateMenu(scanner);
					if(um == UpdateMenuEnum.EDIT)
					{
						set.rename();
					}
					else if(um == UpdateMenuEnum.BACK)
					{
						break;
					}
					
				}
			}
			
			else if(mm == MainMenuEnum.DELETE)
			{
				System.out.println("DELETE");
				
				while(true)
				{
					DeleteMenuEnum um = menu.DeleteMenu(scanner);
					if(um == DeleteMenuEnum.DELETE)
					{
						set.deleteId();
					}
					else if(um == DeleteMenuEnum.BACK)
					{
						break;
					}
					
				}
			}
			
			else if(mm == MainMenuEnum.EXIT) {
				System.out.print("Good BYE!");
				scanner.close();
				break;
			}
			
		}
		scanner.close();
	}
}
