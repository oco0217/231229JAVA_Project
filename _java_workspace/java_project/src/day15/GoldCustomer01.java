package day15;

public class GoldCustomer01 extends Customer01{
	
	private double saleRatio;
	
	public GoldCustomer01() {}
	
	public GoldCustomer01(int id, String name) {
		super(id,name);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.01;
		
	}
	@Override
	public int calcPrice(int price) {
		
		bonusPoint = bonusPoint+(int)(price*bonusRatio);
		//세일가격 구하기
		price = price - (int)(price*saleRatio);
		return price;
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
	
}
