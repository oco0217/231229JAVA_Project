package std;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StdManager implements StdProgram {

	// 멤버 변수

	private List<Student> var = new ArrayList<Student>();

	// 생성자
	public StdManager() {
	}

	@Override
	public void printStd() { // 학생 리스트

		int index = 0;

		System.out.println("-----학생 리스트-----");

		for (Student s : var) {
			s.stdInfo();
			System.out.println("------------------------------------");
			index++;
		}
		if (index == 0) {
			System.out.println("등록되어 있는 학생이 없습니다.");
		}
	}

	@Override
	public void addStd(Scanner scan) { // 1.학생 추가
		System.out.println("-----<학생 등록>-----");
		System.out.println("이름 입력>");
		String name = scan.next();
		System.out.println("나이 입력>");
		int age = scan.nextInt();
		System.out.println("전화번호 입력>");
		String phone = scan.next();
		var.add(new Student(name, age, phone));
		System.out.println("등록이 완료되었습니다.");

	}

	@Override
	public void modStd(Scanner scan) { // 학생정보 수정

		int count = 0;
		
		System.out.println("학생성명 입력=>");
		String name = scan.next();
		for (Student s : var) {
			if (s.getName().contains(name)) {

				String menu = "";
				System.out.println("이름 | 나이 | 전화번호");
				System.out.println("위에 중에 수정할 정보를 입력=>");
				menu = scan.next();
				
				while (count<1) {
					System.out.println("-----<정보수정란>----->");
					
					switch (menu) {

					case "이름":
						System.out.println("수정할 이름 입력>");
						name = scan.next();
						s.setName(name);
						count++;
						break;
					case "나이":
						System.out.println("수정할 나이 입력>");
						int age = scan.nextInt();
						s.setAge(age);
						count++;
						break;
					case "전화번호":
						System.out.println("수정할 전화번호 입력>");
						String phone = scan.next();
						s.setPhone(phone);
						count++;
						break;
					default:
						System.out.println("잘못 입력된 값입니다. 다시입력해주세요.");
						break;
					}
				}
				System.out.println("수정이 완료되었습니다.");
				return;
			}
		}
		System.out.println("검색한 이름이 없습니다.");

	}

	@Override
	public void delStd(Scanner scan) {

		System.out.println("-----<정보삭제란>----->");
		System.out.println("삭제하실 학생성명 입력=>");
		String name = scan.next();
		for (Student s : var) {
			if (s.getName().equals(name)) {
				var.remove(s);
				System.out.println("삭제가 완료되었습니다.");
				return;
			}
		}
		System.out.println("검색하신 이름이 없습니다.");
	}

	@Override
	public void seachStd(Scanner scan) { // 학생 검색

		System.out.println("정보를 확인하실 학생성명 입력=>");
		String name = scan.next();
		for (Student s : var) {
			if (s.getName().equals(name)) {
				s.stdInfo();
				return;
			}
		}
		System.out.println("검색하신 이름이 없습니다.");
	}

	@Override
	public void addSub(Scanner scan) { //과목추가

		System.out.println("과목을 추가하려는 학생성명 입력=>");
		String name = scan.next();
		for (Student s : var) {
			if (s.getName().contains(name)) {
				System.out.println("추가하실 과목명 =>");
				name = scan.next();
				System.out.println("과목 점수 입력=>");
				int score = scan.nextInt();
				s.stdAdd(name, score);
				System.out.println("과목 추가가 완료되었습니다.");
				return;
			}
		}
		System.out.println("검색하신 이름이 없습니다.");
	}

	@Override
	public void modSub(Scanner scan) { // 과목 수정
		System.out.println("과목을 수정하실 학생성명 입력=>");
		String name = scan.next();
		for (Student s : var) {
			if (s.getName().contains(name)) {
				System.out.println("수정하실 과목명 입력");
				String subName = scan.next();	
				if (s.getStdList().keySet().contains(subName)) {
					s.stdDel(subName);
					System.out.println("수정될 과목을 입력=>");
					subName = scan.next();
					System.out.println("점수를 입력=>");
					int score = scan.nextInt();
					s.stdAdd(subName, score);
					System.out.println("과목 수정이 완료되었습니다.");
					return;
				} else {
					System.out.println("검색한 과목이 존재하지 않습니다.");
					return;
				}
			}
		}
		System.out.println("검색한 이름이 존재하지 않습니다.");
	}

	@Override
	public void delSub(Scanner scan) { // 점수 삭제

		System.out.println("과목을 삭제하실 학생성명 입력=>");
		String name = scan.next();
		for (Student s : var) {
			if (s.getName().contains(name)) {
				System.out.println("삭제하실 과목명 입력");
				String subName = scan.next();
				if (s.getStdList().keySet().contains(subName)) {
					s.stdDel(subName);
					System.out.println("과목 삭제가 완료되었습니다.");
					return;
				} else {
					System.out.println("검색한 과목이 존재하지 않습니다.");
				}
			}
		}
		System.out.println("검색한 이름이 존재하지 않습니다.");

	}
// 학생 리스트 생성 후 Program, 메서드 구현

	public List<Student> getVar() {
		return var;
	}

	public void setVar(List<Student> var) {
		this.var = var;
	}
	
	

}
