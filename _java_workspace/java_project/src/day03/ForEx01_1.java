package day03;

public class ForEx01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        //2~100까지의 소수를 모두 출력
				//2중for문 2~100까지
		
		int count = 0;
		for(int i=2; i<=100; i++ ) {
			count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+ " ");
			}
		}
	}

}
