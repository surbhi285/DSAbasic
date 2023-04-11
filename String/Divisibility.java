package String;
//You are given a big number in form of a string A of characters from 0 to 9.
//
//Check whether the given number is divisible by 30
public class Divisibility {
    public static void main(String[] args) {
        String str="10000";
        System.out.print(check_no_D10(str));
    }

    public static String check_no_D10(String str) {
        boolean string_is_D30=false;
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            sum+=str.charAt(i);
        }
        if(sum%3==0)
        {
            string_is_D30=true;
        }
        boolean string_is_D10=false;
        if(str.charAt(str.length()-1)=='0')
        {
            string_is_D10=true;
        }
        if(string_is_D10 && string_is_D30)
        {
            return "yes";
        }else {
            return "no";
        }
    }
}
