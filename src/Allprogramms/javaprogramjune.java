package Allprogramms;

public class javaprogramjune {

	public static void main(String[] args) {
		
		int num =3234456;
		int rev =0;
		 
		 
		while(num!=0) {
			
			rev=rev*10+num%10;
			num= num/10;
		}
		System.out.println("reverse a number:" +rev);
		
		

	}

}
