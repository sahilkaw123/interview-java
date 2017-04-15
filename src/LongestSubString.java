import java.util.HashMap;

//finds the length of the longest substring and even prints the substring without repeating characters

public class LongestSubString{

    public int mthd(String str){

        if(str.length() == 0){
            return 0;
        }
        int max = 0; int len = 0; int min =0; int x =0; int y=0;
        //key is the alphabet and the integer is the index
        HashMap<Character, Integer> map = new HashMap<>();
        //index is the position of the string
        int index = 0; int j = 0;
        for( int i = 0; i< str.length(); i++ ){

            char currPos = str.charAt(i);

            //if map already has the character then find the position of its previous existance and then start the
            //index from the next value of its existance. thats why we have currPos+1
            if(map.containsKey(currPos)){

                index=Math.max(index, map.get(currPos)+1);

            }
            map.put(currPos, i);
            //
            len = i-index+1;

            //keeping track of the value of i and index at the point where the maximum length is found
            if(len>min){
                min = len;
                x =i;
                y = index;
            }


            max = Math.max(max, i -index+1);






        }

        //for printing the longest substring
        for(int i = y; i<=x; i++){
            System.out.print(str.charAt(i));
        }


       // for(int c = (index-max)+1; c < index)
        return max;


    }

    public static void main(String[] args){
        LongestSubString lng = new LongestSubString();
        int x = lng.mthd("Sahilearatyaxcvbaex");

        //To print the length of the substring uncomment it
        //System.out.println(x);
    }

}