/**
 * Created by sahilkaw on 4/6/17.
 */
import java.util.*;
public class MergeTwoSortedList {
    int len;
    boolean flag1, flag2;
    public List<Integer> solution(List<Integer> List1, List<Integer>List2){
        List<Integer> result = new ArrayList<>();
        int i =0; int j =0;
        len = List1.size() + List2.size();

        while(i < len && i < List1.size() && j< List2.size()){
            if(List1.get(i) < List2.get(j)){
                result.add(List1.get(i));
                i++;
            }
            else{
                result.add(List2.get(j));
                j++;
            }



        }

        if(i<List1.size()){
            for(int a = i; a<List1.size(); a++){
                result.add(List1.get(a));
            }
        }

        if(j<List2.size()){
            for(int a = j; a<List2.size(); a++){
                result.add(List2.get(a));
            }
        }


        return result;
    }




    public static void main(String [] args){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        list1.add(1);
        list1.add(4);
        list1.add(7);
        list1.add(11);
        list1.add(12);
        list1.add(12);
        list1.add(12);
        list1.add(12);

        list2.add(2);
        list2.add(5);
        list2.add(6);
        list2.add(8);
        list2.add(11);
        list2.add(15);
        //System.out.println(list1.size() + " "+ list2.size());
        MergeTwoSortedList abc = new MergeTwoSortedList();
        list3= abc.solution(list1, list2);
        System.out.println(list3);

    }
}
