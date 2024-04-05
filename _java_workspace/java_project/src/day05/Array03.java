package day05;

public class Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {10,56,78,89,48,62,93,50};
		
		/*arr배열의 합계와 평균을 출력
		 * +최대값 / 최소값 출력
		 * 
		 * Math.max   Math.min
		 * if문
		 */
		
		// 성적 데이터 (0 ~ 100)
		int sum = 0; 
		
		int max = 0;    //가장 큰 값을 넣기 위한 변수
		int min = 100;  // 가장 작은값을 넣기 위한 변수
		
		
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i]; //합계
			
			if(arr[i]>max) {
				max = arr[i];
			}
		    if(arr[i]<min) {
				min = arr[i];
			}
		}
			
		double avg = sum/(double)arr.length;
		
		System.out.printf("합계 : %d점%n평균 : %.2f점%n최대값 : %d점%n최소값 : %d점%n",sum,avg,max,min);
		
		int ax = 0;
		int in = 100;
		
		for(int i=0; i<arr.length; i++) {
			
			ax = Math.max(ax, arr[i]);
			in = Math.min(in, arr[i]);
		}
		System.out.println("최대값 : " + ax);
		System.out.println("최소값 : " + in);
	}
	
}