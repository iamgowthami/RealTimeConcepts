package Allprogramms;

import java.util.HashSet;
import java.util.Set;

public class DuplicatenumfromArray {

	public static void main(String[] args) {
		
		int ar[] = {13,14,56,56,45,67,45,78,98,78,90};
		
		Set<Integer> unique = new HashSet<Integer>();
		Set<Integer> duplicate = new HashSet<Integer>();
		
		for(int num:ar) {
			if(!unique.add(num)) {
				duplicate.add(num);
			}
		}
		System.out.println("print duplicate numbers:"+duplicate);
	}

}
