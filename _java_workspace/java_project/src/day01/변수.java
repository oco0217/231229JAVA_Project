package day01;

public class 변수 {
	public static void main(String[] args) {
		/* 변수 선언
		 * 자료형(타입) 변수명;
		 * 
		 * 변수선언 + 초기화;
		 * 자료형(타입) 변수명 = 값;
		 */
		int num = 123; //선언+초기화
		System.out.println(num);
		
//		int num = 456; //변수는 중복선언 불가능.
		int num1 =123, num2 = 456, num3 =789; //같은 자료형의 한줄 선언 가능
		
		System.out.println(num1);
		
		num1 = 78;
		System.out.println(num1);
		
		//8개의 기본 자료형은 지역변수 범위(scope) { }
		//한글자만 저장가능한, char(한글자만 저장가능)
		//"문자열" , 숫자 , char 'a'
		//String =("문자열") / char('한글자만 가능')
		
		char ch = 'b';
		System.out.println(ch);
		
		double dou = 3.1;
		System.out.println(dou);
		
		byte b = 1;
		System.out.println(b);
		
		boolean boo = false; //true, false로만 저장 가능
		System.out.println(boo);
		
		//float / long 자료형은 접미사를 붙여야 사용 가능.
		//float(F) ,  long(L)
		
		float fl = 3.4F;
		System.out.println(fl);
		
		long lo = 10000000000L;
		System.out.println(lo);
		
		num1 = 010; //앞에 0으로 들어오면 8진수로 인식 (0~7 8 =>10)
		//10진수(0~9 => 10)     /     16진수(0~9(ABCDEF) 10=> 16)
		System.out.println(num1);
		
		num2 = 0x10;//16진수로 인식
		System.out.println(num2);
		
		//+ - * / %(나머지)
		
		num1 = 10;
		num2 = 20;
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num2/num1);
		System.out.println(num2/num1);
		
		//국어점수 (kor) , 영어점수(eng) , 수학점수(math) 변수로 선언하고,  값을 입력하여 ,  세 점수의 합을 콘솔에 출력 
		int kor = 78 , eng = 56 , math = 99;
		int sum = kor+eng+math;
		// + : 숫자 + 숫자 = 숫자(더하기연산자)
		// + : 숫자 + 문자 = 문자(연결연산자)
		System.out.println("합계 : "+kor+eng+math);
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+(kor+eng+math)/3.0); //정수 / 정수 =  정수  
		System.out.println("평균 : "+sum/3.0); 
		int a = 10;
		a += 10;
		System.out.println(a);	
		//
		System.out.println(++a);		
		System.out.println(a);
		a++;
		System.out.println(a);
		
	}
}
