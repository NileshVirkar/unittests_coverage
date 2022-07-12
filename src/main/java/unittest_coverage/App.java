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
	
	public static void startScan(String scanConfig) {
		try {
            		FileOutputStream fo = new FileOutputStream(new File("some/file"));
       
		} catch (Exception e) {
			System.out.println("Exception while running scan");
		}
	}
}

