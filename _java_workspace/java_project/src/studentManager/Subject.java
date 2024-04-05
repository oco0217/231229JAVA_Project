package studentManager;

public class Subject {

	private int code;
	private String subName;
	private String subT;
	
	public Subject() {}
	
	public Subject(String subName) {
		switch(subName) {
		
		case "자바":
		this.code = 02;
		this.subName = subName;
		this.subT = "홍길동";
		break;
		
		case "파이썬":
			this.code = 02;
			this.subName = subName;
			this.subT = "둘리";
			break;
			
		case "빅데이터":
			this.code = 02;
			this.subName = subName;
			this.subT = "도우너";
			break;
		
			default :
				System.out.println("잘못 입력된 값입니다.");
				break;
		}	
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getSubT() {
		return subT;
	}

	public void setSubT(String subT) {
		this.subT = subT;
	}
}
