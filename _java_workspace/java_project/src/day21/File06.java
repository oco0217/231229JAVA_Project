package day21;

import java.io.File;

public class File06 {

	public static void main(String[] args) {
		// 파일이 가지고 있는 정보 출력
		File f = new File("D:\\ChanWoong\\_java_workspace\\java_project\\test.txt");
		
		String name = f.getName(); //경로를 제외한 이름
		System.out.println(name);
		
		System.out.println(f.getPath()); //경로 + 이름
		
		System.out.println(f.getParent()); //경로
		
		System.out.println(File.separator); //파일 구분자 사용자마다 다 다름 이 컴퓨터는 (\)
		
		String f2 = f.toString(); //경로와 이름의 객체정보를 String으로 변환
		System.out.println(f2);
		
		//f2를 기준으로 파일명만 추출
		System.out.println("f2를 기준으로 파일명만 추출 : "+f2.substring(f2.lastIndexOf(File.separator)+1,f2.indexOf(".")));
	}

}
