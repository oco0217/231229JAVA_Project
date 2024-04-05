package day06;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1~50까지의 랜덤수를 10개 생성하여 배열에 저장 출력
		 * 오름차순 정렬 후 출력
		 */
		
		int arr[] = new int [10];
		
		for(int i=0; i<arr.length; i++) {
			
			int random = (int)(Math.random()*50)+1;
			arr[i] = random;
			
			System.out.printf("[%d] : %d  ",i,random);
		}
		System.out.println();
		
		for(int i=0; i<arr.length-1; i++) {  //마지막은 비교를 안해도 되기때문에 -1
			for(int j=i+1; j<arr.length; j++) { 
				
				if(arr[i]>arr[j]) {
					
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println("---정렬 후---");
		
		for(int s : arr) {
			System.out.print(s +" ");
		}
	}

}
