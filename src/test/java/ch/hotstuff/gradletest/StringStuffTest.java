package ch.hotstuff.gradletest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringStuffTest
{	
	@Test
	public void testReverse() {
		assertEquals("suiraM", StringStuff.reverse("Marius"));
	}
}
