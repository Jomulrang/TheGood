package q530;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		
		if (year >= 20) {
			System.out.println("adult");
		} else {
			System.out.printf("%d years later", 20-year);
		}
	}
}
