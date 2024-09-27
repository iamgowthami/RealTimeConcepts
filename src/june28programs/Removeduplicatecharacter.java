package june28programs;

import java.util.HashSet;
import java.util.Set;

public class Removeduplicatecharacter {

	public static void main(String[] args) {

		String name="gowthamisuresh";
		Set<Character> uniq= new HashSet<Character>();
		for(char c: name.toCharArray()) {
			if(Character.isLetter(c)) {
				uniq.add(c);
			}
		}
		System.out.println(uniq);
	}

}
