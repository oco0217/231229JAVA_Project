package day16;

import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		/*
		 * 날짜/시간 클래스 Date 클래스 => Deprecated(비권장,동그라미에 떙표시,곧있음 사라질거) / Calendar 클래스
		 * Calendar : 추상클래스 //추상클래스는 객체를 생성할 수 없음 추상클래스를 구현한 객체를 이용하여 사용 new로 객체 생성 불가능.
		 * getinstance()메서드를 이용하여 객체를 얻어옴. static 메서드. 클래스명.메서드명
		 */

		// Date d = new Date();
		Calendar c = Calendar.getInstance(); // 오늘 날짜 리턴
		int year = c.get(Calendar.YEAR);
		// System.out.println(year);
		// 월 0~11월까지 존재 =>그러므로 +1을 해야함
		int month = c.get(Calendar.MONTH) + 1;
		// System.out.println(month);
		int day = c.get(Calendar.DAY_OF_MONTH);
		// System.out.println(day);
		int week = c.get(Calendar.DAY_OF_WEEK); // 일요일부터 ~토요일까지
		// System.out.println(week);

		char we = ' ';
		switch (week) {
		case 1:
			we = '일';
			break;
		case 2:
			we = '월';
			break;
		case 3:
			we = '화';
			break;
		case 4:
			we = '수';
			break;
		case 5:
			we = '목';
			break;
		case 6:
			we = '금';
			break;
		case 7:
			we = '토';
		default:
			break;
		}
		System.out.println(year + "-" + month + "-" + day + " (" + we + ")");

		// hour,minute,second,am_pm
		// 2024-1-26 (금)
		// 오후 4:13

		int o = c.get(Calendar.AM_PM);
		int our = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		System.out.println((o == 0 ? "오전" : "오후") + " " + our + ":" + min);

	}
}
