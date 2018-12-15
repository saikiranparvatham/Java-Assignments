import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestTelevision {
	static Television newRemote=new Television();
	@BeforeClass
	public static void setUp() {
		
		newRemote.turnOn();
		assertTrue(newRemote.on);
	}

	@Test
	public void testForChannel() {
		newRemote.setChannel(67);
		assertEquals(Television.channel,67);
	}
	
	@Test
	public void testVolumeUp() {
		newRemote.increaseVolume();
		assertEquals(Television.volumeLevel,2);
	}
	
	@Test
	public void testVolumeDown(){
		newRemote.decreaseVolume();
		assertEquals(Television.volumeLevel,1);
	}
	
	@Test
	public void testChannelUp(){
		newRemote.channelUp();
		
	}
	
	@Test
	public void testChannelDown(){
		newRemote.channelDown();
		
	}
	
	@Test
	public void testChannelChange(){
		newRemote.channelChange(78);
		
	}
	
	@Test
	public void testturnOff(){
		newRemote.turnOff();
		assertFalse(newRemote.on);
	}
}
