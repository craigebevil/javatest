package JenkinsTest.JenkinsTest;

public class MainClass {

	public boolean isMainClass() {
		return true; 
	}
	
	public int add (int a, int b) {
		return a+b; 
	}
	
	public static void main(String[] args) {
		 MainClass mainClass = new MainClass(); 
		if (mainClass.isMainClass()) { 
			System.out.println("it is a main class");
		}
	}
}
