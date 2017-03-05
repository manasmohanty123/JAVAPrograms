package StringPract;

public class Replaecall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="ma na s ra n ja a n";
		String s1=s.replace(" ", "");
		System.out.println(s1);
		
		String s2="ma5 na1 1s 7ra9 n1 5j4a 55a2 1n";
		System.out.println(s2.replaceAll("[a-zA-Z]", ""));
		System.out.println(s2.replaceAll("[0-9]", ""));

	}

}
