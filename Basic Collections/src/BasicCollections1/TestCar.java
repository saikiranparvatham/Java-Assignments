package BasicCollections1;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestCar {

	@BeforeClass
	public void test() {
		Car car1 = new Car("Fiat","palio",2001,70000);
		
		Car car2 = new Car("Maruti","Omni",1998,35000);
		
		Car car3 = new Car("Hyundai","Accent",2000,120000);
		
		Car car4 = new Car("Maruti","Esteem",1995,50000);
		
		Car car5 = new Car("Hyundai","Santro",2003,85000);
		
		Set<Car> carSet = new HashSet<>();
	}
	


}
