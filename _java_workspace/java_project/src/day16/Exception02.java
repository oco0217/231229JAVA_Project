package day16;

public class Exception02 {

	public static void main(String[] args) {
		// ArithmeticException: : 0으로 나누었을 때 발생하는 Exception

		
		try {
			//예외가 발생할 수 있는 구문 작성
			System.out.println(math(4, 8, '+'));
			System.out.println(math(12, 6, '-'));
			System.out.println(math(0, 0, '/'));
			System.out.println(math(4, 3, '*'));
			System.out.println(math(1, 0, '-'));
			
		}
		catch(Exception err) {
			//예외 처리 작성
			System.out.println(err.getMessage()); //메시지 String을 출력
			//System.out.println("에러가 발생하였습니다. ");
			//err.printStackTrace();
		}
		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
		System.out.println(math(9, 5, '+'));
		System.out.println(math(4, 1, '-'));
		System.out.println(math(3, 2, '/'));
		System.out.println(math(10, 5, '%'));
		
	}
	//예외 발생시키기 throw new 를 발생 시킬 수 있음.
	//throw : 예외 떠넘기기
	//예외를 발생시키게 되면 메서드 선언부 끝 부분에 throws를 적고, 발생할 수 있는 
	//예외를 반드시 적어줘야 함.
	//throws는 RuntimeException만 예외적으로 생략가능.
	
	
	// 기능 : 두 수를 입력받고, 연산자를 입력받아 4칙연산의 결과를 리턴하는 메서드
	// 매개변수 int num1, int num2 chr op
	// 하단에서 만든 메서드 실행.
	// 예외처리
	
	public static int math(int num1, int num2, char op) throws RuntimeException{

		//연산자가  / %인 경우 num2가 0이면 예외 발생
		
		if((op=='%'||op=='/')&&(num2==0)) {
			//예외 미리 발생시키기.
			throw new RuntimeException("몫과 나머지를 구할때 num2는 0이 될 수 없습니다.");
		}
		
		switch (op) {
		case '+':
			return num1+num2;
		case '-':
			return num1-num2;
		case '*':
			return num1*num2;
		case '/':
			return num1/num2;
		case '%':
			return num1%num2;
		default:
			throw new RuntimeException(op+"는 산술연산자가 아닙니다.");
		}
	}

}
