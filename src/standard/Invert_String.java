package standard;

import java.util.Scanner;

public class Invert_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a String: ");
		char[] letters = sc.nextLine().toCharArray();
		
		System.out.print("Invert String: ");
		for (int i = letters.length - 1; i >= 0; i--) {
			System.out.print(letters[i]);
		}
		
		System.out.print("\n");
		
		sc.close();
	}
}
