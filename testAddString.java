package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddString {

	@Test
	void test() {
		jUnitFunction junit2 = new jUnitFunction();
		String ans = junit2.add_Strings("ade", "efg");
		assertEquals("adeefg",ans);
		
	}

}
