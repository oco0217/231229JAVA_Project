package day11;

public class Class04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Tv클래스 생성
		 *멤버변수 : brand명 ,power, ch, vol
		 *
		 *
		 * 메서드 : 
		 * power()
		 * power가 켜지면 "TV가 켜졌습니다." , 꺼지면 "TV가 꺼졌습니다."
		 * 
		 * chUp() : 1씩 증가 ch은 20까지 있음. 20이 넘어가면 다시 0번으로 순환구조
		 * chDown() 1씩 감소 Up처럼 순환구조
		 * 
		 * volUp() /volDonw() : 1씩증가 / 1씩 감소
		 * vol은 10까지 있음. 10이 넘으면 10, 0이면 음소거라고 출력
		 * 채널 0번 볼륨 3
		 */
		
		
		Tv home = new Tv("삼성",0,3);
		
		//콘솔 출력 창
		//ch up 순환 o , down순환 o , volUp ,  
		home.power();
		home.power();
		home.power();
		home.chDown();
		home.chDown();
		home.chDown();
		home.volUp();	
		home.volUp();			
		home.volUp();			
		home.volDown();
		home.volDown();
		home.volDown();
		home.volDown();
		home.volDown();
		home.volDown();
		home.volUp();	
		home.volUp();	
		home.volDown();
		home.volDown();
		home.chUp();
		home.chUp();
		home.chUp();
		home.chUp();
		home.chUp();
		home.print();
	}

}
class Tv{
	
	private String brand ; //null  //final은 변경할 수 없는 값을 지정
	private boolean power; //false
	private int ch; //0
	private int vol; //0
	
	//생성자
	
	public Tv(String brand, int ch, int vol) {
		this.brand = brand;
		this.ch = ch;
		this.vol = vol;
	}
	
	public void print() {
		System.out.printf("브랜드명 : " + brand +" , " +"ch : " + ch +" , "+ "vol : " + (vol<=0 ? "음소거" : vol)  );
	}
	
	public void power() {
		
		power = !power;
		
		if(power) {
			System.out.println("TV가 켜졌습니다.");
			//print();
		}else {
			System.out.println("TV가 꺼졌습니다.");
		}
	}
	
	public void chUp() {
		
		if(power) {
			ch+=1;
			if(ch<20) {
				ch=0;
			}
		}
	}
	
	public void chDown() {
		
		if(power) {
			ch--;
			if(ch==-1) {
				ch=20;
			}
		}
	}
	public void volUp() {
		
		if(power&&vol>10) {
			vol=10;
		}else if(power&&vol<10) {
			vol+=1;
		}
	}
	
	public void volDown() {
		if(power&& vol<=0) {
			vol = 0;
		}else if(power&&vol>0) {
			vol -=1;
		}
	}

	//getter / setter
	
	public String getBarnd() {
		return brand;
	}

	public void setBarnd(String barnd) {
		this.brand = barnd;
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}
}
