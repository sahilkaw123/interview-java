/**
 * Created by sahilkaw on 3/30/17.
 */
public class LongestSubStringPalindrome {

    public String longestPal(String s){
        if(s.isEmpty()){
            return null;
        }
        if(s.length() ==1){
            return s;
        }

        String longest = s.substring(0,1);
        for(int i =0; i< s.length();i++){
            //getting the longest palindrom with center i cases such as ABA with odd length
            String temp = helper(s,i,i);
            if(temp.length()>longest.length()){
                longest = temp;
            }
            // get longest palindrome with center of i, i+1 cases such as TRRT with even length
             temp = helper(s, i, i + 1);
            if (temp.length() > longest.length()) {
                longest = temp;
            }
        }

        return longest;


    }

    public String helper(String s, int begin, int end){
        while(begin >= 0 && end <= s.length()-1 && s.charAt(begin)==s.charAt(end)){
            begin--;
            end++;
        }
        return s.substring(begin+1,end);
    }

    public static void main(String[]args){
        LongestSubStringPalindrome l = new LongestSubStringPalindrome();
        String lngPal = l.longestPal("ABACBBC");
        System.out.println(lngPal);
    }
}
