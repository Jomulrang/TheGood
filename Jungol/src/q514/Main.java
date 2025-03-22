package q514;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		String c = sc.next();
		sc.close();

		System.out.printf("%.2f\r\n", a);
		System.out.printf("%.2f\r\n", b);
		System.out.printf("%s", c);
		
		
		
	}
}

//		Scanner sc = new Scanner(System.in);
//		System.out.print("키를 입력하세요. ");
//		int height = sc.nextInt();
//		
//		System.out.print("몸무게를 입력하세요. ");
//		double weight = sc.nextDouble();
//		
//		System.out.print("이름을 입력하세요. ");
//		String name = sc.next();
//		
//		sc.close();
//		
//		System.out.printf("키 = %d \r\n", height);
//		System.out.printf("몸무게 = %.1f \r\n", weight);
//		System.out.printf("이름 = %s", name);