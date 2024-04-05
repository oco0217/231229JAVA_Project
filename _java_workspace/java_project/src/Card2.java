
public class Card2 {

	private char shape;
	private int num;

	public Card2() {
		this.shape = '♥';
		this.num = 1;
	}

	public Card2(char shape, int num) {

		this.shape = shape;
		this.num = num;
	}

	public void print() { // 프린트 메서드 생성

		if (num == 1) {
			System.out.print("" + shape + "A" + " ");
		} else if (num == 13) {
			System.out.print("" + shape + "K" + " ");
		} else if (num == 12) {
			System.out.print("" + shape + "Q" + " ");
		} else if (num == 11) {
			System.out.print("" + shape + 'J' + " ");
		} else {
			System.out.print("" + shape + num + " ");
		}

	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		this.shape = shape;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		
		if(num>13) {
			num = 1;
		}
		this.num = num;
	}

}
