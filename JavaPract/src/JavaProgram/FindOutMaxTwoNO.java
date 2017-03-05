package JavaProgram;

public class FindOutMaxTwoNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={1,2,3,4,5,6};
		int m1=0;
		int m2=0;
		
		for(int e:a)
		{
			if(m1<e)
			{
				m2=m1;
				m1=e;
			}
			else if(m2<e)
			{
				m2=e;
			}
		}
		System.out.println(m1);
		System.out.println(m2);
	}

}
