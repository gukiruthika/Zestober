package Hacktober;

import java.util.Scanner;

public class SumOfFirstAndLastD2 {

	public static void main(String[] args) {
		SumOfFirstAndLastD2 task = new SumOfFirstAndLastD2();
		System.out.println(task.addTwo());
	}

	int addTwo() {
		try (Scanner scan = new Scanner(System.in)) {
			int number = scan.nextInt();
			int last = number % 10;
			int first = 0;
			while (number > 0) {
				first = number;
				number /= 10;
			}
			return first + last;
		}
	}
}
