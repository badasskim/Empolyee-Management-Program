package menus;

public enum DeleteMenuEnum
{
	DELETE(41, "���� ���� ���� (by id)"),
	BACK(49, "���ư���");
	
	int code;
	String message;
	
	DeleteMenuEnum(int code, String messege)
	{
		this.code = code;
		this.message = messege;
	}
	
	public int getCode()
	{
		return code;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	
}
