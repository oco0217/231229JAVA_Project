package day16;
public class Exception06 {

	public static void main(String[] args) {
		// 메서드에서 생성된 배열 출력
		int start = 1, count = 3, size = 11;

		try {
			Exception06 ex = new Exception06();
			ex.printArr(ex.add(size, start, count));
			System.out.println();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			 //e.printStackTrace();
		}
		System.out.println();

		try {
			int arr[] = new int[-5];
			Exception06 ex1 = new Exception06();
			ex1.printArr(ex1.out(arr, start, count));
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// 메서드 생성
	/*
	 * 기능 : size를 매개변수로 입력받아 size만큼의 길이를 가지는 배열을 생성하여 랜덤값을 채워 배열을 리턴 랜덤값의 범위는 매개변수
	 * 입력 start(시작값),count(개수)
	 * 
	 * - size가 0보다 작다면 예외발생 count개수가 0보다 작다면 예외 발생
	 */

	public int[] add(int size, int start, int count){

		if (size <= 0 ) { 
			throw new RuntimeException("배열(size)의 길이는 음수가 될 수 없습니다.");
		}	
		if (count < 0) { 
			throw new RuntimeException("count의 길이는 음수가 될 수 없습니다.");
		}

		int[] n = new int[size];

		for (int i = 0; i < size; i++) {
			n[i] = (int) (Math.random() * count ) + start;
		}
		return n;
	}

	// 메서드 생성
	/*
	 * 기능 : 매개변수로 배열을 받아서 랜덤값을 채우는 메서드 랜덤값의 범위는 매개변수 입력 start(시작값),count(개수)
	 * 
	 * -배열이 null이면 예외 발생 -배열의 길이가 0보다 작다면 예외발생
	 */
	public int[] out(int[] arr, int start, int count)  {
		
		if(arr==null) {
			throw new RuntimeException("배열값이 null입니다.");
		}
		if(arr.length<0) {
			throw new RuntimeException("배열의 길이가  음수 입니다.");
		}

		for (int i = 0; i < arr.length; i++) {
			
			
			arr[i] = (int) (Math.random() * count ) + start;
			
		}
		return arr;
	}

	public void printArr(int[] arr) { // 프린트 메서드
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
