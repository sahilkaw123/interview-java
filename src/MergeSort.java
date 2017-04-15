import java.util.ArrayList;

/**
 * Created by sahilkaw on 4/7/17.
 */
public class MergeSort {
    private ArrayList<Integer> strList;

    public void sort(){
        strList =  mergeSort(strList);
    }

    public ArrayList<Integer> mergeSort(ArrayList<Integer> whole){
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        int center;

        if(whole.size()==1){
            return whole;
        }
        else{
            center = whole.size()/2;
            for(int i=0; i<center;i++){
                left.add(whole.get(i));
            }

            for(int j=center; j<whole.size();j++){
                right.add(whole.get(j));
            }

            left = mergeSort(left);
            right = mergeSort(right);
            merge(left, right, whole);
        }

    return whole;
    }

    public void merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> whole){
        int leftindex = 0;
        int rightindex = 0;
        int wholeindex =0;

        while(leftindex < left.size() && rightindex < right.size()){
            if(left.get(leftindex) < right.get(rightindex)){
                whole.set(wholeindex, left.get(leftindex));
            }
        }

    }
}