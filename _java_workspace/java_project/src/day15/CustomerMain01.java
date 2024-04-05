package day15;

public class CustomerMain01 {

	public static void main(String[] args) {
		
		Customer01[] customerList = new Customer01[10];
		
		Customer01 cLee = new Customer01(1001, "리정혁");
		Customer01 cHong = new GoldCustomer01(1002, "홍길동");
		Customer01 cKim = new VIpCostomer01(1003, "김철수", 1111);
		
		int cnt = 0;
		customerList[cnt] = cLee;
		cnt++;
		customerList[cnt] = cHong;
		cnt++;
		customerList[cnt] = cKim;
		cnt++;
		customerList[cnt] = new Customer01(1004, "영이");
		cnt++;
		customerList[cnt] = new GoldCustomer01(1005, "순이");
		cnt++;
		customerList[cnt] = new VIpCostomer01(1006, "영철",2222);
		cnt++;
		
		//다운캐스팅 : 부모의 공유되는 멤버변수나 메서드가아닌
		//자식 고유의 멤버변수나 메서들르 호출하고자 할 때 사용
		//다운캐스팅 : 반드시 명시적으로 형변환 해야함
		//instanceof : 객체의 형이 맞는지 체크하는 명령어 true / false
		
		//agentID = 1111 => 3333 변경
		
		
		System.out.println("--할인율과 포인트 계산--");
		
		int price = 100000;
		for(int i=0; i<cnt; i++) {
			int salePrice = customerList[i].calcPrice(price);
			System.out.println(customerList[i].getCustomerName()
					+"님의 지불 금액은" + salePrice + " / 보너스 포인트는"
					+customerList[i].getBonusPoint());
			System.out.println("----------------------------------");
		}
		
		System.out.println("---고객 정보  출력---");
		for(int i=0; i<cnt; i++) {
			customerList[i].customerInfo();
			System.out.println("-----------------------");
		}
		
		
		for(int i=0; i<cnt; i++) {//다운캐스팅
			if(customerList[i] instanceof VIpCostomer01) {
				VIpCostomer01 test = (VIpCostomer01)customerList[i];
				if(test.getAgentID()==1111) {
					test.setAgentID(3333);					
				}
			}
		}
		System.out.println("1111 상담 번호 3333으로DownCasting 후 출력");
		for(int i=0; i<cnt; i++) {
			customerList[i].customerInfo();
			System.out.println("-----------------------");
		}
		
		
		
		
		
		
		
//		int price = cLee.calcPrice(10000);
//		System.out.println("지불금액" + price);
//		cLee.customerInfo();
//		
//		int price2 = cHong.calcPrice(10000);
//		System.out.println("지불금액"+ price2);
//		cHong.customerInfo();
//		
//		int price3 = cKim.calcPrice(10000);
//		System.out.println("지불금액"+ price3);
//		cKim.customerInfo();
	}

}
