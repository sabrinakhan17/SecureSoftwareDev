package week3Pt1;

public class MulitipleExact {
	
	public static void firstTest() {
		int x = 2147483647;
		int y = 5;
		int total = x*y;
		System.out.println(total);
		
		System.out.println("x*y is actually doing x-y");
	}
	
	public static void mulitipleExactTest() {
		try {
			int x = 2147483647;
			int y = 5;
			int total = Math.multiplyExact(x, y);
			System.out.println(total);
		}catch(Exception e) {
			System.out.println("ERROR: "+e.getMessage());
			
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Java Overflow without Multiply Exact Method:\n");
		firstTest();
		System.out.println("-------------------");
		System.out.println("Java Overflow with Multiply Exact Method:\n");
		mulitipleExactTest();
	}

}
