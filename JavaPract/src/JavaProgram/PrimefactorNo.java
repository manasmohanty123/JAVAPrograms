package JavaProgram;

public class PrimefactorNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=16;
		System.out.println(primeFact(n));
	}
		public static int primeFact(int k)
		{
		int i;
		for ( i = 2; i <=k; i++) {
			
			if (k%i ==0)
			{
				k=k/i;
				i--;
			}
		}
		return i;
		}
		
	}


