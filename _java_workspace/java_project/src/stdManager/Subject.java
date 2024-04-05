package stdManager;

public class Subject {
	/*멤버변수, 생성자, getter/setter, toString 순으로
	 */

	private String subname;//과목명
	private int subTime;//시수
	private String subProfessor;//담당교수
	private String subSchduler;//시간표
	
	//생성자
	public Subject() {}
	
	//과목명만 받는 생성자
	public Subject(String subname) {
		this.subname = subname;
	}

	//모두 받는 생성자
	public Subject(String subname, int subTime, String subProfessor, String subSchduler) {
		super();
		this.subname = subname;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subSchduler = subSchduler;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public int getSubTime() {
		return subTime;
	}

	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}

	public String getSubProfessor() {
		return subProfessor;
	}

	public void setSubProfessor(String subProfessor) {
		this.subProfessor = subProfessor;
	}

	public String getSubSchduler() {
		return subSchduler;
	}

	public void setSubSchduler(String subSchduler) {
		this.subSchduler = subSchduler;
	}

	@Override
	public String toString() {
		return "Subject [과목명 : " + subname + ", 시수 : " + subTime + ", 담당 교수 :" + subProfessor
				+ ", 시간표 :" + subSchduler + "]";
	}
	
	
	
}
