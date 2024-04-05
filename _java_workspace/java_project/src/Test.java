
public class Test {

	public static void main(String[] args) {
		
		int [][] a = {{10,20,50},{20,30,15},{100,110,120}};
		
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				sum+= a[i][j];
			}
		}

		System.out.println("합계 : "+sum);
	}

}
