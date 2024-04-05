package sale;

public class Order extends Sale<String,Integer>{
	//주문을 하려면 (메뉴명,가격),수량,합계
	//(메뉴명,가격)상속받은 객체의 값 => super
	//수량,합계 : order만 가지고 있는 내 객체 =>

	//멤버변수
	private int count;  //수량
	
	//생성자
	public Order() {} //기본생성자
	
	public Order(String menu,int price,int count) {
		super(menu,price);
		//super.setMenu(menu);
		//super.setPrice(getPrice());
		this.count = count;
	}
	

	//getter / setter
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
