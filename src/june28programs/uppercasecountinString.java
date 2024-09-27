package june28programs;

import java.util.Scanner;

public class uppercasecountinString {

	public static void main(String[] args) {
		Scanner sd = new Scanner(System.in);
		System.out.println("enter the string:");
		String str = sd.nextLine();
		int count =1;
		for(int i=1;i<=str.length()-1;i++) {
			char c =str.charAt(i);
			if(Character.isUpperCase(c)) {
				count++;
				
			}
			
		}
		System.out.println(count);

	}

}
