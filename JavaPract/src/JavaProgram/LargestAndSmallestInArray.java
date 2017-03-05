package JavaProgram;

public class LargestAndSmallestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i={454,1,2,5,78,55,568,54,889};
		int big=0;
		int small=i[1];
		
		for (int j = 0; j < i.length; j++) {
			if(i[j]>big)big=i[j];
		}

		System.out.println(big);
		
		for (int j = 0; j < i.length; j++) {
			if(i[j]<small)small=i[j];
		}
		System.out.println(small);
	}

}
