package day15;

import java.util.Scanner;

public class CustomerManager {

	private Customer[] user = new Customer[5];
	private int cnt;
	
	public void insertUser(Scanner scan) {//고객 등록
		
		System.out.println("성함을 입력해주세요 =>");
		String name = scan.next();
		System.out.println("아이디를 입력해주세요 =>");
		int id = scan.nextInt();
		System.out.println("실버 | 골드 | VIP");
		System.out.println("자기와 맞는 등급을 입력해주세요 =>");
		String grade = scan.next();
		
		//user[cnt] = new
		
	}
	
}
