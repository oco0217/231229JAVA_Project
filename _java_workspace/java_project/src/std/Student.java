package std;

import java.util.HashMap;

public class Student {

	// 멤버변수 : 이름,나이, 전화번호, HashMap(과목,점수) , 합계 , 평균
	// 생성자, 메서드,getter / setter, 출력메서드
	// 메서드 - 출력메서드 (학생정보, 과목점수(성적표), 합계, 평균)
	// 메서드 - map 과목,점수 데이터를 추가 메서드
	// 메서드 - map 과목,점수 데이터를 삭제 메서드
	
	//멤버변수는 private로설정(캡슐화) / 메서드 public 
	//클래스명은 대문자로 시작, 변수명,메서드명은 소문자로 시작
	//변수명,메서드명에 단어가 많아지면 다음 시작단어 대문자 (카멜케이스 기법)
	//indent : 들여쓰기 잘 맞추기 

	private String name;
	private int age;
	private String phone;
	private HashMap<String, Integer> stdList = new HashMap<>();
	private int sum;
	private double evg = (double) sum / stdList.size();

	// 생성자
	public Student() {
	}

	public Student(String name, int age, String phone) {

		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	// 메서드

	// 학생정보 1명 프린트 메서드
	public void stdInfo() {

		System.out.printf("이름 : %s (%d)세| P.H : %s%n", name, age, phone);
		if(sum>0) {
			System.out.print(name + "님의 성적 :");			
		}else {
			System.out.println("성적 정보 없음");
			return;
		}
		for (String s : stdList.keySet()) {
			System.out.printf("<%s> : %d점 | ", s, stdList.get(s));
		}
		if (sum > 0) {
			System.out.printf("%n합계 : %d점 | 평균 : %.2f점%n", sum, sum / (double) stdList.size());
		}
	}

	// 학생과목 점수 추가 메서드
	public void stdAdd(String name, int score) {

		stdList.put(name, score);

		sum += score; // 점수 저장
	}

	// 학생과목 점수 삭제 메서드
	public void stdDel(String name) {

		sum -= stdList.remove(name); // 리턴값으로 점수 제거
		stdList.remove(name);

	}

	// getter / setter
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

	public HashMap<String, Integer> getStdList() {
		return stdList;
	}

	public void setStdList(HashMap<String, Integer> stdList) {
		this.stdList = stdList;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getEvg() {
		return evg;
	}

	public void setEvg(double evg) {
		this.evg = evg;
	}

}
