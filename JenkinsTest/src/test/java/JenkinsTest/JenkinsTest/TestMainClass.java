package JenkinsTest.JenkinsTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

class TestMainClass {

	MainClass mainClass;  
	
	@BeforeEach
	void setUp() throws Exception {
		mainClass = new MainClass(); 
	}

	@Test
	void testName() throws Exception {
		assertTrue(mainClass.isMainClass());
	}

	@Test
	@DisplayName("Test addition")
	void testAdd() {
		assertEquals(Integer.valueOf(mainClass.add(3,5)),Integer.valueOf(8)); 
	}

	@Test
	@DisplayName("Test subtract")
	void testSubtract() {
		assertEquals(Integer.valueOf(mainClass.subtract(8,3)),Integer.valueOf(5)); 
	}

	@RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetitions}") 
	void testAdd(RepetitionInfo repInfo) throws Exception {
		System.out.println(repInfo.getTotalRepetitions());
		MainClass mainClass = new MainClass(); 
		assertTrue(mainClass.isMainClass());
	}
}
