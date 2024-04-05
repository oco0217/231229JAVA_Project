package day06;

public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* String 클래스 = 문자열을 다루기 위한 클래스 => 참조변수
		 * String str = new String();
		 * String str = "홍길동";  //일반 자료형처럼 이용 가능
		 * 
		 */
		
		String str = "홍길동!!!!!!";
		System.out.println(str);
		String str1 = new String();
		str1 = "홍길순";
		
		System.out.println(str1);
		
		
		//length : 전체 글자의 길이 (총 글자수)
		System.out.println("---length---");
		System.out.println(str.length());
		
		
		//charAt(index) : index번지에 있는 문자열을 반환
		System.out.println("---charAt(index)");
		System.out.println(str.charAt(0));
		
		
		//subString : 문자열를 추출
		System.out.println("---subString---");
		System.out.println(str.substring(1,3)); //0번지부터 2번지 전까지 추출(2번지는 포함x)
		System.out.println(str.substring(1));   //1번지부터 끝까지.
		
		//str.compareTo(str1) : str과 str1을 비교하여 앞이면 -1, 같으면 0, 뒤면 +1 로 return
		System.out.println("---compareTo---");
		System.out.println("g".compareTo("a"));
		System.out.println("a".compareTo("g"));
		System.out.println("banana".compareTo("apple"));  //나중에 글자들을 정렬할때 사용
		
		//concat : 이어붙이기(+연산자와 같은 의미) 
		System.out.println("---concat---");
		System.out.println("Hello ".concat("Java"));  //DB에서 많이 사용 
		System.out.println("Hello Java");
		
		//equals : 두 문자열이 같은지 비교(대소문자 구분) 같으면 true, 다르면 false 를 return
		//문자는 ==로 비교가 안됨.
		//잠조 변수는 ==로 비교하게 되면 주소가 같은지 확인 
		
		System.out.println("---equals---");
		System.out.println("abc".equals("def"));  //false
		System.out.println("abc".equals("abc"));  //true
	
	//indexOf : 문자의 위치(intdex)를 찾아주는 기능, 찾는 문자가 없으면 -1을 리턴
	//lastIndexOf : 문자의 위치를 뒤에서부터 찾아주는 기능
	
		System.out.println(str.indexOf("동"));
		System.out.println(str.indexOf("!"));
		System.out.println(str.lastIndexOf("!"));
		System.out.println(str.indexOf("&"));
		
		
		System.out.println("---이메일에서 ID를 추출---");
		String email = "dfsdnv@gmail.com";
		
		String id = email.substring(0,email.indexOf("@")); 
		
		System.out.println(email.substring(email.indexOf("@")));
		

		}
}
