import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("생성할 난수의 개수 입력>");
		int count = scan.nextInt();
		
		System.out.print("생성된 랜덤값 : ");
		
		for(int i=1; i<=count; i++) {
			
			int random = (int)(Math.random()*100);
			
			System.out.print(random+" "); //생성한 random값 표시  
			
			sum += random; 
			
			
		}
		
		System.out.println();
		
		System.out.println(sum);
		
		scan.close();

	}

}
