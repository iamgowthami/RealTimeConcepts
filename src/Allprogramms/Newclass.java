package Allprogramms;

import java.util.Scanner;

public class Newclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String str = sc.nextLine();
		String original = str;
		String rev ="";
		int len = str.length();
		for(int i = len-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		//System.out.println("reverse string is:"+rev);
		if(original.equalsIgnoreCase(rev)) {
			System.out.println(original+" string is palindrome " );
		}else {
			System.out.println(rev+" string is not palindrome " );
	
		}

	}



	}


