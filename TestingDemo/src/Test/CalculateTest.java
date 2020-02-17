package Test;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class CalculateTest {
	static Calculate cal;

	@BeforeAll
	public static void getCal() {
		cal = new Calculate();

	}
	//@Disabled//it can be used on the top of the method or on top of class
	//@Ignore//it is replace with disabled
	@Test
	@RepeatedTest(5)
	void testAdd() {
		//assertEquals(10, cal.add(5, 5));
		assumeTrue(10==cal.add(5, 5));
		System.out.println("tested");

	}

	@Test
	void testSub() {
		assertSame(5, cal.sub(8, 3));

	}

	@Test
	void testMul() {
		assertTrue(10 == cal.mul(5, 2));

	}
	@ParameterizedTest
	@ValueSource(strings= {"abcgdf","bc","cd"})
	void m1(String str) {
		assertTrue(str.length()>3);
		
	}

}
