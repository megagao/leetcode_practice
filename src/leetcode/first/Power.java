package leetcode.first;


/**
 * 
 * created on 2017年3月30日 
 *
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * 1.全面考察指数的正负、底数是否为零等情况。
 * 2.写出指数的二进制表达，例如13表达为二进制1101。
 * 3.举例:10^1101 = 10^0001*10^0100*10^1000。 
 * 4.通过&1和>>1来逐位读取1101，为1时将该位代表的乘数累乘到最终结果。
 * 
 * @author  megagao
 * @version  0.0.1
 */
public class Power {
	public static double power(double base, int exponent) {
		double res = 1,curr = base;
        int n = 0;
        if(exponent>0){
            n = exponent;
        }else if(exponent<0){
            if(base==0)
                throw new RuntimeException("分母不能为0");
            n = -exponent;
        }else{// n==0        
            return 1;// 0的0次方    
        }
        while(n!=0){
            if((n&1)==1)
                res*=curr;
            curr*=curr;// 翻倍        
            n>>=1;// 右移一位    
        }
        return exponent>=0?res:(1/res);
	}
	public static void main(String[] args){
		double a1 = power(5.78, 3);
		double a2 = power(5.78, -3);
		double a3 = power(0, 3);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}
}
