package day01;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*카페에 제출
		 * 국어,영어 수학의 점수 합계와 평균을 출력
		 * 평균은 소수점을 살려서 출력 
		 * 조건선택연산자를 이용하여 평균이 80이상이면 합격, 아니면 불합격으로 출력
		 */
		
		int kor =76 , eng = 10 , math = 87;
		int sum = kor+eng+math;
		double avg = sum /3.0;

		System.out.println("국어,영어,수학의 총 합산 점수는 "+sum+"점 입니다.");
		
		System.out.println(" 평균점수는 "+(sum/3.0)+"점 입니다.");
		
		System.out.println((avg>=80.0) ? "평균이 80이상입니다. 합격입니다." : "평균이 80점 이하입니다. 불합격입니다.");
		
		//조건 선택 연산자 => if문으로 변경
//		if(조건식) {
//			처리문;
//		}else {
//			처리문;
//		}
		if(avg>=80) {
			System.out.println("결과 : 합격");
		}else {
			System.out.println("결과 : 불합격");
		}
	}
}
