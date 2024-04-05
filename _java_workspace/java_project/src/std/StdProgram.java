package std;

import java.util.Scanner;

public interface StdProgram {

	void printStd(); //학생정보출력
	void addStd(Scanner scan);
	void modStd(Scanner scan); //학생정보 수정
	void delStd(Scanner scan);//학생 삭제
	void seachStd(Scanner scan);//학생 검색
	
	void addSub(Scanner scan);//점수 추가
	void modSub(Scanner scan); //점수 수정
	void delSub(Scanner scan); //점수 삭제
	
}
