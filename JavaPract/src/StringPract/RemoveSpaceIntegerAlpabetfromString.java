package StringPract;

public class RemoveSpaceIntegerAlpabetfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="manas @ranjan mohaty @$%%12 23 45 75 bapuna 5^%&^^454";
		System.out.println(s.replaceAll(" ", ""));
		System.out.println(s.replaceAll("[a-zA-Z]", ""));
		System.out.println(s.replaceAll("[0-9]", ""));
		System.out.println(s.replaceAll("[0-9]", "").replace(" ", ""));
		String h=s.replaceAll("[a-zA-Z]", "").replace(" ", "");
		System.out.println(h);
		String j=s.replaceAll("[a-zA-Z]", "").replaceAll("[0-9]", "").replace(" ", "");
		System.out.println(j);
		
	}

}
