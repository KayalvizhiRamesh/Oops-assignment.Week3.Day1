package week3.day1.assignments;

public class Automation implements Language, TestTool{

	public void Selenium() {
		System.out.println("Selenium method from TestTool");
	}

	public void JAVA() {
		System.out.println("Java method from Language");
	}
	
	public void python() {
		System.out.println("Python method from Abstract class");
	}
	
	public void ruby() {
		System.out.println("Ruby method from Abstract class");
	}

	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.Selenium();
		Language auto1 = new Automation();
		auto1.JAVA();
		auto.python();
		auto.ruby();
	}
}
