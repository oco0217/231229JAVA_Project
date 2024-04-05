package day11;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Card c2 = new Card();
//		
//		c2.setShape('♠');
//		c2.setNum(13);
//		c2.print();
//		
//		c2.setShape('#');
//		c2.setNum(15);
//		c2.print();
//		
//		c2.setShape('#');
//		c2.setNum(7);
//		c2.print();
		CardPack cp = new CardPack();

		cp.shuffle();// 카드를 섞는 기능
		int cnt = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cp.getPack()[cnt].print();
				// cp.getPack() : CardPack 클래스 안에 있는 pack[]을 리턴
				// cp.getPack()[cnt] : pack[0] => Card(멤버변수,메서드)
				cnt++;

			}
			System.out.println();
		}

		System.out.println("----------------------");

//		int count = 0;
//		for (int i = 0; i < cp.getPack().length; i++) {
//			cp.getPack()[i].print();
//			count++;
//			if (count % 13 == 0) {
//				System.out.println();
//			}
//		}

		System.out.println("-----");
		Card player1 = cp.pick();
		Card player2 = cp.pick();
		System.out.print("player1 Card open : ");
		player1.print();
		System.out.print("player2 Card open : ");
		player2.print();
		System.out.println();

	}

	
	

}
