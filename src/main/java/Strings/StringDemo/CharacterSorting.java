package Strings.StringDemo;

import java.util.Scanner;

public class CharacterSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String value");
		String a = sc.next();
		char b[] = a.toCharArray();
		int count;
		char temp;
		for (int i = 0; i < b.length; i++) {
			count = 0;
			for (int j = 0; j < b.length; j++) {
				if (b[i] < b[j]) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}

		}
		for (char x : b) {
			System.out.print(x);
		}
	}
}
