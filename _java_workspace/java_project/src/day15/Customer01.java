package day15;

public class Customer01 {

	//멤버변수 선언
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	//생성자
	public Customer01() {}
	public Customer01(int customerID,String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "실버";
		bonusRatio = 0.01;
	}
	
	//메서드
	//가격을 매개변수로 받아 포인트 적립 /할인가격 리턴
	public int calcPrice(int price) {
		bonusPoint = bonusPoint+(int)(price*bonusRatio);
		return price;  //실버등급은 할인이 없음
	}
	 
	//고객정보 출력 메서드
	public void customerInfo() {
		System.out.println(customerName+"님의 등급은 "+ customerGrade+"이며" + "보너스포인트는"+bonusPoint+"입니다");
	}
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
	@Override
	public String toString() {
		return "Customer01 [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + "]";
	}
	
}
