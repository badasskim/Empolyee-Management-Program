package menus;

public enum UpdateMenuEnum {
	EDIT(31, "���� ���� ����(by id)"),
	BACK(39, "���ư���");
	
	
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
