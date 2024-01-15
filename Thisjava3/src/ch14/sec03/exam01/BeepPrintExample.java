package ch14.sec03.exam01;

import java.awt.Toolkit;

//596
public class BeepPrintExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5 ; i++) {
			toolkit.beep();       //---비프음 발생
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		for(int i=0; i <5 ; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}

}
