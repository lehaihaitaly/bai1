package core;

import test.Calculator;

public class Main {
	public static final int SUM = 9;
	public static final int DIFF = 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(testSumWithParams());
		System.out.println(testSumWithoutParams());
		System.out.println(testDiffWithParams());
		System.out.println(testDiffWithoutParams());

	}

	public static boolean testSumWithParams() {
		Calculator cal = new Calculator();
		int result = cal.sum(4, 5);
		return result == SUM;
		
	}
	
	public static boolean testSumWithoutParams() {
		Calculator cal = new Calculator(4, 5);
		int result = cal.sum();
		return result ==SUM;
	}
	
	public static boolean testDiffWithParams() {
		Calculator cal = new Calculator();
		int result = cal.diff(5, 3);
		return result==DIFF;
	}
	
	public static boolean testDiffWithoutParams() {
		Calculator cal = new Calculator(7, 5);
		int result = cal.diff();
		return result == DIFF;
	}
}
