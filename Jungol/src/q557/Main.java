package q557;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] inp = new char[10];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.next().charAt(0);
		}
		sc.close();
		// 1, 4, 7 번째 문자 출력
		System.out.println(inp[0] + " " + inp[3] + " " + inp[6]);

		// 홀수
		// 1.
		for (int i = 0; i < inp.length; i++) {
			if (i % 2 == 0) {
				System.out.print(inp[i] + " ");
			}
		}
		System.out.println();

		// 짝수
		// 1.
		for (int i = 0; i < inp.length; i++) {
			if (i % 2 != 0) {
				System.out.print(inp[i] + " ");
			}
		}
		System.out.println();

		// 2.
		for (int i = 1; i < inp.length; i += 2) {
			System.out.print(inp[i] + " ");
		}
	}
}
