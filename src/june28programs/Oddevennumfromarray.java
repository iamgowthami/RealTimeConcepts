package june28programs;

public class Oddevennumfromarray {

	public static void main(String[] args) {
		int arr[]= {12,90,88,78,65,43,78,99,2,3,4,5,6,7,8};
		int evencount=0;
		int oddcount=0;
		for(int num:arr) {
			if(num%2==0) {
				evencount++;
				System.out.println("even number"+num);
			}else {
				oddcount++;
				System.out.println("odd number"+num);
			}
			
		}
		System.out.println("total numberof count"+evencount);
		System.out.println("total no of count is"+oddcount);


	}

}
