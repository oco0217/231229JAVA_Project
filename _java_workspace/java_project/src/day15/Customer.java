package day15;
/*일반고객 / Gold고객(할인) / VIP고객(할인)
 * 
 * 고객 ID : int customerID
 * 고객이름 : String customerName
 * 고객등급 : String customerGrade
 * 보너스포인트 : int bonusPoint
 * 보너스 적립 비율 : double bnousRatio
 * 
 * 클래스 생성
 * - 기본 String customerGrade = "silver"
 * - bonusRatio = 0.01 => 1%적립
 * 
 * 1.보너스 적립 계산 메서드 (메서드명 : clacPrice(int price))
 * =>구매 금액을 주고 적립 보너스를 계산 bonusPoint에 누적
 * =>보너스 적립,할인 여부를 체크해서 구매 price를 리턴
 * 
 * 2.출력메서드(메서드명 : customerInfo())
 * =홍길동님 등급은 VIP이며, 보너스 포인트는 1000입니다.
 * 
 * -Silver 등급(기본)
 * =>제품을 구매할 때 0%할인 / 보너스 포인트 1%적립
 * 
 * -GOLD 등급 
 * =>제품을 구매할 때 10% 할인 / 보너스 포인트 2%적립
 * 
 * -VIP 등급
 * =>제품을 구매할 때 10% 할인 / 보너스 포인트 5%적립
 * =>전담 상담사를 멤버변수에 추가(int agentID)
 *   전담 상담사 번호는 1111입니다.
 * 
 * GoldCustomer extends Customer
 * 기본 메서드를 오버라이딩 하여 사용
 * GoldCustomer extends Customer
 * 기본 메서드를 오버라이딩 하여 사용
 * 
 * CustomerMain 클래스에서 확인
 * 
 * 
 */

public class Customer {

	// 멤버변수
	private int customerID; // 고객 ID
	private String customerName; // 고객이름
	private String customerGrade; // 고객등급
	private int bonusPoint; // 보너스 포인트
	private double bonusRatio; // 보너스 적립 비율

	// 생성자
	public Customer() {
	}

	public Customer(int customerID, String customerName) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "Silver";
		this.bonusPoint = 0;
		this.bonusRatio = 0.01;
	}

	// 메서드

	public double calcPrice(int price) { // 보너스 적립 계산 메서드

		switch (customerGrade) {

		case "Silver":
			bonusPoint += price * bonusRatio;
			break;
		case "Gold":
			bonusPoint += price * 0.02;
			break;
		case "VIP":
			bonusPoint += ((double) price / 0.1) * 0.05;
			break;
		default:
			System.out.println("잘못된 값입니다.");
			break;
		}
		return bonusPoint;
	}

	public void customerInfo() {
		System.out.printf("%s님의 등급은 %s이며, 보너스 포인트는 " + bonusPoint + "포인트입니다.%n", customerName, customerGrade);
	}
	// getter / setter

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

}

class GoldCustomer extends Customer {

	// 생성자
	public GoldCustomer() {
	}

	public GoldCustomer(int customerID, String customerName) {

		super(customerID, customerName);
		setCustomerGrade("Gold");
		setBonusRatio(0.02);
	}
	
}

class VIP extends Customer {

	private int agentID;
	private String agentName;
	private String agentPhone;

	public VIP() {
	}

	public VIP(int customerID, String customerName) {

		super(customerID, customerName);
		setCustomerGrade("VIP");
		setBonusRatio(0.05);
		int random = (int) (Math.random() * 4) + 1;

		this.agentID = random;

		switch (random) {
		case 1:
			this.agentName = "순이";
			this.agentPhone = "010-1111-2222";
			break;
		case 2:
			this.agentName = "영희";
			this.agentPhone = "010-3333-4444";
			break;
		case 3:
			this.agentName = "옥희";
			this.agentPhone = "010-5555-6666";
			break;
		}
	}
	@Override
	public void customerInfo() {
		// TODO Auto-generated method stub
		super.customerInfo();
		System.out.println("VIP고객님이십니다. VIP는 전담상담사가 한명씩 배정됩니다." );
		System.out.println("전담상담사 정보는 밑에 있습니다.");
		System.out.printf("상담사ID : %d | 성명 :%s | P.H : %s%n ",agentID,agentName,agentPhone);
	}
	
}
