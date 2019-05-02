package algorithms;

public class pimeornot {
public static void main(String[] args) {
	boolean prime = true;
	int num = 67; 
	for (int i = 2; i < num; i++) {
	if (num % i == 0) {
		prime = false;
	}	
	}
	System.out.println("Prime: " + prime);
	
}
}
