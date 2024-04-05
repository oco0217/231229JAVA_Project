package day02;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Math.method
		 * math.round(반올림) : 소수자리수는 무조건 0
		 * math.ceil(올림) / math.floor (버림)
		 */
		
		double num = 3.1456334;
		//반올림 3 / 올림4 /버림 3
		
		int roundNum = (int)Math.round(num); //return long
		System.out.println(roundNum);
		
		int ceilNum = (int)Math.ceil(num); //return double
		System.out.println(ceilNum);
		
		int floorNum = (int)Math.floor(num);
		System.out.println(floorNum);
		
		//Math.max(최대값) , Math.min(최소값)
		System.out.println(Math.max(5,3));
		System.out.println(Math.min(5,3));
		
		//Math.random : 0과 1사이의 아무값을 출력
		//0<= Math.random()() < 1
		System.out.println("--------------------------------");
		//((int)(Math.random()*count)+start;
		System.out.println((int)(Math.random()*-1)+1); //0은 포함 , 1은 미포함

	}

}
