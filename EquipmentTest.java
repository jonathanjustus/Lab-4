public class EquipmentTest
{
	//Test Constructor
	Equipment testEquipment = new Equipment("testCar/1,100.1,200,hypersonic");
	
	public void ConstructorTest() throws AssertException
	{
		Assert.assertTrue(testEquipment.getName().equals("testCar"));
		Assert.assertEquals(1, testEquipment.getCount(), 0.01);
		Assert.assertEquals(100.1, testEquipment.getTotalWeight(), 0.01);
		Assert.assertEquals(200, testEquipment.getTotalPrice(), 0.01);
		Assert.assertTrue(testEquipment.getDescription().equals("hypersonic"));
	}
	//Assertions for testing each element
	
	public void toStringTest() throws AssertException
	{
		String expected = "Name: testCar, Number: 1, Weight: 100.10 lbs, Price: $200.00 - hypersonic";
		String actual = testEquipment.toString();
		
		Assert.assertEquals(expected, actual);
	}
	
	
}