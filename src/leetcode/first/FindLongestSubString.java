package leetcode.first;

/**
 * 
 * created on 2017年4月18日 
 *
 * 找出字符串中最长的不重复子串
 * 
 * @author  megagao
 * @version  0.0.1
 */
public class FindLongestSubString {  
  
    public static void main(String[] args) {  
          
        String str = "jhhjnsfudufbdfyscfbsdjjSAFASFsefyrsjksaudhsduhasdbg" +  
                "ywqep[m,mzaASFASFhuwenzsdjsjfasfyaehwzsjx ;ASFASFlpwisjd" +  
                "asuwnad.pqwekASFqowe92347174nsd sdfsdf73bwASFawue821b9sa" +  
                "dasjdnasdqASFASASFF2en128adasjdnqwudSAASFF ASFw 1wq89ewa" +  
                "dasjdASFhqw8edeqwhedhqwueASFuquweuqwuehqw e123xrkASFajs8" +  
                "9da2qe54we24eDASASAFFdfsdifhsd";  
          
        System.out.println(findLongestSubString(str));  
    }  
      
      
    private static String findLongestSubString(String str) {  
        StringBuilder result = new StringBuilder();  
        char[] strCharArr = str.toCharArray();  
        int[] charsIndex = new int[256];  
        for(int i = 0; i < 256; i++){
        	charsIndex[i] = -1;  
        }
        int startIndex = -1;
        int resultIndex = -1;
        int count = 0;  
        for(int i = 0; i < strCharArr.length; i++) {  
            if(charsIndex[strCharArr[i]] > startIndex)  
                startIndex = charsIndex[strCharArr[i]];  
            if(i - startIndex > count) {  
            	count = i - startIndex;  
                resultIndex = startIndex;  
            }  
            charsIndex[strCharArr[i]] = i;  
        }  
        for(int j =  resultIndex + 1; j < resultIndex + count + 1; j++) {  
        	result.append(strCharArr[j]);  
        }  
        return result.toString();  
    }  
}  