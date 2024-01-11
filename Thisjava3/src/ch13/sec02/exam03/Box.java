package ch13.sec02.exam03;
//578
public class Box<T> {
	public T content;
	
	//box 내용물이 같은지 비교
	public boolean compare(Box<T> other) {
		boolean result = content.equals(other.content);
		return result;
	}

}
