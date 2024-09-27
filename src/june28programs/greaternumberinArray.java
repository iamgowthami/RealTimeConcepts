package june28programs;

public class greaternumberinArray {

	public static void main(String[] args) {
		int arr[]= {12,33,44555,5677879,77,888,7765,5,55};
		int max = Integer.MIN_VALUE;
		for(int num:arr) {
			if(max<num) {
				max=num;
			}
		}
		System.out.println(max);
		

	}

}
