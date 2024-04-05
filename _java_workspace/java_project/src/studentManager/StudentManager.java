package studentManager;

import java.util.Scanner;

public class StudentManager implements Program {

	private int cnt;
	private Student[] human = new Student[5];  //List<Student> list = new ArrayList<>();

	@Override
	public void insertStudent(Scanner scan) { // 학생 등록기능
		System.out.println("이름, 나이, 전화번호를 순서대로 입력 > ");
		String name = scan.next();
		int age = scan.nextInt();
		String phone = scan.next();
		// Student std = new Student(name, age, phone);
		human[cnt] = new Student(name, age, phone);
		System.out.println("학생이 등록되었습니다.");
		cnt++;
	}

	@Override
	public void searchStudent(Scanner scan) {// 학생 검색기능
		System.out.println("검색하실 학생 이름을 입력해주세요");
		String name = scan.next();
		for (int i = 0; i < cnt; i++) {
			if (human[i].getName().equals(name)) {
				human[i].printStudent();
				human[i].printSub();
			}
		}
		if (cnt == 0) {
			System.out.println("검색 결과가 없습니다.");
		}
	}

	@Override
	public void registerSubject(Scanner scan) {// 수강신청기능
		System.out.println("학생 이름을 입력해주세요 =>");
		String name = scan.next();
		for (int i = 0; i < cnt; i++) {
			if (human[i].getName().equals(name)) {
				System.out.println("자바 | 파이썬 | 빅데이터");
				System.out.println("위의 과목중에 무슨 수강과목을 들을건지 입력해주세요 =>");
				String subName = scan.next();
				human[i].add(subName);
				System.out.println(name + "님의  수강 신청이 완료되었습니다.");
			}
		}
		if (cnt == 0) {
			System.out.println("검색 결과가 없습니다.");
		}
	}

	@Override
	public void deleteSubject(Scanner scan) {// 수강철회기능
		System.out.println("학생 이름을 입력해주세요 =>");
		String name = scan.next();
		for (int i = 0; i < cnt; i++) {
			human[i].printSub();
			System.out.println(name+"님의 수강정보입니다. 철회하실 과목을 선택해주세요 =>");
			if (human[i].getName().equals(name)) {
				System.out.println("철회하실 수강명을 입력해주세요 =>");
				String subName = scan.next();
				human[i].mm(subName);
				System.out.println(name+"님의 "+subName+"과목 수강이 철회되었습니다.");
			}
		}
	}

	@Override
	public void printStudent() {// 학생리스트 출력
		for (int i = 0; i < human.length; i++) {
			if (human[i] != null) {
				human[i].printStudent();
			}
		}
		if (cnt == 0) {
			System.out.println("등록된 학생이 없습니다.");
		}
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public Student[] getStudent() {
		return human;
	}

	public void setStudent(Student[] student) {
		this.human = student;
	}

	public Student[] getHuman() {
		return human;
	}

	public void setHuman(Student[] human) {
		this.human = human;
	}
}
