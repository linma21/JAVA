package ch05.sec12;
//197

import java.util.*;

public class WeekExample {
	public static void main(String[] args) {
		
		Week today = null;
		
		Calender cal = Calender.getInstance();
		
		int week = cal.get(Calender.DAY_OF_WEEK);
		
		
		switch(week) {
		case 1: today = Week.SUNDAY ;  break;
		case 2: today = Week.MONDAY ;  break;
		case 3: today = Week.TUSDAY ;  break;
		case 4: today = Week.WENSDAY ;  break;
		case 5: today = Week.THURSDAY ;  break;
		case 6: today = Week.FRIDAY ;  break;
		case 7: today = Week.SATURDAY ;  break;
	}
		
		//열거타입 변수를 사용
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바를 공부합니다.");
		}
		
		
		
		
		
		
	}
	

}
