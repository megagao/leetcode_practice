package renren;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * created on 2017年4月9日 
 *
 * 一组数，有多少种平分方法，让分开的两部分和相同
 * 输入：
 * 3
 * 1 1 1 
 * 9
 * 1 5 -6 7 9 -16 0 -2 2
 * 2
 * 0 0
 * 
 * 输出：
 * 0
 * 3
 * 1
 *
 * @author  megagao
 * @version  0.0.1
 */
public class DevideCount {
    public static void main(String[] args) throws IOException{
    	Scanner cin=new Scanner(System.in);
    	while(cin.hasNext()){
    		int n = cin.nextInt();
        	if(n>0){
        		int[] nums = new int[n];
            	for(int i=0; i<n; i++){
            		nums[i]=cin.nextInt();
            	}
            	printDevideCount(n, nums);
        	}
    	}
    	cin.close();
    }
    
    //相当于求前n-1个数有多少次和加起来等于数组和的一半
    static void printDevideCount(int n, int[] nums) {
    	int sum = 0;
    	for (int i=0; i<n; ++i){
    		sum += nums[i];
    	}
    	int devideSum = 0;
    	if(sum%2 == 0){
    		devideSum = sum/2;
    	}else{
    		System.out.println(0); //和为奇数，输出0
    		return;
    	}
    	int devideCount = 0;
    	int tempSum = 0;
    	for(int i=0; i<n-1; i++){
    		tempSum += nums[i];
    		if(tempSum == devideSum){
    			devideCount++;
    		}
    	}
    	System.out.println(devideCount);
    }
}
