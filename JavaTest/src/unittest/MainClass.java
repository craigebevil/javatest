package unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainClass {

	public boolean isMainClass() {
		return true; 
	}
	
	public static void main(String[] args) {
		var mainClass = new MainClass(); 
		if (mainClass.isMainClass()) { 
			System.out.println("it is a main class");
		}
	}
}
