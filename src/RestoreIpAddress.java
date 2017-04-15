/**
 * Created by sahilkaw on 4/6/17.
 */
import java.util.*;
/**
 * Date 04/04/2016
 *
 * @author Tushar Roy
 * <p>
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.
 * <p>
 * Reference
 * https://leetcode.com/problems/restore-ip-addresses/
 */

/*public class RestoreIpAddress {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        List<String> current = new ArrayList<>();
        restoreIpAddressesUtil(s, 0, 0, result, current);
        return result;
    }

    private void restoreIpAddressesUtil(String s, int start, int count, List<String> result, List<String> current) {
        if (start == s.length() && count == 4) {
            StringBuffer stringBuffer = new StringBuffer(current.get(0));
            for (int i = 1; i < current.size(); i++) {
                stringBuffer.append(".").append(current.get(i));
            }
            result.add(stringBuffer.toString());
            return;
        } else if (start == s.length() || count == 4) {
            return;
        }
        for (int i = start; i < s.length() && i < start + 3; i++) {
            //if (i != start && s.charAt(start) == '0') {
              //  break;
            //}
            String ip = s.substring(start, i + 1);
            if (Integer.valueOf(ip) > 255) {
                continue;
            }
            current.add(ip);
            restoreIpAddressesUtil(s, i + 1, count + 1, result, current);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        RestoreIpAddress res = new RestoreIpAddress();

        List<String> finalResult = new ArrayList<>();
        finalResult = res.restoreIpAddresses("25525512154");
        for (int i = 0; i < finalResult.size(); i++) {
            System.out.print(finalResult.get(i) + "; ");
        }
    }
} */


public class RestoreIpAddress {



    public List<String> validIp (String s) {

        List<String> result = new ArrayList<>();
        List<String> current = new ArrayList<>();

        validIp(s,0,0,result, current);

        return result;
    }

    public void validIp(String s, int start, int count, List<String>result,List<String> current) {

        if (start == s.length() && count == 4) {
            StringBuffer sb = new StringBuffer(current.get(0));
            for (int i = 1; i < current.size(); i++) {
                sb.append(".").append(current.get(i));
            }
            result.add(sb.toString());
            return;
        }
        //This will take care of the if the Ip address is not valid
        else if (start == s.length() || count == 4) {
            System.out.println("Xx");
            return;

        }


        for(int i = start; i < s.length() && i < start + 3; i++) {
        //if (i != start && s.charAt(start) == '0') {
          //  System.out.println("XX");
            //    break;
           // }

            String ip = s.substring(start, i + 1);
            System.out.println("Step" + i + " " + start + " "+ "ip " + ip);

            if (Integer.valueOf(ip) > 255) {
                //System.out.println(ip);
                continue;
            }
            current.add(ip);

            validIp(s, i + 1, count + 1, result, current);
            //if there is not a valid ip address then it would be executed;
            current.remove(current.size() - 1);
        }

    }



    public static void main(String[] args){
        RestoreIpAddress res = new RestoreIpAddress();

        List<String> finalResult = new ArrayList<>();
        finalResult = res.validIp("25521412155");
        for(int i =0; i<finalResult.size();i++){
            System.out.print(finalResult.get(i) + "; ");
    }




}

    }

