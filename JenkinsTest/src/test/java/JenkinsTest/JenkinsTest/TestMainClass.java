package JenkinsTest.JenkinsTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
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

	@RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetitions}") 
	@DisplayName("Test addition")
	void testAdd(RepetitionInfo repInfo) throws Exception {
		System.out.println(repInfo.getTotalRepetitions());
		var mainClass = new MainClass(); 
		assertTrue(mainClass.isMainClass());
	}
}
