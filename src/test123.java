/**
 * Created by sahilkaw on 4/7/17.
 */
public class test123 {

    public static void main(String [] args){
        test123 tr = new test123();
         tr.countVowelGroups("iiituubo");
        //System.out.println(ltr);
    }

    public void countVowelGroups(String text)

    {

        int i = 0;

        String test = "";

        String longest = "";
        int count = 1;
        while ( i < text.length())

        {



            String letter = text.substring(i , i+1);


            // This would check the condition till penultimate character of the string
            if ( "aeiouy".contains(letter.toLowerCase()) && i != text.length()-1)

            {

                test = test + letter;
            }




           else

            {
                //This is for the last charater of the String.
                if(i==text.length() - 1) {
                    //If the last character is vowel. Then append it to the last of the String and check for the longest condition
                    if (text.charAt(i) == 'a') {
                        test = test + text.charAt(i);
                        if (longest.length() < test.length())

                        {

                            longest = test;
                        }
                    }
                    else{
                        //If the last character is not vowel. Then just the initial test string
                        if (longest.length() < test.length())

                        {

                            longest = test;
                        }
                    }
                }

                //Checking the normal conditions till the value if i is not the last one and there are more characters in the
                // string.
                else {


                    if (longest.length() < test.length())

                    {

                        longest = test;
                        test = " ";

                    }


                }


            } i++;




        }

        System.out.println(longest);


    }
}

