package june28programs;

public class Smallestnumberinarray {

	public static void main(String[] args) {
		int arr[]= {1,2,34,54,67,8,9,21,0};
		int min= Integer.MAX_VALUE;
		for(int num:arr) {
			if(min>num) {
				min=num;
			}
		}
		System.out.println(min);

	}

}
