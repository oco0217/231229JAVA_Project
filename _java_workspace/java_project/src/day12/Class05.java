package day12;

public class Class05 {
	

	public static void main(String[] args) {
		/*객체를 생성 시 값을 초기화 하는 방법
		 * -기본값, 명시적 초기값, 초기화 블럭, 생성자
		 * 1.기본값 : 기본으로 지정되는 값  int = 0, String = null
		 * 2.명시적 초기값 : 멤버변수를 선언함과 동시에 값을 지정하는 값
		 * private String name = "홍길동";
		 * 3.초기화 블럭 : {  } 멤버변수를 초기화
		 * 4.생성자 : 객체를 생성할 때 초기화 해서 생성
		 * 
		 * 초기값의 우선순위
		 * 기본값 -> 명시적 초기값 -> 초기화블럭 -> 생성자(가장 우선 순위가 높음)
		 */
		EzenStudent user1 = new EzenStudent("부산","홍길동",23,"010-3456-7975","계산동 계양산",true);
		EzenStudent user2 = new EzenStudent("부천","신사임당",43,"010-3268-1845","제주도 한라산",false);
		EzenStudent user3 = new EzenStudent("서울","아무개",33,"010-4518-5424","전라남도 지리산",true);
		user1.printInfo();
		user2.printInfo();
		user3.printInfo();
		//toString()메서드가 없으면 객체의 주소가 출력
		//toString()메서드가 있으면 toString()가 출력
		//System.out.println(user1);  //객체만 넣어도 그냥 print된다.
		
		
		EzenStudent user4 = new EzenStudent("부산","이순신",29,"010-3632-5724","북한 백두산",false);
		EzenStudent user5 = new EzenStudent("춘천","이젠",16,"010-5678-1457","울릉도",true);
		user4.printInfo();
		user5.printInfo();
		
		EzenStudent[] studentArr = new EzenStudent[5];
		studentArr[0] = user1;
		studentArr[1] = user2;
		studentArr[2] = user3;
		studentArr[3] = user4;
		studentArr[4] = user5;
		
		//홍길동 학생의 주소를 출력
		String searchName = "홍길동";
		System.out.println("---"+searchName+"학생의 주소 " +"--");
		
		for(EzenStudent aa : studentArr) {
			
			if(aa.getName().equals(searchName)) {
				System.out.println(aa.getAdress());
			}
		}
		
		//이젠이 이름을 개명하여 젠이젠이으로 개명하였다. => 이젠이의 정보를 출력
		String modify = "이젠";
		
		System.out.println("------------수정 후---------------");
		for(EzenStudent nn : studentArr) {
			if(nn.getName().equals(modify)) {
				nn.setName("젠이젠이");
				nn.printInfo();
			}
		}
		System.out.println("---------------------------------");
		//부산지점에서 듣는 학생 명단을 출력 , 학생이 명단이 없습니다. 출력
		int cnt = 0;
		String visit = "중국";
		System.out.println(visit+"지점에서 듣는 학생 : ");
				for(int i=0; i<studentArr.length; i++) {
					if(studentArr[i].getGigum().equals(visit)) {
						System.out.println(studentArr[i]+" ");
						cnt++;
					}
				}
				if(cnt==0) {
					System.out.println("명단이 없습니다.");
				}else {
					System.out.println("총"+cnt+"명입니다.");
				}
	}

}

class EzenStudent{
	//학생의 정보를 생성하는 클래스
	private String gigum = "incheon"; //명시적 초기값
	private String name; //기본 초기값 null
	private int age;
	private String phn;
	private boolean card;
	private String adress;
	
	//생성자
	public EzenStudent() {
		//기본생성자
	}
	
	public EzenStudent(String gigum,String name,int age, String phn,String adress,boolean card) { 
		//super(); //내 부모 클래스의 생성자 호출
		this.gigum = gigum;
		this.name = name;
		this.age = age;
		this.phn = phn;
		this.card = card;
		this.adress = adress;
	}
	{
		//초기화 블럭 영역
		gigum = "인천";
		name = "신원미상";
		phn = "없음";
	}
	
	
	public void printInfo() {
		System.out.printf("지점 : %s, 이름 : %s, 나이 : %d, 전화번호 : %s, 주소 : %s, "+ "카드유무 : "+ (card==true ? "o":"x")+"%n",gigum,name,age,phn,adress);
	}

	//toString()  : print메서드와 비슷한 일을 함.
	@Override
	public String toString() {
		return "지점:"+gigum+"  이름 : " + name + ", 나이 : " + age + ", 전화번호 : " + phn + ", 카드유무 : " + card + ", 주소 :" + adress
				;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getGigum() {
		return gigum;
	}

	public void setGigum(String gigum) {
		this.gigum = gigum;
	}

	public String getPhn() {
		return phn;
	}

	public void setPhn(String phn) {
		this.phn = phn;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCard() {
		return card;
	}

	public void setCard(boolean card) {
		this.card = card;
	}
}
