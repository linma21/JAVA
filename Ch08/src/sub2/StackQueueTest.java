package sub2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 날짜 : 24/01/10
 * 이름 : 최이진
 * 내용 : Java 스택, 큐 실습
 */
public class StackQueueTest {
	public static void main(String[] args) {
		
		//컬렉션은 기본타입(int..)을 취급 안함
		//Stack
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		while(!stack.empty()) {
			System.out.print(stack.pop()+" ");			
		}
		
		System.out.println();
		
		//Queue
		//큐는 인터페이스라서 new 객체 생성 불가
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("서울");
		queue.offer("대전");
		queue.offer("대구");
		queue.offer("부산");
		queue.offer("광주");
		
		while(!queue.isEmpty()) {
			System.out.print(queue.poll()+" ");
		}
	}
}
