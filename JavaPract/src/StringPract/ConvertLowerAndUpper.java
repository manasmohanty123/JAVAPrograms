package StringPract;

public class ConvertLowerAndUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="MaNaS RAnJAn MoHanty";
		String s1="";
		char c;
		
		for (int i = 0; i < s.length(); i++) {
			c=s.charAt(i);
			if(c> 'A' && c< 'Z')
			{
				s1=s1+ Character.toLowerCase(c);
			}
			else
			{
				s1=s1+ Character.toUpperCase(c);
			}
		}
		
		System.out.println(s1);
	}

}
