package day21;

import java.io.IOException;

public class File02 {

	public static void main(String[] args) {
		//System.in을 이용하여 알파벳 하나를 쓰고
		//Enter를 누르면 알파벳을 콘솔에 찍기
		//반복하기.
		
		System.out.println("알파벳 입력>");
		
		try {
			int a;
			while((a = System.in.read())!='\n') {		
				System.out.println((char)a);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
