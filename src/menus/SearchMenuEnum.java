package menus;

public enum SearchMenuEnum {
	SERCH(21, "일괄 조회"),
	FULL(22, "정규직 일괄 검색"),
	PART(23, "임시직 일괄 검색"),
	NAME(24, "이름 검색"),
	BACK(29, "돌아가기");
	
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
