package Abstract;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		abstractclass object = new class_inheritance();
		Scanner s = new Scanner (System.in);
		int a =s.nextInt();
		int b =s.nextInt();
		object.add(a, b);
		object.subtract(a,b);
	}

}
