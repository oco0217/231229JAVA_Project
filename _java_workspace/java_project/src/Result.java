
public class Result {

	public static void main(String[] args) {

		CardPack2 pack = new CardPack2();

		int cnt = 0;

//		for (int i = 0; i < 4; i++) {
//			System.out.println();
//			for (int j = 0; j < 13; j++) {
//				pack.getPack()[cnt].print();
//				cnt++;
//
//			}
//		}
		
		for(int i=0; i<pack.getPack().length; i++) {
			if(i%13==0) {
				System.out.println();
			}
			pack.getPack()[i].print();
		}
		
	}

}
