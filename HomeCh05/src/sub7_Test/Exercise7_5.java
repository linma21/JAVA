package sub7_Test;

class MyTv2{
	boolean isPowerOn;
	int channel;
	int volume;
	int preChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		preChannel = this.channel;
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void gotoPreChannel(){
		
		int nowChannel = channel;
		setChannel(preChannel);
		preChannel = nowChannel;
		
	}
}

public class Exercise7_5 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH: "+t.getChannel());
		t.setChannel(20);
		System.out.println("CH: "+t.getChannel());
		t.gotoPreChannel();
		System.out.println("CH: "+t.getChannel());
		t.gotoPreChannel();
		System.out.println("CH: "+t.getChannel());

	}
}
