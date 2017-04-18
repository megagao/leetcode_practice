package leetcode.first;

import java.io.IOException;

public class QuickSort {

	public static void sort(int[] A, int low, int high) {
		if(low >= high){
			return;
		}
		int i = low;
		int j = high;
		int index = A[i];
		while(i<j){
			while(i<j&&A[j]>=index)
				j--;
			if(i<j)
				A[i++] = A[j];
			while(i<j && A[i]<index)
				i++;
			if(i<j)
				A[j--] = A[i];
		}
		A[i] = index;
		sort(A,low,i-1);
		sort(A,i+1,high);
	}
	
    public static void main(String[] args) throws IOException{
    	/*Scanner cin=new Scanner(System.in);
    	int L = cin.nextInt();
    	int R = cin.nextInt();*/
    	int[] A = {2676,4662,8383,357,6595};
    	sort(A, 0, 4);
    	System.out.println(A);
    }
}

