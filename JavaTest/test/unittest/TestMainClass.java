package unittest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestMainClass {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testName() throws Exception {
		var  mainClass = new MainClass(); 
		assertTrue(mainClass.isMainClass());
	}

	@Test
	@DisplayName("Second test")
	void testTwo() throws Exception {
		var  mainClass = new MainClass(); 
		assertTrue(mainClass.isMainClass());
	}
}
