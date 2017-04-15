/**
 * Created by sahilkaw on 4/14/17.
 */
//Deque is a double ended queue in which we can put values from front or from back.
//To check if the input statement is valid or not

//To find all the valid combinations of the bracket.
    import java.util.*;
public class Bracketology {
    //This one checks if the bracket are same;
    public boolean bracketMatch(char [] str, int opencount, int pos){
        if(pos == str.length){
            if(opencount == 0){
                return true;
            }
            return false;
        }

        if(str[pos] == '('){
            opencount++;
        }
        else{
            opencount--;
        }
        if(opencount<0){
            return false;
        }

        return bracketMatch(str,opencount,pos+1);
    }

    public boolean matchBracket(char[] brackets) {
        Deque<Character> stack = new LinkedList<>();

        for (Character ch : brackets) {
            char checkChar = getOpeningCharacter(ch);
            if (checkChar == 0) {
                stack.addFirst(ch);
            } else {
                if (stack.size() == 0 || stack.peek() != checkChar) {

                    return false;
                } else{
                    stack.pop();
                }
            }
        }

        if (stack.size() > 0) {

            return false;

        }
            return true;

    }

    public Character getOpeningCharacter(char ch){
        switch(ch){
            case ')' : return '(';
            case '}' : return '{';
            case ']' : return '[';
            default  : return 0;
        }

    }

    public void bracketPermutation(char [] result, int n, int pos, int openCount, int closeCount){
        if(pos == 2*n){
            for(int i = 0; i<result.length; i++){
                System.out.print(result[i]);
            }
            System.out.println();
        }

        if(openCount<n){
            result[pos] = '(';
            bracketPermutation(result,n,pos+1,openCount+1,closeCount);
        }

        if(closeCount<openCount){
            result[pos] = ')';
            bracketPermutation(result,n,pos+1,openCount,closeCount+1);
        }

    }

    public static void main(String [] args){
        Bracketology mt = new Bracketology();

        //To check if there are similar types of brackets would it result in correct output.
        //System.out.println(mt.bracketMatch("(()())()".toCharArray(),0,0));

        //To check if the input expression is correct or not.
        boolean abc = mt.matchBracket("[({()}{}[])]".toCharArray());

        //finding all the possibilites/combinations of the brackets
        int n = 4;
        char result[] = new char[n*2];
        mt.bracketPermutation(result,n,0,0,0);
        //System.out.println(abc);
    }


}
