package june28programs;

import java.util.Scanner;

public class TwoDifferentStringComparison {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE first string:");
		String first=sc.nextLine();
		System.out.println("enter the second String:");
		String second = sc.nextLine();
		if(first.equalsIgnoreCase(second)) {
			System.out.println(first+"and" +second +" both are same");
		}else {
			System.out.println(first+"and" +second +" both are not same");

		}
		
		
		
		

	}

}
