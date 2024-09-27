package Allprogramms;

public class RevereseNumber {

	public static void main(String[] args) {
		
		//declare a number
		int num1 = 1992838;
		int rev = 0;
		
		while(num1!=0){
			rev = rev*10+num1%10;
			num1 = num1/10;
			
			
		}
		System.out.println("reverse of original number:"+rev);
		
		
		

	}

}
