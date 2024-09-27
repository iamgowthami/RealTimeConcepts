package june28programs;

public class NonReapetaingCharacter {

	public static void main(String[] args) {
		
		String name="gowthamireddy";
		for(char c:name.toCharArray()) {
			if(name.indexOf(c)==(name.lastIndexOf(c))) {
			System.out.print(c);
		}
		}

	}

}
