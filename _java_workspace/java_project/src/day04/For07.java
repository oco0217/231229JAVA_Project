package day04;

public class For07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*이중 For문
		 * for(int i=1; i<=5; i++){		i = 1   2   3   4   5
		 * 		for(int j=1; j<=5; j++)}j =1~5 1~5 1~5 1~5 1~5
		 * 실행문;  5 5 5 5 5 = 25번 진행
		 *  
		 * 별찍기
		 * *****   i=1 j=5
		 * *****   i=2 j=5
		 * *****   i=3 j=5
		 * *****   i=4 j=5
		 * *****   i=5 j=5
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		
		/* *     i=1, j=1
		 * **    i=2, j=2
		 * ***   i=3, j=3
		 * ****  i=4, j=4 
		 * ***** i=5, i=5
		 * *****
		 */
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		
		/* *****  i=5, j=5
		 * ****   i=4, j=4
		 * ***    i=3, j=3
		 * **     i=2, j=2
		 * *      i=1, j=1
		 */
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {  //j<=6-i,j>=i; 
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		
		/*     *    i=1, " "=4, *=1
		 *    **    i=2, " "=3, *=2 
		 *   ***    i=3, " "=2, *=3
		 *  ****    i=4, " "=1, *=4
		 * *****    i=5, " "=0, *=5
		 */ 
			 for(int i=1; i<=5; i++) {
				 for(int j=5; j>=i; j--) {
					 System.out.print(" ");
				 }
				 for(int o=1; o<=i; o++) {
					 System.out.print("*");
				 }
				 System.out.println();
			 }
			 System.out.println("----------------------");
			 
			 for(int i=1; i<=5; i++) {
				 
				 for(int j=1; j<=5-i; j++) {
					 System.out.print(" ");
				 }
				 for(int k=1; k<=i; k++) {
					 System.out.print("*");
				 }
				 System.out.println();
			 }
			 System.out.println("----------------------");
			 
			 /* 4     *
			  * 3    ***
			  * 2   *****
			  * 1  *******
			  * 0 *********
			  */
			 
			 for(int i=1; i<=5; i++){
				 
				 for(int j=1; j<=5-i; j++) {
					 System.out.print(" ");
				 }
				 for(int k=1; k<=i*2-1; k++) {
					 System.out.print("*");
				 }
				 System.out.println();
			 }
			 System.out.println("----------------------");
			 
			 /* 1 2 3
			  * 4 5 6
			  * 7 8 9 
			  * 
			  */
			 int cnt=0;
			 for(int i=1; i<=3; i++) {
				 for(int j=1; j<=3; j++) {
					 cnt++;
					 System.out.print(cnt+ " ");
				 }
				 System.out.println();
			 }
	}

}
