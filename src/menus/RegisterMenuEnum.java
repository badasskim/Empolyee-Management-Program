package menus;

public enum RegisterMenuEnum {
	NEW(11, "������ ���"),
	NEW1(12, "�ӽ��� ���"),
	BACK(19, "���ư���");
	
	int code;
	String message;
	
	RegisterMenuEnum(int code, String message)
	{
		this.code = code;
		this.message =message ;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}
	
}
