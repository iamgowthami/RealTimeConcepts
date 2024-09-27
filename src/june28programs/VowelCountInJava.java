package june28programs;

import java.util.Scanner;

public class VowelCountInJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		String vowel= "AEIOUaelou";
		int count=0;
		for(char c:str.toCharArray()) {
			if(vowel.indexOf(c)!=1) {
				System.out.println(c);
				count++;
			}
		}
		System.out.print(count);
	}

}
