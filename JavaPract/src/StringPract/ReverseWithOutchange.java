package StringPract;

public class ReverseWithOutchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="manas ranjan mohanty";
		String s1="";
		
		String[] s2=s.split(" ");
		
		for (int i = 0; i < s2.length; i++) {
			s1=s1+ s2[s2.length-1-i];
			s1=s1+ " ";
		}

		System.out.println(s1);
		System.out.println(s1.trim());
	}

}
