package day07;

public class StringEx01 {

	public static void main(String[] args) {
		
		/*file에 저장되어있는 문자를 파일명과 확장자로 분리하여 출력
		 *파일명 : 이것이자바다 
		 *확장자 : java
		 */

		String file = "이것이 자바다.java";
		
		String file_name = file.substring(0,(file.indexOf(".")));
		String hac = file.substring((file.indexOf(".")+1));
		
		System.out.printf("파일명 : %s%n확장자 : %s",file_name,hac);
		
		System.out.println();
		
		System.out.println(file.contains("java"));
		
		//contains : 해당 문자를 포함하는지 체크 boolean
		if(file.contains("java")) {
			System.out.println("자바파일입니다.");
		}
		
		
		
		String str = "이것이 자바다.java";
		String[] arr1 = str.split("\\.");
		
		for(String s : arr1) {
			
			String[] i = {"파일명 : ","확장자 : "};
			System.out.println();
		}
		
		
	}

}
