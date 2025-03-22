package q533;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String gender = sc.next();
		int age = sc.nextInt();
		
		sc.close();
		
		if (gender.equals("M") || gender.equals("F")) {
			if (gender.equals("M") && age >= 18) {
				System.out.println("MAN");
			} else if (gender.equals("F") && age >= 18) {
				System.out.println("WOMAN");
			} else if (gender.equals("M") && age < 18) {
				System.out.println("BOY");
			} else if (gender.equals("F") && age < 18) {
				System.out.println("GIRL");
			} 
		}
	}
}
