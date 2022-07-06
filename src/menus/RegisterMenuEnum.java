package menus;

public enum RegisterMenuEnum {
	NEW(11, "정규직 등록"),
	NEW1(12, "임시직 등록"),
	BACK(19, "돌아가기");
	
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
