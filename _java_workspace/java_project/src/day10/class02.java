package day10;

public class class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.setName("스파크");
		c.setColor("빨강색");
		c.setYear("2024");
		c.print();
		c.power();
		System.out.println("my car Power : " + (c.isPower()? "ON" : "OFF"));
		c.power();
		System.out.println("my car Power : " + (c.isPower()? "ON" : "OFF"));
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		//System.out.println("my car speed : " + c.getSpeed()+"km/h");
		System.out.println("my car speed : " + c.getSpeed()+"km/h");
		
		
		Car c2 = new Car();
		c2.setName("그렌저");
		c2.setColor("검정");
		c2.setYear("2003");
		c2.print();
		c2.power();
		System.out.println("my car2 Power : " + (c.isPower()? "ON" : "OFF"));
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();
		System.out.println("my car2 speed : " + c2.getSpeed()+"km/h");

	}

}

class Car{ //클래스명은 대문자로 시작
	//멤버변수 = private
	//메서드 public => getter/setter메서드
	private String name;
	private String color;
	private String year;
	private boolean power;
	private int speed;
	
	//power()
	//꺼져있을경우 => 켜짐
	//켜저있을경우 => 꺼짐
	
	public void power() {
		power = !power;
	}
	
	//speedUp()
	public void speedUp() {
		speed+=10;
		if(speed>300) {
			speed=300;
		}
	}
	
	//speedDown()
	public void speedDown() {
		speed-=10;
		if(speed<0) {
			speed = 0;
		}
	}
	
	//print()
	public void print() {
		System.out.println("my car : "+name+" / "+color+"("+year+")");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
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
	
	
}
