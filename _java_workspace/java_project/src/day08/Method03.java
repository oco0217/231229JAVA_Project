package day08;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		
		//정수 (2~9 중 하나)에 해당하는 구구단 출력 메서드
		//매개변수 : 2
		
		
		Scanner scan = new Scanner(System.in);
		
		
		gogo(8);
		
		scan.close();

	}
	
	//매개변수 : 2
	//리턴타입 : void 출력 => 리턴이 없음
	
	public static void gogo(int num1) {
		for(int i=1; i<=9; i++) {
			 System.out.printf("%d x %d = %d%n",num1,i,num1*i);
		}
	} 

}
