package menus;

public enum UpdateMenuEnum {
	EDIT(31, "직원 정보 갱신(by id)"),
	BACK(39, "돌아가기");
	
	
		int code;
		String Message;
		
		UpdateMenuEnum(int code, String Message)
		{
			this.code = code;
			this.Message = Message;
		}

		
		public int getCode() {
			return code;
		}
		public String getMessage() {
			return Message;
		}
}
