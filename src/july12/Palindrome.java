package july12;

public class Palindrome {

	public static void main(String[] args) {
		String name="madam";
		String rev="";
		for(int i=0;i<name.length();i++) {
			rev=name.charAt(i)+rev;
			
		}
		System.out.println(rev);
		
		if(name.equals(rev)) {
			System.out.println("palindrome:"+name);
		}else {
			System.out.println("not a palindrome:"+name);
		}

	}

}
