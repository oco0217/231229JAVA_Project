package std_ex;

import java.util.HashMap;
import java.util.Objects;

public class Student {
	
	private String name;
	private int age;
	private String phone;
	private HashMap<String, Integer> subject = new HashMap<>();
	private int sum;
	private double avg;
	
	public Student() {}
	
	public Student(String name) {
		this.name = name;
		this.age = 15;
	}
	
	public Student(String name,int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	//출력메서드 - 학생1명의 정보출력
	public void printOne() {
		System.out.print(name+"("+age+") / ");
		if(phone != null) {
			System.out.println(phone);
		}
		//System.out.println();
		if(subject.size()<=0) {
			System.out.println("점수가 없습니다");
			return;
		}
		printSub();
		calc();
		System.out.println("result : "+sum+"["+avg+"]");
		System.out.println("----------------");
	}
	//과목의 성적표 출력 Map 출력
	public void printSub() {
		System.out.println("--------------<성적표>-------------------");
		for(String sub : subject.keySet()) {
			System.out.println(sub+" : "+subject.get(sub));
		}
		System.out.println("---------------------------------");
	}
	//합계 평균 계산메서드
	public void calc() {
		this.sum=0;
		this.avg=0;
		for(String sub : subject.keySet()) {
			sum+=subject.get(sub);
		}
		avg = (double)sum / subject.size();
	}
	//과목 추가
	public void addSubject(String sub, int score) {	
		subject.put(sub, score);
	}
	//과목 삭제 
	public void delSubject(String sub) {
		
		if(subject.remove(sub)==null) {
			System.out.println("해당 과목이 없습니다");
			return;
		}else {
			subject.remove(sub);
		}
		
	}
	
	
	//getter / setter
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

	public HashMap<String, Integer> getSubject() {
		return subject;
	}

	public void setSubject(HashMap<String, Integer> subject) {
		this.subject = subject;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, avg, name, phone, subject, sum);
	}

	//해쉬함수에 의해 객체마다 고유의 번호 생성
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //주소가 내 겍체의 주소와 같다면 true
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //getClss(클래스의 정보) , 즉 클래스의 정보가 다르다면
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}

	
}
