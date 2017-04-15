/**
 * Created by sahilkaw on 3/31/17.
 */
//System.out.println --> System is the class name present in java.lang class
// and out is a static variable of type printstream inside the system class
// and prinltn is the method name of the printstream class.
public class QuickSort {

    public int[] sort(int []arr){
        int []sortArr = quickSortArr(arr,0,arr.length-1);
                return sortArr;
    }

    public int[] quickSortArr(int [] arr, int low, int high){
        int i = low, j = high;
        int temp;
        //Taking a pivot element which we are going to arrange in sorted order
        int pivot = arr[(low+high)/2];

        //partitioning the array on the basis on pivot element
        while(i<=j){

            //This loop will break at any point where arr[i] is greater than the pivot element
            while(arr[i]<pivot)
                i++;
            //THis loop will break at any point where arr[j] is smaller than the pivot element
            while(arr[j]>pivot)
                j--;

            //Now at any point where the arr[i] is greater than the pivot element and the arr[j]
            // is smaller than the pivot element, we need to excahnge the arr[i] with arr[j]
            if(i<=j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            }


        }
        //recursively sort the array's lower half
        if(low<j){
            quickSortArr(arr,low,j);
        }
        if(high>i){
            quickSortArr(arr,i,high);
        }

        return arr;
    }

    //var args parameter are acceptable
    //we can put final keyword
    //synchronized and strictfp
    //Overoading of the main method is possible but JVM would always call the String main method.
    //For every class a class File Would be generated.
    //Inheritance of the main method take place.
    //If both Parent and child class has the static method then such a concept is called as the
    // method hiding not overriding in the main method.
    //From 1.7 version the main method is compulsary even if we have the static block.
     final static synchronized strictfp public void main(String... sahil) {
        int[] arr = {23, 43, 21, 12, 54, 22, 12, 33, 90, 54};
        QuickSort qs = new QuickSort();
         Class x = qs.getClass();
         System.out.println(x);
        int[] arrSort = qs.sort(arr);
        for (int i = 0; i < arrSort.length; i++) {
            if(i==0){
                System.out.print("{" + arrSort[i] + ",");
            }
            else if (i > 0 && i < arrSort.length - 1) {
                System.out.print( arrSort[i] + ",");
            } else {
                System.out.print(arrSort[i] + "}");
            }
        }


    }
}
