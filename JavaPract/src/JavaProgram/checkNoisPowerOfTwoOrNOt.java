package JavaProgram;

import java.awt.geom.FlatteningPathIterator;

public class checkNoisPowerOfTwoOrNOt {

	public static void main(String[] args) {

		int n=64;
		System.out.println(powerCheck(n));
	}
		
		public static boolean powerCheck(int m)
		{
			boolean flag=true;
			if(m<=0)
			{
				flag=false;
			}
			while(m>1)
			{
				if(m% 2 !=0)
				{
					flag=false;
				}
				m=m/2;
			}
			return flag;
		}
}
