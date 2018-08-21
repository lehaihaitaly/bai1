package test;

public class Calculator {
	int a;
	int b;
	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public int sum() {
		return a + b;
	}

	public int sum(int a , int b) {
		return a + b;
	}
	
	public int diff() {
		return a - b;
	}
	
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int diff(int a , int b) {
		return a - b;
	}
}
