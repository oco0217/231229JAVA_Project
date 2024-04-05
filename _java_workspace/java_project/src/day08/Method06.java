package day08;

public class Method06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 11, 2, 3, 5, 7, 8, 4, 6, 10, 15, 52, 34, 33, 84, 12};

		System.out.println("---배열 리턴 후 출력---");
		int arr1[] = sortArray1(arr);
		printArray(arr1);
		System.out.println("---------------");
		printArray(sortArray1(arr));
		System.out.println("---randomArray 출력---");
		//printArray(sortArray1(randomArray()));
		printArray(sortArray1(arr));
		
		
		
		
	}

	/*
	 * 주어진 정수배열을 콘솔에 출력하는 메서드 매개변수 : 배열 리턴타입 : 출력 = > void 메서드명 printArray 5개씩 한줄에
	 * 나열
	 */
	public static void printArray(int num[]) {

		int count = 0;

		for(int i=0; i<num.length; i++) {
			
			count++;
			
			System.out.print(num[i] + " ");
			
			if(count%5==0) {
				System.out.println();
			}
		}

		/*
		 * for(int i=0; i<num.length; i++){ if(i%5==0 &&){ } }
		 */
//		for (int s : num) {
//
//			count++;
//
//			System.out.print(s + " ");
//
//			if (count % 5 == 0) {
//				System.out.println();
//			}
//		}
	}

	/*
	 * 배열이 주어지면 배열을 오름차순으로 정렬하는 기능 
	 * 매개변수 : 배열 
	 * 리턴타입 : 없음 => void 
	 * 메서드명 : sortArray
	 */

	public static void sortArray(int sort[]) {

		for (int i = 0; i < sort.length-1; i++) {
			for (int j = i + 1; j < sort.length; j++) {

				if (sort[i] > sort[j]) { // > : 오름차순 < : 내림차순
					// 교환
					int tmp = sort[i];
					sort[i] = sort[j];
					sort[j] = tmp;
				}
			}
		}
		//printArray(sort);
	}
	
	//정렬 후 배열을 리턴
	
	public static int[] sortArray1(int sort[]) {

		for (int i = 0; i < sort.length-1; i++) {
			for (int j = i + 1; j < sort.length; j++) {

				if (sort[i] > sort[j]) { // > : 오름차순 < : 내림차순
					// 교환
					int tmp = sort[i];
					sort[i] = sort[j];
					sort[j] = tmp;
				}
			}
		}
		return sort;
	}
	
	/*randomArray
	 * 배열을 생성하여[10개] 랜덤값(1~50)을 채우고 해당 배열을 리턴
	 * 매개변수 : X
	 * 리턴타입 : 배열
	 */
	
	public static int[] randomArray() {
		
		int[] num = new int[10];
		for(int i=0; i<num.length; i++) {
			int random =(int)(Math.random()*50)+1;
			num[i] = random;
		}
		return num;
	}

}
