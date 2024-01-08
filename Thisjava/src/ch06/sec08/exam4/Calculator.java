package ch06.sec08.exam4;
//240 매소드 오버로딩 (Overloading)
public class Calculator {
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	//직사각형의 넓이
	double areaRectangle(double width, double height) { //오버로딩
		return width * height;
	}

}
