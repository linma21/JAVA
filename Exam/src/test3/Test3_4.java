package test3;
/*
 * 날짜 : 24/01/04
 * 이름 : 최이진
 * 내용 : 자바 정적변수 연습 문제
 */

class Student {
	public static int studentId;
	private String studentName;
	private String major;
	private int grade;
	
	public Student(String studentName,String major,int grade) {
		this.studentId++;
		this.studentName = studentName;
		this.major = major;
		this.grade = grade;
	}
	
	public void studentInfo() {
		System.out.println("==============");
		System.out.println("학번 : "+studentId);
		System.out.println("이름 : "+studentName);
		System.out.println("전공 : "+major);
		System.out.println("학년 : "+grade);
		System.out.println("===============");
	}
}
public class Test3_4 {
	public static void main(String[] args) {
		
		Student.studentId = 20201000;      // studentId 변수를 직접 참조 = static 이어야 한다.
		
		Student kim = new Student("김유신","국문과",1);
		kim.studentInfo();
		
		Student lee = new Student("이순신","경제학과",1);
		lee.studentInfo();
		
		Student lim = new Student("임꺽정","경영학과",1);
		lim.studentInfo();
	}
}
