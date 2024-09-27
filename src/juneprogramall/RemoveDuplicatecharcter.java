package juneprogramall;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatecharcter {

	public static void main(String[] args) {
		String name ="jamjam";
		Set<Character> unique = new HashSet<Character>();
		for(char c:name.toCharArray()) {
			if(Character.isLetter(c)) {
				unique.add(c);
				
			}
		}
		System.out.println(unique);
	}

}
