package day15;

public class VIpCostomer01 extends Customer01{

	private double saleRatio;
	private int agentID;
	
	public VIpCostomer01() {}
	
	public VIpCostomer01(int id,String name, int agentid) {
		super(id,name);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentid;
		
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint = bonusPoint+(int)(price*bonusRatio);
		price = price - (int)(price*saleRatio);
		return price;
	}
	@Override
	public void customerInfo() {
		// TODO Auto-generated method stub
		super.customerInfo();
		System.out.println("담당 상담원 번호는 "+agentID+"입니다.");
	}
	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
}
