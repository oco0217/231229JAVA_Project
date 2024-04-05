package day11;


public class 과제 {

	public static void main(String[] args) {
		/*
		 * 메서드를 이용하여 작업. 두 정수의 값이 주어졌을 때 두 정수 사이의 모든 정수의 합을 리턴하는 메서드 
		 * ex) a=3,b=5 => 3+4+5 
		 * ex)a=5, b=1 => 1+2+3+4+5 
		 * ex)a=3, b=3 => 3
		 */
		
		과제 test = new 과제();
		
		System.out.println(test.result(3,5));
		System.out.println(test.result(5,1));
		System.out.println(test.result(3,3));
		System.out.println("---result2");
		System.out.println(test.result2(3,5));
		System.out.println(test.result2(5,1));
		System.out.println(test.result2(3,3));

	}

	//들어가는 값(매개변수) , 나오는 값(리턴타입)
	//매개변수 : int a, int b / 리턴타입 : 합(int)
	public int result(int a, int b) {
		//a와 b사이의 모든값을 합계
		//a와 b를 비교하여 무조건 작은수부터 시작

		int sum = 0;
		if (a > b) { //a가 b보다 큰 경우
			for (int i = b; i <= a; i++) {
				sum += i;
			}
		} else if (a < b) {//
			for (int i = a; i <= b; i++) { //a는 작은값,b는 큰값
				sum += i;
			}
		}else if(a==b){
			sum += a;
		}else {
			return -1;
		}
		return sum;
	}
	
	public int result2(int a, int b) {
		
		int sum = 0;
		//a는 작은값, b는 큰값
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		for(int i=min; i<=max; i++) {
			sum += i;
		}
		return sum;
	}
}
