package leetcode.first;

import java.io.IOException;

/**
 * 
 * created on 2017年3月31日 
 *
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 
 * 两个思路:
 * 1、类似冒泡算法，前偶后奇数就交换;
 * 2、新建一个数组（略）
 *
 * @author  megagao
 * @version  0.0.1
 */
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
