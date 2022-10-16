package Hacktober;

import java.util.Scanner;

public class D2SumOfFirstAndLast {

	public static void main(String[] args) {
		D2SumOfFirstAndLast task = new D2SumOfFirstAndLast();
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
