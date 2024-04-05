package studentManager;

public class Student {

	private String name;
	private int age;
	private String phone;
	private int scnt;
	private Subject[] sub = new Subject[3];

	public Student() {
	}

	public Student(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Subject[] getSub() {
		return sub;
	}

	public void setSub(Subject[] sub) {
		this.sub = sub;
	}

	public int getCnt() {
		return scnt;
	}

	public void setCnt(int cnt) {
		this.scnt = cnt;
	}

	// 학생정보 출력 메서드
	public void printStudent() {
		System.out.printf("이름 : %s | 나이 : %d | 전화번호 : %s%n", name, age, phone);
		System.out.println();
	}

	// 수강과목 추가 메서드
	public void add(String subName) {

		sub[scnt] = new Subject(subName);
		scnt++;
	}

	// 수강과목 삭제 메서드
	public void mm(String subName) {

		int count=0;
		
		for (int i = 0; i < scnt; i++) {
			if (sub[i].getSubName().equals(subName)) {
			for(int j=0; j<-scnt-i; j++) {
				sub[i+j] = sub[i+(j+1)];
			}
				count = i;
				}
			}
		for (int j = 0; j<=scnt-count; j++) {
			sub[count+j] = sub[count+(j+1)];
		}
			sub[scnt-1] = null;
			scnt--;
	}

	// 수강과목 출력 메서드
	public void printSub() {
		System.out.print("수강과목 :");
		for (int i = 0; i < scnt; i++) {
			if (sub[i] != null) {
				System.out.print(
						"수강명:" + sub[i].getSubName() + " | 수강코드:" + sub[i].getCode() + " | 교수님 :" + sub[i].getSubT());
				System.out.println();
			}
		}
		System.out.println();
		if (scnt == 0) {
			System.out.println("수강중인 과목이 없습니다.");
		}
	}
}
