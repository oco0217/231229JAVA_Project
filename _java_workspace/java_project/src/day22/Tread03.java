package day22;

class JoinTest extends Thread{
	
	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		for(int i=start; i<=end; i++) {
			this.total += i;
		}
		System.out.println(start+"~"+end+" 합계 : "+this.total);
	}
	
}

public class Tread03 {

	public static void main(String[] args) {
		//1~50, 51~100까지의 합을 구하는 2개의 Tread
				//그 결과를 확인
				
				//두개의 Thread가 실행되고 난 후
				//thread1 1~50까지의 합계 출력
				//thread2 51~100까지의 합계 출력
				//thread1+thread2의 합계 출력
		
		JoinTest jt = new JoinTest(1,50);
		JoinTest jt2 = new JoinTest(50,100);
		
		try {
			Thread.sleep(2000);
			jt.start();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		try {
			Thread.sleep(2000);
			jt2.start();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		try {
			jt.join();
			jt2.join();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int sum = jt2.total+ jt.total;
		System.out.println("Thread1+Tread2의 합계 : "+sum);
	}

}
