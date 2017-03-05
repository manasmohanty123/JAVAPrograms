package JavaProgram;

public class reversearrayinplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]i={1,2,3,4,5,6,7,8,9};
		int[]j=new int[9];
		int k=i.length;
		//System.out.println(k);
		for (int j2 = 0; j2 < k; j2++) {
		//	System.out.println(k-1-j2);
			j[j2]=i[k-1-j2];
		}

		//System.out.println(j.toString());
		for (int k2 = 0; k2 < j.length; k2++) {
			System.out.println(j[k2]);
		}
	}

}
