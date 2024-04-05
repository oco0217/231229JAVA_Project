package day16;

public class Exception04 {

	public static void main(String[] args) {
		/*멀티 캐치 구문 = 다중 캐치 구문
		 * try{
		 * 
		 * }
		 * catch(예외 클래스명1 객체){
		 * 
		 * }
		 * catch(예외클래스명2 객체){
		 * 
		 * }
		 *
		 * Exception => 모든 예외의 최고 조상(defualt)
		 * 예외를 구체적으로 세분화해서 잡고싶을 때 => 멀티 캐치
		 * 어떤 예외가 발생하던 다 캐치 (Exception)
		 * 
		 */
		
		try {
			double res = 0;
			
			int arr1[]  = new int[3];
			arr1[1] = 5;
					
			int arr[] = null;
			arr[1]=3;
			
			
			res = 1/0;
			
			arr[5]=1;
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("0으로 나누었거나 null입니다.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위가 넘어갔습니다.");
		}
		catch(Exception e) {//최고 조상이기 떄문에 가장 마지막 처리되어야함
			e.printStackTrace();
		}
		System.out.println("종료");
	}

}
