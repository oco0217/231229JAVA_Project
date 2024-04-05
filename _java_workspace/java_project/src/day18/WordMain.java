package day18;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {

		/*
		 * 단어장 프로그램 작성 1.단어등록 |2.단어 검색 | 3.단어수정 | 4.단어출력 | 5.단어삭제 | 6.종료 Wordmanager
		 * 클래스를 생성하여 메서드 구현 map을 이용하여 단어 등록 기본단어 등록 (5가지 등록) 메인에서는 do - while문으로 설정.
		 */

		Scanner scan = new Scanner(System.in);

		WordManager user = new WordManager();

		int menu = 0;

		System.out.println("-----단어장 프로그램-----");
		do {
			System.out.println("1.단어등록 |2.단어 검색 | 3.단어수정 | 4.단어출력 | 5.단어삭제 | 6.단어파일출력 | 7.종료");
			System.out.println("원하는 메뉴 입력=>");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				user.wordAdd(scan);
				break;
			case 2:
				user.wordSearch(scan);
				break;
			case 3:
				user.wordAdj(scan);
				break;
			case 4:
				user.wordPrint(scan);
				break;
			case 5:
				user.wordDel(scan);
				break;
			case 6:
				user.wordTextPrint();
				break;
			case 7:
				System.out.println("프로그램 종료중...");
				break;
			default:
				System.out.println("잘못 입력된 값입니다. 다시 입력해주세요.");
				break;
			}

		} while (menu != 7);
		
		System.out.println("프로그램이 종료되었습니다.");

		scan.close();

	}

}
