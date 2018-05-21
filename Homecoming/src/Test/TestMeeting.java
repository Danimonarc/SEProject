 import org.junit.Test;
 
 public class TestMeeting {
-	
+
 	@Test
-	public void testSetters () {
-		timeStyle h = 12:00:00;
-		String p = "Larios";
-		String d = "Teatinos";
-		Meeting instance = new Meeting();
-		
-		instance.setHour(h);
-		assertEquals(instance.getHour(), h);
-		
-		instance.setPlace(p);
-		assertEquals(instance.getPlace(), p);
-		
-		instance.setDestination(d);
-		assertEquals(instance.getDestination(), d);
-}
-	
-	@After
-	public void testHourNotNULL () {
-		assertNotEquals (hour, nullHour);
-	}
-		
-	@After
-	public void testPlaceNotNULL () {
-		assertNotEquals (place, nullString);
-	}
-		
-	@After
-	public void testDestinationNotNULL () {
-		assertNotEquals (destination, nullString);
+	public void test() {
+		fail("Not yet implemented");
 	}
-	
-	@After
-	public void testHourFormat () {
-		assertTrue (hour.instanceof(timeStyle));
-	}
-	
-	@After
-	public void testHourOutOfBounds () {
-		assertTrue (hour>=00:00:00);
-		assertTrue (hour<24:00:00);
-	}
-	
+
+}
