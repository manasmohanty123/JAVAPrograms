package StringPract;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int[] a={12,45,78,8,78,7858,454,785,-12,-2,-96,0};
		for (int i : a) {
			System.out.println(i);
		}
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

		System.out.println("-----------------------------------------------------------------------");
		for (int i : a) {
			System.out.println(i);
		}
	}

}
