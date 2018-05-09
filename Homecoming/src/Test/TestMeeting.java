package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMeeting {
	
	@After
	public void testHourNotNULL () {
		assertNotEquals (hour, nullHour);
	}
		
	@After
	public void testPlaceNotNULL () {
		assertNotEquals (place, nullString);
	}
		
	@After
	public void testDestinationNotNULL () {
		assertNotEquals (destination, nullString);
	}
	
	@Before
	public void testHourFormat () {
		assertTrue (hour.instanceof(timeStyle));
	}
	
	@Before
	public void testHourOutOfBounds () {
		assertTrue (hour>=00:00:00);
		assertTrue (hour<24:00:00);
	}
	
