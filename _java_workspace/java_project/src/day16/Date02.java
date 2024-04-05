package day16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date02 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		//날짜 2024-01-26/ 시간 2024-01-26
		String t = today.toString(); //toString() 스트링으로 객체를 변환
		System.out.println(t);
		
		System.out.println("----------------------");
		System.out.println(t.substring(0,t.indexOf("T"))); //날짜 추출
		System.out.println(t.substring(t.indexOf("T")+1,t.indexOf("."))); //시간 추출
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern
				("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate = LocalDateTime.of(2000, 02,17, 02, 59);
		System.out.println(sDate.format(dtf));
	}

}
