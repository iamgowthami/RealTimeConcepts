package NewPrograms;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		int a=10,b=20;
		int temp;
		temp=a+b;//30
		b=temp-b;//30-20=10
		a=temp-b;//30-10=20
		System.out.println("swap a value:"+a);
		System.out.println("swap b value:"+b);
		
		int a1=10,b1=30,c=50;
		a1=a1+b1+c;//50
		b1=a1-(b1+c);
		c=a1-(b1+c);//40-30=10
		a1=a1-(b1+c);//40-10=30
		System.out.println("swap a value:"+a1);
		System.out.println("swap b value:"+b1);
		System.out.println("swap c value:"+c);

		
	int a2=10,b2=20,c2=30;
	int temp1=a2;
	a2=b2;
	b2=c2;
	c2=temp1;
	System.out.println(a2+":"+b2+":"+c2);
	



	}

}
