package Leetcode;

public class Palindrome {
    public static void main(String[]args)
    {
     int num=-121;
     System.out.print(palindrome(num));
    }
    public static boolean palindrome(int x)
    {
        if(x<0)
        {
            return false;
        }
        int reverse=0;
        int y=x;
        while(y>0)
        {
            reverse=reverse*10+y%10;
            y/=10;
        }
        return reverse==x;
    }
}
