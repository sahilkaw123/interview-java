/**
 * Created by sahilkaw on 4/15/17.
 */

//To generate all the possible combinations of the string
    import java.util.*;
public class Combinations {

    public void combination(char [] input){
        Map<Character,Integer> map = new TreeMap<>();
        for(Character ch : input ) {
            //Lambda functions
            map.compute(ch, (key, val) -> {
                if (val == null) {
                    return 1;
                } else {
                    return val + 1;
                }

            });
        }

        char [] str = new char[map.size()];
        int [] count = new int[map.size()];

        int index =0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            str[index] = entry.getKey();
            count[index] = entry.getValue();
            index++;
        }

        char[] result = new char[input.length];
        //System.out.println("str" +str.length + " count " + count.length );
        combinations(str,count,0,result,0);



    }

    public void combinations(char [] str, int [] count, int pos, char[] result, int level){
        print(result,level);
        for(int i = pos; i< str.length; i++){
            if(count[i] == 0){
                continue;
            }
            //System.out.println("i" + " = " + i + " POS" + " = " + pos + " level = " + level);
            result[level] = str[i];
            count[i]--;
            combinations(str,count,i,result,level+1);
            count[i]++;
        }
    }

    public void print(char[]result, int level){
        for(int i =0; i<level; i++){
            System.out.print(result[i]);
        }
        System.out.println();
    }

    public static void main(String [] args){
        Combinations c = new Combinations();
        c.combination("aabc".toCharArray());
    }



}
