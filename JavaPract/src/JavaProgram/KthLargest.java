package JavaProgram;

import java.util.PriorityQueue;

public class KthLargest {

	public static void main(String[] args) {
		int[]n={1,2,3,4,545,66266,54654,545545};
		int k=5;
		System.out.println(findKthLargest(n, k));
		System.out.println(find(n, k));
		
	}
	public static int findKthLargest(int[] nums, int k) {
        int p = 0;
        int numElements = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int n : nums){
            pq.add(n);
        }
        while (numElements-k+1 > 0){
            p = pq.poll();
            k++;
        }

        return p;
    }

	public static int find(int [] A, int k){
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0;i<A.length;i++){
			pq.offer(A[i]);
		}
		int n = -1;
		while(k>0){
			n = pq.poll();
			k--;
		}
		return n;
	}
}
