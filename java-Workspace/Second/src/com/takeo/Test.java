package com.takeo;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter value of a : ");
			long a = sc.nextLong();
			System.out.println("Enter value of b : ");
			long b = sc.nextLong();
			A a1 = new A(a, b);
			A a2 = null;
			try {
				a2 = a1.clone();
			} catch (CloneNotSupportedException e) {
				System.out.println(e.getMessage());
			}

			System.out.println("a1 : \n===========\n" + a1 + "\na2 : \n============\n" + a2+"\n\n=======End of Session========\n\n\n\n\n\n\n");

		}

	}

}
