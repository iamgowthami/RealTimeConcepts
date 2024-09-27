package june28programs;

import java.util.Scanner;

public class ExtraSpecialCharacterFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String str= sc.nextLine();
		String remove=str.replaceAll("[^A-Z a-z]", "");
		System.out.println("removespecialcharacterfrom string:"+remove);
		
		

	}

}
