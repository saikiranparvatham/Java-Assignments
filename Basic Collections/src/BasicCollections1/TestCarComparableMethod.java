/* Create few instances of Car and add them to a collection. Have Car implements 
 * Comparable interface and override compareTo() to order them by ascending order 
 * of make of the Car. Observe the fact that you need to provide the order criteria
 *  in compareTo().
 */

package BasicCollections1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestCarComparableMethod {

	static ArrayList<Car> carList = new ArrayList<Car>();		//Creating arraylist of cars
	
	static Car car1 = new Car("Fiat","palio",2001,70000);		//Creating objects of Car class
	
	static Car car2 = new Car("Maruti","Omni",1998,35000);
	
	static Car car3 = new Car("Hyundai","Accent",2000,120000);
	
	static Car car4 = new Car("Maruti","Omni",2002,75000);
	
	static Car car5 = new Car("Maruti","800",2002,75000);
	
	@BeforeClass
	public static void setUp() {
		carList.add(car1);
		carList.add(car2);										//adding the objects to the list
		carList.add(car3);
		carList.add(car4);
		carList.add(car5);
	}
	
	@Test
	public void testComprator()
	{
		Collections.sort(carList);								//sorting the cars list
		System.out.println(carList);
	}

}
