public class ZooTest
{
	//Test methods: getTotalHeight, getCapacity, and toString methods
	
	
	
	public void getTotalHeightTest() throws AssertException
	{	
		//create object to test
		Zoo totalHeightTest = new Zoo(10);
		
		double expectedHeight = 0.0;
		double actualHeight = totalHeightTest.getTotalHeight();
		
		Assert.assertEquals(expectedHeight, actualHeight, 0.01);
	}
	
	public void getCapacityTest() throws AssertException
	{
		//create object to test
		Zoo capacityTest = new Zoo(10);
		
		int expectedCapacity = 10;
		int actualCapacity = capacityTest.getCapacity();
		
		Assert.assertEquals(expectedCapacity, actualCapacity, 0.01); 
	}
	
	public void ToStringTest() throws AssertException
	{
		Zoo toStringTest = new Zoo(10);
		
		String actual = "These animal live in the zoo: \n";
		String expected = toStringTest.toString();
		
		Assert.assertEquals(expected, actual);
	}
	
	
}