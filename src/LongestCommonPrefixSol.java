/**
 * Created by sahilkaw on 3/30/17.
 */
public class LongestCommonPrefixSol {



    public String longestCommonPrefix(String [] strs){
        if(strs ==null|| strs.length ==0){
            return " ";
        }
        if(strs.length == 1){
            return strs[0];
        }

        int minLength = Integer.MAX_VALUE;

        for(String str: strs){
            if(str.length()<minLength){
                minLength = str.length();
            }
        }

        //System.out.println(minLength);
        //If the longest substring is shorter than the minLength of the strings then
        for(int i=0; i<minLength; i++){
            for(int j=0; j<strs.length-1; j++) {
                String s1 = strs[j];
                String s2 = strs[j+1];
                if(s1.charAt(i) != s2.charAt(i)){
                    return s1.substring(0,i);

                }


            }

        }
        //When the shortest string is the longest prefix
        return strs[0].substring(0, minLength);
    }

    public static void main(String[] args){
        String arr[] = {"geeksforgeeks", "geeks", "geek", "geeker"};
        LongestCommonPrefixSol ltr = new LongestCommonPrefixSol();
        String xx = ltr.longestCommonPrefix(arr);
        System.out.println(xx);
    }
}
