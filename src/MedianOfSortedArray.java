/**
 * Created by sahilkaw on 3/29/17.
 */

//Works for both even and odd length array but of equal size
public class MedianOfSortedArray {
    int N;
    int M;

    public int getMedian(int [] arr1,int l1,int h1, int [] arr2, int l2, int h2){
       // System.out.println(l1 +" "+ "length1 " + " " + h1);
      //  System.out.println(l2 +" "+ "length2 " + " " + h2);
        if(h1-l1<0)
            return -1;
        if(h1-l1==0)
            return (arr1[0] + arr2[0])/2;
        if((h1-l1==1)||(h2-l2==1)) {
           // System.out.println("l1" + " "+l1+" "+ "arr1[l1]" + " " + arr1[l1]+" " +"l2" +" " +l2+ " "+ "arr2[l2]" +" " + arr2[l2] +" "+ "h1" + " "+ h1+ " "+ "arr1[h1]"+ " " + arr1[h1] + " " +"h2"+" " + h2+" "+ "arr2[h2]" +" " + arr2[h2]);
            return (Math.max(arr1[l1], arr2[l2]) + Math.min(arr1[h1], arr2[h2])) / 2;

        }


        int m1 = (h1+l1)/2;
        //System.out.println("x1"+" "+h1 + "+" + l1+" " + " " + x1);


        int m2 = (h2+l2)/2;
        //System.out.println("x2" +" "+h2 + "+" + l2+" " + " " + x2);



        if(arr1[m1]==arr2[m2])
            return m1;
        else if(arr1[m1]>arr2[m2]) {
                return getMedian(arr1, l1, m1, arr2, m2, h2);

        }
         else {
               // System.out.println("m2>m1");
            return getMedian(arr1, m1, h1, arr2, l2, m2);
        }
        }







    public static void main(String [] args){
        int [] arr1 = {}; //{1, 12, 15, 26, 38};
        int [] arr2 = {}; // {2, 13, 17, 30, 45};
        if(arr1.length ==0 && arr2.length ==0){
            System.out.println("Both are Empty array");
            return;
        }
        MedianOfSortedArray med = new MedianOfSortedArray();

        if(arr1.length == arr2.length){
            int out = med.getMedian(arr1,0,arr1.length-1,arr2,0,arr2.length-1);
            System.out.println(out);
        }
    }
}
