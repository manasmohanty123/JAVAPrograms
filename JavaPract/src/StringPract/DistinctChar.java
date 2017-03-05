package StringPract;

public class DistinctChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="bananas";
		String s1="";
		char c;
		for (int i = 0; i < s.length(); i++) {
			c=s.charAt(i);
			
			if(s1.indexOf(c) == -1)
			{
				s1=s1+c;
			}
		}
		System.out.println(s1);
	}

}
