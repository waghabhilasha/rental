import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class test {

	@Before
	public void setUp() throws Exception {
		movie movie1,movie2,movie3;
	Customer customer;
	//Rental myRental;
	movie1= new movie("Bahubali:The Begining", 2);
	movie2 = new movie("RAID", 1);
	movie3 = new movie("Infinity War", 1);
	customer= new Customer("Kattapa");
	customer.addRental(new Rental(movie1,4));
	customer.addRental(new Rental(movie2, 5));
	customer.addRental(new Rental(movie3, 2));
	customer.statement();

	}
	@Test
	public void test() {
		//fail("Not yet implemented");
	}
}


