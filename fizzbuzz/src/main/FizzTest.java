package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FizzTest {

	Fizz fizz = new Fizz();
	@Test
	public void testFizzPrintNumbers() {
		Assert.assertEquals("1", fizz.calc(1));
		Assert.assertEquals("17", fizz.calc(17));
		Assert.assertEquals("82", fizz.calc(82));

	}
	
	@Test
	public void testFizzPrint() {
		Assert.assertEquals("Fizz", fizz.calc(3));
		Assert.assertEquals("Fizz", fizz.calc(33));
		Assert.assertEquals("Fizz", fizz.calc(93));

	}
	@Test
	public void testBuzzPrint() {
		Assert.assertEquals("Buzz", fizz.calc(50));
		Assert.assertEquals("Buzz", fizz.calc(25));
		Assert.assertEquals("Buzz", fizz.calc(10));
	}
	
	@Test
	public void testFizzBuzzPrint() {
		Assert.assertEquals("FizzBuzz", fizz.calc(30));
		Assert.assertEquals("FizzBuzz", fizz.calc(75));
		Assert.assertEquals("FizzBuzz", fizz.calc(15));

	}

}
