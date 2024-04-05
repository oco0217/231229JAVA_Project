package day12;

public class Class04 {

	public static void main(String[] args) {
		
		/*static
		 * static이 붙은메서드/멤버변수 클래스 멤버변수/메서드라고 한다.
		 * -static이 붙은 것은 객체의 생성없이 클래스가 만들어지면 생성
		 * -객체가 없이 클래스만들오 사용 가능.
		 * -클래스명.메서드 / 클래스명.멤버변수
		 * -객체를 생성해서 호출도 가능하지만 그렇게 사용하지 않음.(노란 밑줄:의미없다)
		 * -클래스의 멤버변수/메서드는 하나의 멤버변수가 모든 객체에 공유(사용)할때 사용
		 * 
		 * static이 안붙은 메서드/멤버변수는 객체(인스턴스)의 멤버변수/메서드라고 한다.
		 * -객체의 멤버변수/메서드는 객체를 통해 사용되고, 생성된다.(객체를 만들지 않으면 생성불가)
		 * -객체명.메서드 / 객체명.멤버변수
		 * -각 객체마다 독립적인 객체가 된다 => 각 객체마다 독립적인 멤버변수,메서드를 생성하게된다.
		 * 
		 *-클래스 / 객체는 생성 시점이 달라서 메서드를 사용할 수 있는 환경이 다르다.
		 *-객체의 멤버는 클래스가 생성되고 난 후 객체를 생성할 수있음.
		 *-클래스의 멤버는 클래스의 멤버(변수/메서드) / 객체의 멤버(변수/메서드)에서 모두 사용될 수있다.
		 *-객체의 멤버는 객체에서만 사용될 수 있다.
		 */
		
		//클래스 멤버에 접근하는 방식
		//현 시점에서 브랜드는 멤버변수에 static을 붙였기때문에 이미 생성 되어 있다.(Tv의 객체없이도 생성)
		//System.out.println(Tv.BRAND);  //private으로 접근 불가
		Tv.printBrand(); //클래스명.메서드명();
		
		Tv t = new Tv();  //갹체 생성 시점에 객체 멤버들이 생성
		
		t.printPower();  //객체 메서드 사용 객체명.메서드명();
		t.printBrand(); //객체를 통해 클래스멤버에 접근할 수 있지만, 그렇게 사용하지 않음.
		

	}

}

class Tv{
	private boolean power;
	private final static String BRAND = "LG";
	
	//power를 출력하는 메서드
	public void printPower() {
		if(power) {
			System.out.println("Tv가 켜졌습니다.");
		}else {
			System.out.println("Tv가 꺼졌습니다.");
		}
		//객체 메서드에서 클래스 변수를 사용할 수 있음.
		//클래스의 멤버는 어디서든 사용 가능
		System.out.println("brand : " + BRAND);  //가능
	}
	
	public static void printBrand() {
		System.out.println("Brand : " + BRAND);
		//클래스 메서드에서 객체 변수를 사용
		//System.out.println("power상태 :" + power); //불가능
	}
}
