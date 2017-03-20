package leetcode.first;

import java.util.Scanner;

/* 网易编程笔试题
 * 小易有一个圆心在坐标原点的圆，小易知道圆的半径的平方。小易认为在圆上的点而且横纵坐标都是整数的点是优雅的，小易现在想寻找一个算法计算出优雅的点的个数，请你来帮帮他。
	例如：半径的平方如果为25
	优雅的点就有：(+/-3, +/-4), (+/-4, +/-3), (0, +/-5) (+/-5, 0)，一共12个点。
*/
public class IntegerPoint{

	public static void main(String[] args){
        @SuppressWarnings("resource")
		Scanner cin = new Scanner(System.in);
        int rSquare = cin.nextInt();
        int count =0;
        double r = Math.sqrt(rSquare);
 
        //存储值
        for(int i=0;i<r;i++){
            /*运行超时
            for(int j=1;j<r+1;j++){
                if(i*i+j*j==rSquare){
                    count++;
                }
            }
            */
        	//优化点1
            double j = Math.sqrt(rSquare-i*i);
            if((int) j==j){
                count++;
            }
        }
        //优化点2
        System.out.print(count<<2);
    }
}