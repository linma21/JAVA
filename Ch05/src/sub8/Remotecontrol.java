package sub8;

public interface Remotecontrol {
	
	public abstract void powerOn(); //오직 추상 메서드만 가능
	public abstract void powerOff();
		
	public void chUp(); // abstract 를 붙이이 않아도 됨
	public void chDown(); 
	
	public void soundUp(); 
	public void soundDown(); 
}
