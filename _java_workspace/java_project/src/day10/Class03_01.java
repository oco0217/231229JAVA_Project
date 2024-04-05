package day10;

public class Class03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Car03클래스를 통해 c객체를 생성  new 키워드를 통해 생성 Car03() 생성자에 의해 초기화 된다.
		Car03 c = new  Car03(); 
		c.setName("카니발");
		c.setYear("2335");
		c.print();
		c.power();
		c.power();
		
		
		Car03 c2 = new Car03("소나타","2021");
		c2.print();
		
		Car03 c3 = new Car03("아반테","2020","빨강",4);
		c3.print();
	}

}

class Car03 {

	private String name;
	private String year;
	private String color;
	private int door;
	private boolean power;
	private int speed;
	
	//생성자 위치
	public Car03() {
		//기본 생성자
	}
	
	
	//생성자는 여러개 만들 수 있음.(생성자 오버로딩)
	//오버로딩 조건 :  매개변수의 개수가 달라야함, 개수가 같다면 타입이 달라야함
	//생성자를 1개이상 내가 생성을 하면 기본생성자는 없어짐 
	public Car03(String name,String year,String color,int door) {
		this(name,year); //생성자 호출
		this.color = color;
		this.door = door;
	}
	
	public Car03(String name, String year) {
		this.name = name;
		this.year = year;
	}
	
	{
		//원하는 멤버변수의 값을 초기화
		color = "red";
	}
	
	
	public void print() {
		System.out.printf("이름 : %s%n연식 : %s년%n색깔 : %s%n문짝 개수 : %s%n", name, year, color, door);
	}

	public void power() {
		
		power = !power;	
		if(power &&speed <=0) {
			//System.out.println("시동이 꺼져있습니다. 시동을 켜주세요.");
			power = false;
		}else if(!power) {
			System.out.println("시동이 켜졌습니다.");
			power = true;
	}else if(power && speed>0) {
			System.out.println("주행중입니다.");
			power = true;
		}else if(power && speed>0) {
			System.out.println("주행중에 시동을 끌 수 없습니다.");
			power = true;
		}else {
			System.out.println("시동을 끕니다.");
			power = false;
		}
	}
	
	public void speedUp() {
		if(!power) {
			System.out.println("시동이 꺼져있습니다. 시동을 켜주세요");
		}else {
			if(speed>=300) {
				System.out.println("최고 속도입니다.");
			}else {
				speed+=10;
				System.out.println("현재속도 : "+speed);
			}
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void speedDown() {
		if(power) {
			if(speed <=0) {
				System.out.println("멈춰있습니다.");
				speed=0;
			}else {
				System.out.println("현재속도 : "+speed);
			}
			speed-=10;
		}else {
		System.out.println("시동이 꺼져있습니다.");	
		}
	}
	
	
}