package algorithms;

public class fibonacci {
public static void main(String[] args) {
	int a = 0;
	int b = 1;
	int ab = a;
	for (int i = 0; i < 6; i++) {
		System.out.println(a);
		a = a + b;
		System.out.println(b);
		b = a + b;
	}
}
}
