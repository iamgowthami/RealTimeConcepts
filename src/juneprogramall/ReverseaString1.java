package juneprogramall;

import java.util.Iterator;

public class ReverseaString1 {

	public static void main(String[] args) {
		
		String name ="gowthamireddy";
		String rev="";
		char ch;
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			rev=ch+rev;
		
		}
		System.out.println(rev);
		

	}

}
