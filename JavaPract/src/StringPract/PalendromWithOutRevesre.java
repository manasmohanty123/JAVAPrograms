package StringPract;

public class PalendromWithOutRevesre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="manas";
		int a=1;
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) != s.charAt(s.length()-1-i))
			{
				a=0;
				break;
			}
		}

		if(a==1)
		{
			System.out.println("palendrom");
		}
		else
		{
			System.out.println("not palendrom");
		}
	}

}
