package StringPract;

public class CheckToStringAnagams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag=true;
		String s1="abcd";
		String s2="cdda";
		int i=s1.length();
		int j=s2.length();
		
		if(i==j)
		{
			for (int k = 0; k < i; k++) {
				for (int m = 0; m < i; m++) {
					
					if(s1.charAt(k)==s2.charAt(m))
					{
						flag=false;;
						break;
					}
					else
					{
						flag=true;
						break;
					}
				}
			}
		}
		else
		{
			flag=false;
		}
		
		if(flag)
		{
			System.out.println("anagams");
		}
		else
		{
			System.out.println("not anagams");
		}
	}

}
