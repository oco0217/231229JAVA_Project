package stdManager;

import java.util.Scanner;

public class StudentManager implements Program{

	
	//학생의 배열값을 멤버변수
	private Student[] studentList= new Student[5];
	
	//intdex처리 변수
	private int stdCnt;

	
	@Override
	public void insertStudent(Scanner scan) {
		//1명의 학생정보를 입력받아서 객체를 생성한 후 studentList에 추가
		System.out.println("학번>");
		String stdNum = scan.next();
		System.out.println("학생명");
		String name = scan.next();
		System.out.println("전화번호");
		String phone = scan.next();
		
		//입력받은 값을 객체로 생성
		Student s = new Student(stdNum, name, phone);
		
		//배열이 다 찼을경우 배열복사
		if(stdCnt==studentList.length) {
			Student[] tmp = new Student[studentList.length+5];
			System.arraycopy(studentList, 0, tmp, 0, stdCnt);
		}
		studentList[stdCnt] = s;
		stdCnt++;
	}

	@Override
	public void searchStudent(Scanner scan) {
		//검색할 학생이름을 입력받아 배열에서 탐색 후 있다면 
		//학생정보 + 수강정보 출력
		System.out.println("검색할 학생명 =>");
		String searchName = scan.next();
		for(int i=0; i<stdCnt; i++) {
			if(searchName.equals(studentList[i].getStdName())) {
				studentList[i].stdPrint();
				studentList[i].subPrint();
				return;
			}
		}
		System.out.println("검색한 이름이 없습니다.");
	}

	@Override
	public void registerSubject(Scanner scan) {	
		//누가 무슨과목을 추가할지 결정
		//수강신청할 학생이름을 입력받아 
		System.out.println("수강신청 학생명>");
		String name = scan.next();
		int index = 1; //학생의 번지를 저장하기 위한 변수
		//학생의 위치를 탐색 후 
		for(int i=0; i<stdCnt; i++) {
			if(name.equals(studentList[i].getStdName())) {
				index = i;
				break;
			}
		}
		//학생이 없다면...
		if(index==1) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		//그 학생의 배열에 수강과목[]을 추가
		//수강과목의 객체를 생성
		System.out.println("수강신청 과목");
		String sName = scan.next();
		Subject s = new Subject(sName);
		//Student클래스의 insertSubject 호출 (해당 배열에 추가)
		studentList[index].insertSubject(s);
	}

	@Override
	public void deleteSubject(Scanner scan) {
		//누가 무슨과목을 삭제할지 결정
				//수강삭제할 학생이름을 입력받아 
				System.out.println("수강삭제 학생명>");
				String name = scan.next();
				int index = 1; //학생의 번지를 저장하기 위한 변수
				//학생의 위치를 탐색 후 
				for(int i=0; i<stdCnt; i++) {
					if(name.equals(studentList[i].getStdName())) {
						index = i;
						break;
					}
				}
				//학생이 없다면...
				if(index==1) {
					System.out.println("학생정보가 없습니다.");
					return;
				}
				//그 학생의 배열에 수강과목[]을 추가
				//수강과목의 객체를 생성
				System.out.println("수강삭제 과목");
				String sName = scan.next();
				studentList[index].deleteSubject(sName);
		
	}

	@Override
	public void printStudent() {
		System.out.println("-----전체 학생 정보-----");
		for(int i=0; i<stdCnt; i++) {
			studentList[i].stdPrint(); //학생 정보 출력
		}
	}

}
