import java.util.Random;

import javax.swing.JOptionPane;

public class review {
public static void main(String[] args) {
	//sayHello();
	//String number = JOptionPane.showInputDialog("Tell me a number");
	//int grinch = Integer.parseInt(number);
	//highLow(grinch);
	//randomNumber1()
	//randomNumber2();
	sleep();
	
//finish the methods below
}   
    
    
    
    public static void sayHello(){
    //Ask the user for their name
    String name = JOptionPane.showInputDialog("What is your name?");
    //Ask the user for something they like 
    String like = JOptionPane.showInputDialog("What do you like?");
    //print out a mesasage that says "[name] loves [thing]"
    JOptionPane.showMessageDialog(null, name + " loves " + like);
    
    
    
    }
    //
    public static void highLow(int number){
    //if number is less than 10
    	
     if (number < 10 ) {
		System.out.println("lower");
	}        
    	
        //print lower
        
    //else 
     else {
		System.out.println("higher");
	}
        //print higher
    }
	
    
    
    
    public static void randomNumber1(){
    //use Random to print a number between 0 and 100
    Random rnd = new Random();
    System.out.println(rnd.nextInt(100));
    
    
    }
    public static void randomNumber2(){
    //Use Random to print a number between 55 and 105
    	Random rnd = new Random();
        System.out.println(rnd.nextInt(105 - 55 +1)+55);
    
    }
	//complete the method below
    public static void sleep(){
    
    //ask the user for the amount of sleep they got last night
    String sleep = JOptionPane.showInputDialog("How much sleep did you get last night?");
    int six = Integer.parseInt(sleep);
    //if they said less than 6, tell them "that's not enough"
    if (six < 6 ) {
    JOptionPane.showMessageDialog(null,"that is not enough sleep");
	}
    //else if they said between 6 and 8, tell them "good job"
    else if (six >= 6 && six<=8) {
		JOptionPane.showMessageDialog(null, "good job");
	}
    //else tell them "that's too much"
    else {
	JOptionPane.showMessageDialog(null, "that's to much");
	}
    }
	



    //finish this method so that "even" is printed if the number is even, or "odd" if the number is odd
    public static void evenOrOdd(int number){
    if (number %2==0) {
		System.out.println("even");
	} else {
			System.out.println("odd");
	}
}
    
    
    //finish the method so that it asks the user for a number, then uses a for loop to count down to 0 from that number

	
	
	

}