package collection_all_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDoublicateFrom_Array {
	public static void main(String[] args) {
		int[] a= {12,34,45,67,55,12,34,45};
//		System.out.println(Arrays.toString(removeDoublicate(a)));
		removeDoublicate(a);
	}
	public static void removeDoublicate(int[] a) {
		ArrayList<Integer> ai=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			if(!(ai.contains(a[i]))) {
				ai.add(a[i]);
			}
		}
		
		System.out.print("[");
		for(Integer n:ai) {
			System.out.print(n+",");
		}
		System.out.print("]");
	}
}
