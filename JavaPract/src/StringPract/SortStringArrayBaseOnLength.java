package StringPract;

import java.util.Arrays;
import java.util.Iterator;

public class SortStringArrayBaseOnLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp;

		String[]a={"acbd","xyz","z","kx","tushdj","ankjhsakhskjh","abjhsshjhsbjhsgjsa","FTASGV","AVDHD","ndhfkhfdkjhfkdhfkdfj"};
		System.out.println("before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j].length()>a[j+1].length())
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		System.out.println("-------------------------------------------");
		System.out.println("after sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
