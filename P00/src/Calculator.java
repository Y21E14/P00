
public class Calculator {

	public int add (int a, int b) {
		return a + b;
	}
	
	public int substract (int a, int b) {
		return a - b;
	}
	
	public int mulitply (int a, int b) {
		return a * b;
	}
	
	public int divide (int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException();
		}
		return a /b;
	}
}
