package day12;

public class 과제 {

	// TODO Auto-generated method stub
	/*- 학생 정보를 관리하기 위한 클래스
	 * -학생 기본정보 : 이름, 생년월일, 전화번호, 나이
	 * -학원 정보 : 학원명="EZEN"(final static), 지점
	 * -수강 정보 : 수강과목, 기간
	 * =>여러과목을 들을 수 있음(여러과목 수강하기 위해서는 배열로 처리 5과목까지 가능)
	 * 
	 * ex)홍길동 000101 010-1111-1111 25 
	 *    EZEN(인천)
	 *    자바 6개월, 파이썬 1개월, 빅데이터 3개월	
	 *    
	 *    기능(메서드)
	 *    -학생기본정보를 출력하는 기능
	 *    -학원정보를 출력하는 기능
	 *    -수강정보를 출력하는 기능
	 *    -학생의 수강정보를 추가하는 기능
	 */
	public static void main(String[] args) {

		Student st = new Student("홍길동", "000303", "010-1111-2222", 19, "inchen");
		st.setPhone("010-3462-1246");
//		st.printInfo();
//		st.printCompany();
//		st.printCourse();

		Student st1 = new Student("이순신", "020705", "010-3517-6632", 26, "inchen");
//		st1.printInfo();
//		st1.printCompany();
		st1.insertCourse("html", "1");
//		st1.printCourse();

		Student st2 = new Student("pack", "000110", "010-2126-4748", 23, "seoul");
//		st2.printInfo();
//		st2.printCompany();
		st2.insertCourse("java", "5");
//		st2.printCourse();

		Student st3 = new Student("김씨", "030813", "010-2175-4248", 23, "chuncheon");
		st3.insertCourse("엑셀", "2");
		st3.insertCourse("java", "5");
		st3.insertCourse("html", "1");

		Student st4 = new Student("이씨", "050313", "010-9175-4945", 30, "jeju");

		Student st5 = new Student("조씨", "030813", "010-2175-4248", 29, "seoul");
		st5.insertCourse("엑셀", "2");
		st5.insertCourse("java", "5");
		st5.insertCourse("html", "1");
		st5.insertCourse("python", "6");
		st5.insertCourse("c++", "4");

		Student st6 = new Student("박씨", "980703", "010-1923-3738", 27, "gimpo");
		st6.insertCourse("html", "1");
		st6.insertCourse("엑셀", "2");

		System.out.println("----------------------------------------");

		Student[] std = new Student[7];
		std[0] = st;
		std[1] = st1;
		std[2] = st2;
		std[3] = st3;
		std[4] = st4;
		std[5] = st5;
		std[6] = st6;

		String searchName = "김씨";
		// 김씨가 학생의 학생 정보,학원정보,수강정보를 출력
		System.out.println(searchName + "님의 검색 정보----");
		for (int i = 0; i < std.length; i++) {
			if (std[i].getName().equals(searchName)) {
				std[i].printInfo();
				std[i].printCompany();
				std[i].printCourse();
			}
		}

		System.out.println("----------------------------------------");

		// 인천지점의 학생들을 모두 검색하여 학생정보만 출력
		String a = "inchen";
		System.out.println(a + "지점의 학생정보");
		for (int i = 0; i < std.length; i++) {
			if (std[i].getBranch() != null) {
				if (std[i].getBranch().equals(a)) {
					std[i].printInfo();
				}
			}
		}

		System.out.println("----------------------------------------");

		// java과목을 수강하는 학생들만 검색하여 학생정보 / 학원정보 출력 조씨,김씨,pack 2,3,4
		String b = "java";
		System.out.println(b + "를 수강하는 학생정보");
//		for (int i = 0; i < std.length; i++) {
//			for (int j = 0; j < std[i].getCnt(); j++) {
//				if (std[i].getCourse()[j].equals(b)) {
//					std[i].printInfo();
//					std[i].printCompany();
//				}
//			}
//		}
		int cnt=0;
		while(cnt<std.length) {
			for(int i=0; i<std[cnt].getCourse().length; i++) {
				if(std[cnt].getCourse()[i] != null) {
					if(std[cnt].getCourse()[i].equals(b)) {
						std[cnt].printCompany();
						std[cnt].printInfo();
						std[cnt].printCourse();
					}
				}
			}
			cnt++;
		}
	}
}

class Student {

	// 멤버변수 선언
	private String name;
	private String birth;
	private String phone;
	private int age;
	private final static String COMPANY = "EZEN"; /// Final은 대문자로 변수명 처리
	private String branch;
	private String[] course = new String[5]; // 수강과목
	private String[] period = new String[5];
	private int cnt;// 배열의 index처리용 번지

	// 생성자
	public Student() {

	}

	public Student(String name, String phone, String branch) {
		this.name = name;
		this.phone = phone;
		this.branch = branch;
	}

	public Student(String name, String birth, String phone, int age, String branch) {
		this(name, phone, branch); // 생성자 호출(첫번째 라인에서만 호출가능)
		this.birth = birth;
		this.age = age;
	}

	// method
	public void printInfo() { // 학생의 기본정보 출력
		System.out.println("--학생 정보--");
		System.out.println("이름 : " + name + "(" + age + "세)" + birth + " / " + phone);
	}

	public void printCompany() {
		System.out.println("==학원정보==");
		System.out.println("학원명 : " + COMPANY + "/ " + branch + "지점");
	}

	// 수강정보 등록
	// insertCOurse()
	// 매개변수 course,period 주고 배열에 추가 (배열을 완성/ 리턴되는 값은 없음)
	public void insertCourse(String course, String period) {
		// cnt = 0 =>아직 추가값이 없음.
		if (cnt >= 5) {
			// 배열을 더늘려 더많은 수강을 받을 수도 있음(배열복사)
			System.out.println("더이상 수강하실 수 없습니다.");
			return;
		} else {
			this.course[cnt] = course;
			this.period[cnt] = period;
			cnt++;
		}

	}

	// 수강정보 출력
	public void printCourse() {
		// cnt까지만 출력 =>추가되자 않은 값은 출력x
		if (course.length == 0 || cnt == 0) {
			System.out.println("수강과목이 없습니다.");
			return;
		}
		for (int i = 0; i < cnt; i++) {
			System.out.println("과정 :" + course[i] + "(" + period[i] + "개월)");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public static String getCompany() {
		return COMPANY;
	}
}
