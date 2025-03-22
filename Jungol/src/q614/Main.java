package q614;

import java.util.Scanner;

class School {

	private String name;
	private String grade;
	
	public School(String name, String grade) { 
		this.name = name;
		this.grade = grade;
	}
		
	public void student() {
		System.out.println(grade + " grade in " + name + " School");
	}
}	
		

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		School sch1 = new School("Jejuelementary", "6");
		
		String name = sc.next();
		String grade = sc.next();
		sc.close();
		
		School sch2 = new School(name, grade);
		sch1.student();
		sch2.student();
	}
}