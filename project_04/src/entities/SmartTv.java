package entities;

public class SmartTv {
	
	private boolean onOff = false;
	public int canal = 23;
	public int volume = 50;
	
	public void on() {
		onOff = true;
	}
	
	public void off() {
		onOff = false;
	}
	
	public String getOnOff() {
		if(onOff == true) {
			return "A TV está ligada.";
		} else {
			return "A tv está desligada.";
		}
	}
}
