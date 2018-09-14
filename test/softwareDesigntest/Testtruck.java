package softwareDesigntest;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import softwareDesign.DaewooTruck;
import softwareDesign.Fordtruck;
import softwareDesign.Nissantruck;
import softwareDesign.truck;

public class Testtruck {
	truck t1=new truck();
	@Test
	/*
	 * The following methods are used to test the calaculatetool method which is defined in truck class
	 */
	public void testcalculatetoll()
	{
		int cash;
		truck ford = new Fordtruck(5, 12000); // 5 axles and 12000 kilograms
		cash=t1.calculateToll(ford);
		assertEquals(cash, 145);
		
	}
	public void testNissancalculatetoll()
	{
		int cash;
		truck nissan = new Nissantruck(2, 5000); // 2 axles and 5000kg
		truck t1=new truck();
		cash=t1.calculateToll(nissan);
		assertEquals(cash, 60);
		
	}
	public void testdaewoocalculatetoll()
	{
		int cash;
		truck daewoo = new DaewooTruck(6, 17000);// 6 axles and 17000 kilograms
		truck t1=new truck();
		cash=t1.calculateToll(daewoo);
		assertEquals(cash, 200);
	}
	
}
