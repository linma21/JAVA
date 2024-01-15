package ch14.sec03.exam02;

import java.awt.Toolkit;

//597
public class BeepPrintExample {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5 ; i++) {
					toolkit.beep();       //---비프음 발생
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {}
				}
				
			}
		});
		
		thread.start();
				
		for(int i=0; i <5 ; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}

}
