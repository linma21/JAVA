package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		//컬렉션에 요소가 존재하지 않으면 예외가 발생
		double avg = list.stream()
					.mapToInt(Integer :: intValue)
					.average()
					.getAsDouble();
		
		//방법1
		OptionalDouble optional = list.stream()
						.mapToInt(Integer :: intValue)
						.average();
		if(optional.isPresent()) {
			System.out.println("방법1_ 평균 : " +optional.getAsDouble());
		}else {
			System.out.println("방법1_ 평균 : 0.0");
		}
		
		//방법2
		double avg1 = list.stream()
					.mapToInt(Integer :: intValue)
					.average()
					.orElse(0.0); //집계값이 없을 경우 디폴트값 설정
		System.out.println("방법2_ 평균 : "+avg1);	
		
		//방법3
		list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.ifPresent(a->System.out.println("방법3_ 평균 : "+a));
	}
}
