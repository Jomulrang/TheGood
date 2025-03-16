package q613;

import java.util.Scanner;

class Student {
	private String name;
	private String school;
	private String grade;
	private String ban;

	
	public Student(String name, String school, String grade, String ban) {
		this.name = name;
		this.school = school;
		this.grade = grade;
		this.ban = ban;
	}

	public void print() {
		System.out.println("Name : " + name);
		System.out.println("School : " + school);
		System.out.println("Grade : " + grade);
		System.out.println("ban : " + ban);
	}
	
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		String grade = sc.next();
		String ban = sc.next();
		
		Student st = new Student(name, school, grade, ban);
		name = sc.next();
		school = sc.next();
		grade = sc.next();
		ban = sc.next();
		sc.close();
		
		Student st1 = new Student(name, school, grade, ban);
		st.print();
		st1.print();
	}
}
