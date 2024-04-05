package day10;

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car1 myCar = new Car1();
		myCar.setName("람보르기니");
		myCar.setYear("2025");
		myCar.setColor("검정색");
		myCar.setDoor("6");
		myCar.print();
		myCar.power();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();

	}

}
//private제어자 외에  외에 같은 패키지에서 같은 이름의 클래스를 사용하면 error

class Car1 {

	// 멤버변수 : name, year, color, door(문짝 개수), power, speed
	private String name;
	private String year;
	private String color;
	private String door;
	private boolean power;
	private int speed;

	// 내 차량의 정보를 출력하는 메서드(name, year, color, door)
	public void print() {
		System.out.printf("이름 : %s%n연식 : %s년%n색깔 : %s%n문짝 개수%s%n", name, year, color, door);

	}

	// power()
	// true일경우 시동이 켜졌습니다. / false일경우 시동이 꺼졌습니다.
	// 속도가 0이상일경우 시동을 끌 수 없습니다. 출력
	public void power() {
		power = !power;
		if (power) {
			System.out.println("시동이 켜졌습니다.");
		} else {
			System.out.println("시동이 꺼졌습니다.");
			if (speed > 0 && !power) {
				System.out.println("속도가 1이상일 경우 시동을 끌수 없습니다.");
				power = true;
			}
		}
	}

	// speedUp / Down 기본조건은 power가 켜져야 가능.
	// 만약 시동이 꺼져있는 상태라면 시동이 꺼져있습니다. 시동을 켜주세요.
	// speedUp
	// 300이상이면 최고 속도입니다. 라고 출력
	// 현재 속도를 출력
	public void speedUp() {
		if(power&&speed>300) {
			System.out.println("최고 속도 입니다.");
			speed = 300;
		}
		if(power&&speed>300) {
			System.out.println("현재속도는 " + speed + "km/h입니다.");
			speed+=10;
		}
		if(!power) {
			System.out.println("시동이 꺼져있습니다.");
		}
	}

	// speedDown
	// 속도가 0이되면 더이상 내려가지 않음.(멈췄습니다.)
	// 현재 속도 얼마인지 출력

	public void speedDown() {
		if (power) {
			System.out.println("현재속도는 " + speed + "km/h입니다.");
			speed -= 10;
			if (speed < 0) {
				speed = 0;
				System.out.println("멈췄습니다.");
			}
		} else {
			System.out.println("시동이 꺼져있습니다. 시동을 켜주세요");
		}
	}

	// getter / setter
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

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
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
}