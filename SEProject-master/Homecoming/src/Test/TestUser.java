package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUser {
	
	@Test
	public void existentUser(User user){
		bool expect=true, actual=false;
		for(User n : userList){
			if(user==n){
				actual = true;
			}
		}
		assertEquals("User already exists.", expect, actual);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
