package day22;

class Bank{
	private int money=20000;;
	
	//입금
	public synchronized void saveMoney(int save) {
		int m = this.money;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.money = m+save;
	}
	
	//출금
	public synchronized void minusMoney(int minus) {
		int m = this.money;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.money = m-minus;
	}
	
	//getter / setter
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}

class Hong extends Thread{

	@Override
	public void run() {
		System.out.println("홍길동이 입금을 시작~!");
		Thread04.myBank.saveMoney(10000);
		System.out.println("saveMoney(10000)"+
		Thread04.myBank.getMoney());
	}
}

class HongWife extends Thread{

	@Override
	public void run() {
		System.out.println("홍길동와이프가 출금을 시작");
		Thread04.myBank.minusMoney(5000);
		System.out.println("minusMoney(-5000)"+
		Thread04.myBank.getMoney());
	}
}


public class Thread04 {
	
	public static Bank myBank = new Bank(); //공유영역 //critical section생성

	public static void main(String[] args) throws InterruptedException {
		/*critical section은 두 개 이상의 thread가 
		 * 동시에 접근 할수 있는 영역 (공유 영역)
		 * 동시에 여러개의 thread가 접근하게 되면 문제가 생길 수 있음.(무엇을 먼저 처리할지 문제가 발생)
		 * 세마포어(semaphore)기법을 사용하여 한 순간에 오직 하나의 thread만 사용가능
		 * 세마포어를 얻은 스레드만 접근 가능 나머지는 대기 상태가 됨.
		 * 
		 * 동기화 키워드 : synchronized
		 * 동기화가 필요한 메서드 앞에 선언
		 */
		
		/*bank 클래스 생성
		 * 계좌 1개 생성(bank클래스의 객체 1개 생성) (홍길동과 홍길동의 와이프가 같은 계좌로 동시에 출금을 할 경우...하나만 접근 할 수 있는데  누가 먼저 실행될까? )
		 * hong, hongwife
		 */
		
		Hong h = new Hong();
		h.start();
		
		Thread.sleep(2000);
		
		HongWife hw = new HongWife();
		hw.start();
		
		

	}

}
