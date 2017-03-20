package leetcode.first;

import java.io.IOException;
import java.util.Scanner;

/* 网易编程笔试题
 * 如果一个数字序列逆置之后跟原序列是一样的就称这样的数字序列为回文序列。例如：
	{1, 2, 1}, {15, 78, 78, 15} , {112} 是回文序列, 
	{1, 2, 2}, {15, 78, 87, 51} ,{112, 2, 11} 不是回文序列。
	现在给出一个数字序列，允许使用一种转换操作：
	选择任意两个相邻的数，然后从序列移除这两个数，并用这两个数字的和插入到这两个数之前的位置(只插入一个和)。
	现在对于所给序列要求出最少需要多少次操作可以将其变成回文序列。
*/
public class PalindromicSequence{

	public static void resolution(int n, int[] items) {
		int i=0;
		int count=0;
		int j = n-1;
		for(;i<j;){
			if(items[i] == items[j]){
				i++;
				j--;
			}else if(items[i] < items[j]){
				items[++i] += items[i-1];
				count += 1;
			}else if(items[i] > items[j]){
				items[--j] += items[j+1];
				count += 1;
			}
		}
		System.out.println(count);
	}
	
    public static void main(String[] args) throws IOException{
    	Scanner cin=new Scanner(System.in);
    	int n = cin.nextInt();
		int[] items = new int[n];
		for(int i=0;i<n;i++){
			items[i]=cin.nextInt();
		}
		resolution(n,items);
		cin.close();
    }
}