package JavaProgram;

public class InterSectionAndUnionOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a={1,2,3,4};
		int []b={2,5,6,7,3};
		int []d=new int[a.length];
		int count=0;
		int[]c=new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
			count++;
		}
		
		for (int i = 0; i < b.length; i++) {
			c[count++]=b[i];
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j])
				{
					d[i]=a[i];
				}
			}
		}
		System.out.println("-------------------------------------------");
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
	}

}
