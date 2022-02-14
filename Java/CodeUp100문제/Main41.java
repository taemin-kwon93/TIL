package codeUpExample;

import java.util.Scanner;

public class Main41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char b = a.charAt(0);
		sc.close();
		System.out.println(++b);

	}
}
