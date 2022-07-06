package menus;

public enum SearchMenuEnum {
	SERCH(21, "�ϰ� ��ȸ"),
	FULL(22, "������ �ϰ� �˻�"),
	PART(23, "�ӽ��� �ϰ� �˻�"),
	NAME(24, "�̸� �˻�"),
	BACK(29, "���ư���");
	
	int code;
	String message;
	
	SearchMenuEnum(int code, String message)
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
