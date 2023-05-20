package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(fizzBuzz(n));
    }
    public static List<String> fizzBuzz(int n) {
        List<String>answer=new ArrayList<>();//using arraylist
        for(int i=1;i<=n;i++)
        {
            boolean divby3=i%3==0;
            boolean divby5=i%5==0;
            if(divby5 && divby3)
            {
                answer.add("FizzBuzz");
            } else if (divby5) {
                answer.add("Buzz");
            } else if (divby3) {
                answer.add("Fizz");
            }else {
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }
}
