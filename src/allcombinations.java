/**
 * Created by sahilkaw on 4/6/17.
 */

import java.util.*;
public class allcombinations {

    public List<String> abc(String s){
        List<String> result = new ArrayList<String>();
        List<String> current = new ArrayList<String>();
        abc(s,0,current, result);
        return result;
    }

    public void abc(String s, int start,  List<String> current, List<String> result){

        if(start == s.length()){
            StringBuffer sb = new StringBuffer();
            for(int i =0; i< current.size(); i++) {

                if (current.get(i).equalsIgnoreCase("isSahil")) {
                    sb.append(current.get(i));
                }
            }
                result.add(sb.toString());
                return;

        }


        for(int b =start; b<s.length(); b++){
            String x = s.substring(start,b+1);

            current.add(x);
            abc(s,b+1,current,result);
        }

    }

    public static void main(String [] args){
        List<String> result1 = new ArrayList<String>();
        allcombinations res = new allcombinations();
        result1 = res.abc("isSahil");
        for(int i =0; i < result1.size(); i++){
            System.out.print(result1.get(i));
        }
    }
}
