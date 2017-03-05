package JavaProgram;

public class Print1To100WithOutUsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1;
		print(n);
	}
	
	public static void print(int n) {
		System.out.println(n);
		if(n<10)
		{
			print(n+1);
		}
	}

}
