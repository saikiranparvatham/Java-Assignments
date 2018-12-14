public class Television {

	static int channel = 1; // Default channel is 1
	static int  volumeLevel = 1; // Default volume level is 1
	boolean on = false; // TV is off

	public Television() {
	}

	public void turnOn() {
		on = true;
		System.out.println("Television is turned On");
	}

	public void turnOff() {
		on = false;
		System.out.println("Television is Turned Off");
	}

	public void setChannel(int newChannel) {
		if (on && newChannel >= 1 && newChannel <= 120) {
			channel = newChannel;
			System.out.println("Current Channel is "+newChannel);
		}
	}

	public void increaseVolume() {
		if (volumeLevel<=20) {
			volumeLevel++;
			System.out.println("Volume level: "+volumeLevel);
		}
		else
		{
			System.out.println("This is the Maximum possible volume");
		}
	}
	
	public void decreaseVolume() {
		if (volumeLevel>=1) {
			volumeLevel--;
			System.out.println("Volume level: "+volumeLevel);
		}
		else
		{
			System.out.println("This is the Minimum possible volume");
		}
	}
	

	public void channelUp() {
		if (on && channel < 120) {
			channel++;
			System.out.println("Current Channel "+channel);
		}
		
	}

	public void channelDown() {
		if (on && channel > 1) {
			channel--;
			System.out.println("Current Channel "+channel);
		}
	}

	

}