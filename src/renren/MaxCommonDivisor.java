package renren;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * created on 2017年4月9日 
 *
 * 求多个数最大公约数
 *
 * @author  megagao
 * @version  0.0.1
 */
public class MaxCommonDivisor {
    public static void main(String[] args) throws IOException{
    	Scanner cin=new Scanner(System.in);
    	int n = cin.nextInt();
    	if(n>0){
    		int[] cho = new int[n];
        	for(int i=0; i<n; i++){
        		cho[i]=cin.nextInt();
        	}
        	int maxCD = cho[0];
        	for (int i=1; i<n; ++i){
        		maxCD = maxCommonDivisor(maxCD, cho[i]);
        	}
        	System.out.println(maxCD);
    	}
    	cin.close();
    }
    
    //求两个数最大公约数
    static int maxCommonDivisor(int a, int b) {
     int temp;
     if (a < b) {
    	 temp = a;
    	 a = b;
    	 b = temp;
     }
     if (b == 0)
    	 return a;
     return maxCommonDivisor(b, a % b);
    }
}
