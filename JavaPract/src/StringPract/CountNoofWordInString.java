package StringPract;

public class CountNoofWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="manas ranjan mohanty";
		String s1=s.replace(" ", "");
		int count=0;
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
			System.out.println(++count);
		}

	}

}
