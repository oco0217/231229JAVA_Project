package day04;

public class Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Continue : 계속 pass skip 개념
		 * 1~10까지 출력
		 * 5는 빼고 출력 
		 */
		
		for(int  i=1; i<=10; i++) {
		if(i==5) {
			continue; //조건에 맞다면 pass
		}
		System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----------------------------");
		
		/*1~10까지 짝수만 출력
		 * 홀수를 continue로 pass
		 */
		
		for(int i=1; i<=10; i++) {
			if(i%2!=0) {  //i%2==1도 가능 (홀수는 2로 나누면 나머지가 무조건 1)
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
}
