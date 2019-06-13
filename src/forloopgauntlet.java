
public class forloopgauntlet {
public static void main(String[] args) {
	
	for (int i = 0; i <101; i++) {
		System.out.println(i);
	}
	for (int i = 100; i >= 0; i--) {
		System.out.println(i);
	}
	for (int i = 2; i < 101; i=i+2) {
		System.out.println(i);
	}
	for (int i = 1; i < 100; i=i+2) {
		System.out.println(i);
	}
	for (int i = 1; i < 501; i++) {
		if (i %2 ==0 ) {
			System.out.println(i + " even");
		}
		else {
			System.out.println(i + " odd");
		}
		
	}
	for (int j = 0; j < 778; j+=7) {
		System.out.println(j);
	}
	for (int i = 2010; i < 2020; i++) {
		System.out.println("In " + i + " I was "+ (i - 2010 ));
	}
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.println(i +" "+j);
		}
	}
	for (int i = 1; i < 8; i+=3) {
		System.out.println("");
	
		for (int j = 0; j < 3; j+=1) {
			System.out.print( j + i + " ");
		}
	}
	for (int i = 1; i < 92; i+=10) {
		System.out.println("");
		for (int j = 0; j < 10; j++) {
			System.out.print( j + i + " ");
		}
	}                                       											
	for (int i = 1; i < 7; i++) {
		System.out.println("");
		for (int j = 0; j <i; j++) {
			System.out.print("* ");
		}
		if (i == 6)
			System.out.println("");
	}
	for (int i = 0; i < 101; i++) {
		System.out.println(100 - i);
	}
}
}
