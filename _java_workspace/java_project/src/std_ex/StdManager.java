package std_ex;

import java.util.ArrayList;
import java.util.Scanner;

public class StdManager implements StdProgram_ex {

	private ArrayList<Student> list = new ArrayList<>();

	public void add() {
		list.add(new Student("홍길동"));
		list.add(new Student("영이"));
		list.add(new Student("순신"));
		list.add(new Student("감찬"));
		list.add(new Student("순이"));
	}

	public void printStudent() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).printOne();
		}
	}

	public void delStd(Scanner scan) {
		System.out.println("학생명>");
		String name = scan.next();
		boolean result = list.remove(new Student(name));
		if (!result) {
			System.out.println("학생이 없습니다");
			return;
		}
		System.out.println("학생 삭제 완료");
	}

	@Override
	public void printStd() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addStd(Scanner scan) {
		System.out.println("학생명>");
		String name = scan.next();
		System.out.println("나이>");
		int age = scan.nextInt();
		System.out.println("전화번호>");
		String phone = scan.next();

		list.add(new Student(name, age, phone));
		System.out.println("학생추가 완료");

	}

	@Override
	public void modStd(Scanner scan) {
		System.out.println("학생명>");
		String name = scan.next();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				System.out.println("수정할 정보(이름,나이,폰 중 하나 입력)>");
				String op = scan.next();
				System.out.println("수정할 값 입력");
				switch (op) {
				case "이름":
					String modName = scan.next();
					list.get(i).setName(modName);
					break;
				case "나이":
					int modAge = scan.nextInt();
					list.get(i).setAge(modAge);
					break;
				case "폰":
					String modPhone = scan.next();
					list.get(i).setPhone(modPhone);
					break;
				default:
					System.out.println("정보가 존재하지 않습니다..");
					break;
				}
				System.out.println("수정 완료");
				return;
			}
		}
		System.out.println("학생이 없습니다.");
	}

	@Override
	public void seachStd(Scanner scan) {
		System.out.println("학생명>");
		String name = scan.next();
		for (Student s : list) {
			if (s.getName().equals(name)) {
				s.printOne();
				return;
			}
		}
		System.out.println("검색된 학생이 없습니다.");
	}

	@Override
	public void addSub(Scanner scan) {
		System.out.println("학생명>");
		String name = scan.next();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				System.out.println("과목명>");
				String sub = scan.next();
				System.out.println("점수>");
				int score = scan.nextInt();
				list.get(i).addSubject(sub, score);
				System.out.println("점수 추가 완료");
				return;
			}
		}
		System.out.println("학생이 없습니다.");
	}

	@Override
	public void modSub(Scanner scan) {
		System.out.println("학생명>");
		String name = scan.next();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				System.out.println("수정할 과목>");
				String sub = scan.next();
				System.out.println("수정할 점수>");
				int score = scan.nextInt();
				//list.get(i).delSubject(sub);
				//map 중복 불가능. 그냥 add해도 덮어씀.
				list.get(i).addSubject(sub, score); //추가
				System.out.println("점수 수정 완료");
				return;
			}
		}
		System.out.println("학생이 없습니다.");

	}

	@Override
	public void delSub(Scanner scan) {
		System.out.println("학생명>");
		String name = scan.next();	
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				list.get(i).delSubject(name);
				System.out.println("점수 삭제 완료");
				return;
			}
		}
		System.out.println("학생이 없습니다.");

	}

}
