package Allprogramms;

import java.util.Scanner;

public class Fibonnacciseries {

	public static void main(String[] args) {
		int r,sum=0,temp;
		int n=656;
		temp = n;
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		
		if(temp==sum) {
		System.out.println("palindrome number");
		}else{
			System.out.println("not palindrum");
		
}
	}

}
