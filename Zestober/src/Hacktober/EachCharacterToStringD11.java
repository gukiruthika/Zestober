package Hacktober;

import java.util.Scanner;

public class EachCharacterToStringD11 {

	public static void main(String[] args) {
		EachCharacterToStringD11 task = new EachCharacterToStringD11();
		task.display();
	}
	void display() {
		try (Scanner scan = new Scanner(System.in)) {
			String input = scan.nextLine();
			String temp="";
			for(int i=0;i<input.length();i++) {
				temp += input.charAt(i);
				System.out.print(temp+" ");
			}
		}
	}

}
