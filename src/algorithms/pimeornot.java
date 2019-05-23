package algorithms;

import javax.swing.JOptionPane;

public class pimeornot {
public static void main(String[] args) {
	boolean prime = true;
	int num = 29; 
	String input = JOptionPane.showInputDialog("what number do you chose???????");
	num = Integer.parseInt(input);
	String answer = "";
	for (int i = 2; i < num; i++) {
	if (num % i == 0) {
		prime = false;
		answer = " not";
	}	
	}
	//System.out.println("Prime: " + prime);
	System.out.println(num + " is" + answer + " prime!!");
	JOptionPane.showMessageDialog(null, num + " is" + answer + " prime!!");
}
}
