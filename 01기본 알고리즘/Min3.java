package chap01;

public class Min3 {
	
	static int min3(int a, int b, int c) {
		int max = a;
		if (b < max)
			max = b;
		if (c < max)
			max = c;
		
		return max;
	}
	
	
	public static void main(String[] args) {
		System.out.println("min3(3,2,1) = " + min3(3,2,1));
	}
}
