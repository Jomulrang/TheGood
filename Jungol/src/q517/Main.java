package q517;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		sc.close();
		
		System.out.printf("%.3f\r\n", a);
		System.out.printf("%.3f\r\n", b);
		System.out.printf("%.3f", c);
		
	}
}

//		Scanner sc = new Scanner(System.in);
//		System.out.println("두 개의 실수를 입력하시오. ");
//		double x = sc.nextDouble();
//		double y = sc.nextDouble();
//		sc.close();
//		
//		System.out.printf("x = %.2f\r\n", x);
//		System.out.printf("y = %.2f\r\n", y);