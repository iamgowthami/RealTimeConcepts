package juneprogramall;

public class NonReaptingchar {

	public static void main(String[] args) {
		
		String src="gowthamireddy";
		for(char c:src.toCharArray()) {
			if(src.indexOf(c)==(src.lastIndexOf(c))) {
			System.out.print(c);
		}
			
		}
	}

	

}
