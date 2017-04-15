/**
 * Created by sahilkaw on 4/7/17.
 */

import java.util.*;
public class MergeKSortedList {
    List<Integer> merge = new ArrayList<>();
    List<Integer> helper = new ArrayList<>();
    List<Integer> result = new ArrayList<>();

    //Do a merging here and change this 2d array into 1d array
    public List<Integer> sortCode(List<List<Integer>> list){


      for(int i= 0; i< list.size();  i++){
          for(int j=0;j<list.get(i).size();j++){
              merge.add(list.get(i).get(j));
          }
      }




    return merge;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>();
        List<Integer> merge1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(7);
        list2.add(2);
        list2.add(4);
        list2.add(8);
        list1.add(1);
        list1.add(3);
        list2.add(9);
        list3.add(76);
        list3.add(34);
        list3.add(65);
        list4.add(39);
        list4.add(44);
        list4.add(85);

        list5.add(3);
        list5.add(9);
        list5.add(76);
        list5.add(34);
        list5.add(65);
        list5.add(39);
        list5.add(44);
        list5.add(85);

        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list5);

       System.out.println(list);

        MergeKSortedList mk = new MergeKSortedList();
        merge1 = mk.sortCode(list);
        System.out.print(merge1);



    }
}

