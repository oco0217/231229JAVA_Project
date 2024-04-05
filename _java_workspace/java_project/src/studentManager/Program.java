package studentManager;

import java.util.Scanner;

public interface Program {
	
	 void insertStudent(Scanner scan); //-학생 등록 기능 (모든 학생출력)
	 void searchStudent(Scanner scan); //-학생 검색기능 (1명의 학생과 수강하는 과목 등등)
	 void registerSubject(Scanner scan); //-수강신청기능
	 void deleteSubject(Scanner scan); //-수강철회기능
	 void printStudent(); //-학생리스트 출력기능
}
