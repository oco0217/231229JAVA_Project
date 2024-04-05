package day11;

public class Card_선생님 {

	/*1장의 카드를 생성하기위한 클래스
	 * -숫자 : 1~10, J(11), Q(12), K(13) 
	 * -모양 :♥, ♣, ♠, ◆
	 * -한장의 카드를 출력하는 기능 print()  => ♥1
	 * ex)◆12 = ◆Q, ♠13 => ♠K, %2 =>  ♥2(없는 모양이면 무조건 하트로 =>♥), &15(모양도 없고 숫자도 없으면 =>♥1로)
	 * 
	 * 클래스의 구성
	 * -멤버변수 : 모양(shape),숫자(num) => private => getter/setter
	 * -메서드 : 프린트
	 * -생성자 : 기본 생성자만 생성 => ♥1
	 * ex) this.num = 1
	 * setter에서 수정 
	 */
	
	public static void main(String[] args) {
		
		Card_선생님 cc = new Card_선생님();
		
		cc.setNum(13);
		cc.setShape('#');
		cc.print();
		
	}
	
	private int num;
	private char shape;
	
	//생성자
	public Card_선생님() {
		this.num = 1;
		this.shape = '♥';
	}
	
	public void print() {
		System.out.print(shape);
		
		switch(num) {
		case 11:
			System.out.print('J');
			break;
		case 12:
			System.out.print('Q');
			break;
		case 13:
			System.out.print('K');
			break;
			default :
				System.out.print(num);
		}
		
	}
	

	public int getNum() {
		return num;
	}
	//외부의 값(매개변수)으로 내부 변수를 변경할 때 사용하는 메서드
	public void setNum(int num) {
		//1~13
		if(num>13 ||num<1) {
			this.num = 1;
		}
		this.num = num;
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		//♥, ♣, ♠, ◆ 가아닌 나머지 모양은 ♥
		switch(shape) {
		case '♥': case '♣': case '♠': case'◆':
			this.shape = shape;
			break;
			default:
				this.shape = '♥';
		}
	}
	
}
