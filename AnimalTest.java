/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    
    public void fullConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal testSubject = new Animal("Blue", "Bob" , 100.1, 200.2);

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("Blue", testSubject.getColor());
        Assert.assertEquals("Bob", testSubject.getName());
        Assert.assertEquals(200.2, testSubject.getHeight(), 0.01);
        Assert.assertEquals(100.1, testSubject.getWeight(), 0.01);
    }
    
    public void toStringTester() throws AssertException
    {
    	Animal testSubject = new Animal("Blue", "Bob" , 100.1, 200.2);
    	String expected = "Bob, a Blue-colored animal. 100.1 pounds, 200.2 inches\n";
    	String result =  testSubject.toString();
    	
    	Assert.assertEquals(expected, result);
    	
    }
}

