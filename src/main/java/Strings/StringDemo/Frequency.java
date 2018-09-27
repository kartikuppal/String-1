package Strings.StringDemo;

import java.util.Scanner;

public class Frequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String value");
		String a = sc.next();
		String b = "";
		int count, i;

		for (i = 0; i <= a.length()-1; i++) {
			count = 0;

			for (int j = 0; j <= a.length() - 1; j++) {
				if (a.charAt(i) == a.charAt(j))

				{

					count++;
				}

			}

			System.out.println("Count of character " + a.charAt(i) + " is " + count);

		}

	}

}