/**
 * Created by sahilkaw on 4/14/17.
 */
public class AllAdjacentCombinations {

    public void combinations(int [] input, int [] result, int k, int pos, int r){

        //base condition

        if(pos == input.length){
            for(int i =0; i<r; i++){
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = pos; i< input.length && i<pos+k ;i++){

            result[r] = formNumber(input,pos,i);
            combinations(input, result,k,i+1,r+1);

        }

    }



    public int formNumber(int[] input, int start, int end){
        int num = 0;
        for(int i=start; i<=end;i++){
            num = num*10 + input[i];
        }

        return num;

    }

    public void combinationsOfSizeK(int[]arr, int [] result, int k, int pos, int start){
        //base condition
        if(pos == k){
            for(int i = 0; i<k;i++){
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i=start;i<arr.length;i++){
            result[pos] = arr[i];
            combinationsOfSizeK(arr,result,k,pos+1,i+1);
        }
    }
    public static void main(String [] args){
        AllAdjacentCombinations xyz = new AllAdjacentCombinations();
        int [] input = {1,2,3,4,5};
        int [] result = new int[input.length];
        xyz.combinations(input,result,3,0,0);
        System.out.println();
        int k = 3;
        int [] rslt = new int[k];
        xyz.combinationsOfSizeK(input,rslt,k,0,0);
    }
}
