package day11;

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

public class Card {

	public static void main(String[] args) {

		Card c = new Card();

		c.setShape('♠');
		c.setNum(11);

		c.print();
		System.out.println(c.getNum());

	}

	private int num;
	private char shape;

	public Card() {
		this.shape = '♥';
		this.num = 1;
	}

	public void print() { // 프린트 메서드 생성

		if (num == 13) {
			System.out.print("" + shape + "K"+" ");
		} else if (num == 12) {
			System.out.print("" + shape + "Q"+" ");
		} else if (num == 11) {
			System.out.print("" + shape + 'J' +" ");
		} else {
			System.out.print("" + shape + num+" ");
		}

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {

		if (num > 13) {
			num = 1;
		}

		this.num = num;

	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {

		if ((shape != '♥') && (shape != '◆') && (shape != '♠') && (shape != '♣')) {
			shape = '♥';
		}
		this.shape = shape;
	}
}
