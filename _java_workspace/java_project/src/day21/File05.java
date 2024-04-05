package day21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class File05 {

	public static void main(String[] args) throws IOException {
		//test.txt파일을 읽어들여 map에 저장하여
		//명단, 합계, 평균을 출력
		// txt에서 읽어들이는 값은 모두 String
		//계산을 위해서는 int의 자료형으로 변환이 필요
		//Integer.palseInt(); String -> int로 변환
		
		
		HashMap<String,Integer> list = new HashMap<String, Integer>();

		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		
		int sum =0; 
		
		while(true) {
			String line = br.readLine();
			if(line==null) {
				break;				
			} 
			//line이 null이 아니라면...
			//subString(포함,미포함)
			String key = line.substring(0,line.indexOf(" ")); //이름
			String sValue = line.substring(line.indexOf(" ")+1); //점수
			int Ival = Integer.parseInt(sValue); //점수를 int로 변환
			sum += Integer.parseInt(sValue);
			list.put(key, Ival);		
			
		}
		//br 끊기
		if(br != null) {  //객체가 생성되었다면 끊기
			br.close();			
		}
		
		System.out.println("----<명단>----");
		
		double avg = (double)sum/list.size();
		for(String s : list.keySet()) {
			System.out.println("이름 : "+s +"("+list.get(s)+"점)");
		}
		System.out.printf("합계 : %d점  평균 : %.2f점%n",sum,avg);
		
	}
}
