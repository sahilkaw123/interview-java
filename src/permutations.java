/**
 * Created by sahilkaw on 4/15/17.
 */
import java.util.*;
public class permutations {

    public List<String> permutation(char [] input) {
        Map<Character, Integer> countMap = new TreeMap<>();

        for(char ch : input){
            countMap.compute(ch,(key,val) -> {
                if (val == null){
                    return 1;
                }
                else{
                    return val+1;
                }
            });

        }

        char [] str = new char[countMap.size()];
        int [] count = new int[countMap.size()];
        int index = 0;
        for(Map.Entry<Character, Integer> entry : countMap.entrySet()){
            str[index] = entry.getKey();
            count[index] = entry.getValue();
            index++;

        }
        List<String> resultSet = new ArrayList<>();
        char [] result = new char[input.length];
        permuteUtil(str, count, result, 0, resultSet);



        return resultSet;

    }

    public void permuteUtil(char []str, int [] count, char [] result, int level, List<String> resultSet){

        if(level == result.length){
            resultSet.add(new String(result));
            return;
        }

        for(int i =0; i<str.length; i++){
            if(count[i] ==0){
                continue;
            }

            result[level] = str[i];
            count[i]--;
            permuteUtil(str,count,result,level+1,resultSet);
            count[i]++;
        }

    }

    public static void main(String [] args){
        permutations pp = new permutations();
        pp.permutation("abc".toCharArray()).forEach(s -> System.out.println(s));
    }



}
