package day06;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*10개의 값을 가지는 배열을 생성한 후
		 * 
		 * 1~50랜덤수를 배열에 저장 한 후 출력
		 * 합계, 평균, 최대, 최소 출력
		 */
		
		int[] num = new int[10];
		
		int sum = 0;
		double avg = 0;
		int max = 0;
		int min = 50;
		
		
		for(int i=0; i<num.length; i++) {
			
			int a = (int)(Math.random()*50)+1;
				
			num[i] = a;
			
			sum+=a;
			
			max = Math.max(max, num[i]);
			min = Math.min(min, num[i]);
			
			System.out.print("["+(i+1)+"]"+num[i] + " ");
		}
		
		avg = (double)sum/num.length;
		
		System.out.println();
		System.out.printf("합계 : %d%n평균 : %.2f%n최대값 : %d%n최소값 : %d%n",sum,avg,max,min);
	}
}
