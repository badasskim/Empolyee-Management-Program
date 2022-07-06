package menus;

public enum DeleteMenuEnum
{
	DELETE(41, "직원 정보 삭제 (by id)"),
	BACK(49, "돌아가기");
	
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
