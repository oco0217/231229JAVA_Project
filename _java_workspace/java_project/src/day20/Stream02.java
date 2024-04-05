package day20;

import java.util.Arrays;

public class Stream02 {

	public static void main(String[] args) {
		
		/*배열에서 짝수만 출력(정렬) 중복되는 값 제거
		 * 
		 */
		
		int[] arr = {1,8,4,5,6,7,8,6,5,4,1,2,3,10,6,8,2,4};
		
		  Arrays.stream(arr)
		  .distinct()
		  .sorted()
		  .filter(n-> n%2==0)
		  .forEach(n-> System.out.print(n +" "));
		  
		  System.out.println();
		  
		  int[] result = Arrays.stream(arr)
		  .distinct()
		  .filter(a-> a%2!=0)
		  .sorted()
		  .toArray();
		  
		  for(int tmp : result) {
			  System.out.print(tmp+" ");
		  }
		
		

	}

}
