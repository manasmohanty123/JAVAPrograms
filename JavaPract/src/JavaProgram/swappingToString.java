package JavaProgram;

public class swappingToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="manas";
		String k="mano";
		s=s+k;
		k=s.substring(0,s.length()-k.length());
		System.out.println(k);
		s=s.substring(k.length());
		System.out.println(s);
	}

}
