package june28programs;

public class ReverseAString {

	public static void main(String[] args) {
		
		String Name= "gowthamisuresh";
		String rev="";
		char ch;
		for(int i=0;i<Name.length();i++) {
			ch=Name.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);

	}

}
