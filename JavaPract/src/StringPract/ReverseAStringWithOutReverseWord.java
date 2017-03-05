package StringPract;

public class ReverseAStringWithOutReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="manas ranjan mohanty";
		String[]s1=s.split(" ");
		String s2="";
		for (int i = 0; i < s1.length; i++) {
			s2=s2+s1[s1.length-1-i];
			s2=s2+" ";
		}

		System.out.println(s2);
	}

}
