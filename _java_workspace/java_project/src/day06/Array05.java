package day06;

public class Array05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*문자열을 담는 배열을 생성
		 * 
		 */
		
		String arr[] = new String [5];
		
		arr[0] = "홍길동";
		arr[1] = "김영이";
		arr[2] = "박순이";
		arr[3] = "최영철";
		arr[4] = "박순철";
		
		for(int i=0; i<arr.length; i++) { //일반 for문
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//향상된 for문
		//탐색만 가능.
		System.out.println("향상된 for문");
		for(String s : arr) {
			System.out.print(s+ " ");		
		}
		System.out.println();
	}

}
