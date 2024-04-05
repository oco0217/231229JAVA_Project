package day18;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx02 {

	public static void main(String[] args) {
		
		/*단어장
		 * 단어 5개를 입력받아 콘솔에 출력하는 기능
		 * ---단어장---
		 * hello : 안녕
		 * apple : 사과
		 * orange : 오렌지
		 * map에 저장 후 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		
		HashMap<String,String> name = new HashMap<String,String>();
		
		while(name.size()<5) {
			
			System.out.println("---<단어장>---");
			System.out.println("영어단어를 입력=>");
			String a = scan.next();
			if(a.equals("0")) {
				break;
			}
			System.out.println("영어 뜻 한글로 입력=>");
			String b = scan.next();
			name.put(a, b);
			System.out.println("단어장에 등록되었습니다.\n"+name.size()+"개 등록됨(최대 5개까지 등록가능)\n종료를 원하시면 0을 입력해주세요.");
			
			System.out.println("---등록된 단어---");
			for(String s : name.keySet()) {
				System.out.println(s + " : " + name.get(s));
			}
			if(a.equals("0")) {
				System.out.println("종료되었습니다.");
			}else if(name.size()==5) {
				System.out.println("등록가능한 단어가 5개를 초과하여 종료됩니다.");
			}
			
		}
		
		
		scan.close();

	}

}
