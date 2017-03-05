package StringPract;

public class CheckPalendrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="manas";
		String s1="";
		char c;
		for (int i = 0; i < s.length(); i++) {
			c=s.charAt(s.length()-1-i);
			s1=s1+c;
		}

		if(s.equals(s1)){
			System.out.println("palendrom");
		}
		else
		{
			System.out.println("not palendrom");
		}
	}

}
