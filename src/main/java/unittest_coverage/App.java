package unittest_coverage;
public class App {
	
	public static void main() {
		System.out.println("sysout");
		method1(true);
	}
	
	private static void method1(boolean condition) {
		if(condition) {
			System.out.println("condition true");
		} else {
			System.out.println("condition false");
		}
	}
}

