package leetcode.first;

import java.io.IOException;

public class ReOrderArray {
	public static void reOrderArray(int [] array) {
        int low = 0;
        int high = 0;
        int temp = 0;
        for(;low<array.length-1;low++){
            for(high = array.length-1;high>low;high--){
            	if(array[high]%2==1){
                    if(array[high-1]%2==0){
                        temp = array[high-1];
                    	array[high-1] = array[high];
                        array[high] = temp;
                    }
                }
        	}
        }
        System.out.println();
    }
	public static void main(String[] args) throws IOException{
		int[] items = {1,2,3,4,5,6,7};
		reOrderArray(items);
    }
}
