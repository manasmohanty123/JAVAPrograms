package StringPract;

public class RevesreAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="manas";
		String s1="";
		char c;
		for (int i = 0; i < s.length(); i++) {
			c=s.charAt(s.length()-1-i);
			s1 +=c;
			
		}
		System.out.println(s1);
	}

}
