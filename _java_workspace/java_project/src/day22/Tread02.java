package day22;

class MyThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 200; i++) {
			System.out.println(i + "번째 Thread!" + Thread.currentThread().getName());
		}
	}
}

public class Tread02 {

	public static void main(String[] args) {
		
		//Runnable로 구현한 스레드 객체 생성
		//Thread 객체를 생성하여 Runnable 구현체를 생성자로 제공
		
		System.out.println("main start~!!");
		
		MyThread2 mth = new MyThread2();
		Thread th = new Thread(mth);
		th.start();
		
		try {
			th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//메인이 thread가 끝나고 다른 thread가 순서상관없이 실행된다. 순차적으로 실행하고 싶으면 join()활용
		//join() : 동시에 2개의 스레드가 실행 될 때 다른 쓰레드의 결과를 참조하여 
		//실행되어야 하는 경우 join()메서드 사용
		
		Thread th2 = new Thread(new MyThread2());
		th2.start();
		
		try {
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main End~!");
		
		
		
		
		
		
		

	}

}
