 import static org.junit.Assert.*;
 
-import java.util.*;
-
-import org.junit.*;
-import org.junit.rules.ExpectedException;
+import org.junit.Test;
 
 public class TestGroup {
 
-	@Rule
-	public ExpectedException e = ExpectedException.none();
-	@Test public void getOnAnEmptyListThrowsException() {
-		List<Object> l = new ArrayList<Object>();
-		e.expect(IndexOutOfBoundsException.class);
-		e.expectMessage("Index: 0, Size: 0");
-		l.get(0); //Throws Exception
-	}
-	
 	@Test
 	public void test() {
 		fail("Not yet implemented");
