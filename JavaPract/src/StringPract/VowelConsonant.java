package StringPract;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="manas ranjan mohanty";
		char[]c=s.toCharArray();
		int count=0;
		int count1=0;
		for (int i = 0; i < c.length; i++) {
			
		switch (c[i]) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			count++;
			
			break;

		default:
			count1++;
			
			break;
		}
		}
		System.out.println("vowel    "+count);
		System.out.println("consonant   "+count1);
	}

}
