package JavaProgram;

public class MissingNOInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]i={1,2,3,4,5,6,7,8};
		int index=9;
		int val=0;
		for (int j = 0; j < i.length; j++) {
			
			index=index+j+1;
			val=val+i[j];
		}
		int res=index-val;
		System.out.println(res);
	}

}
