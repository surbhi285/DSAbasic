package Contest_Question.Level0;
/*
Daemon has 2 dragon eggs, one is made of A grams of Gold and the other is made of B grams of Silver.

We know that Gold costs G coins per gram and Silver costs S coins per gram.
You need to determine which of the two dragon eggs are more valuable.
Print "Gold" (without quotes) if the Gold egg costs equal to or more than the silver egg.
Otherwise, print "Silver" (without quotes).

 */

import java.util.Scanner;

public class DraggonEggs {
   /* public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a_Gram_Of_Gold=sc.nextInt();
        int b_Gram_Of_Silver=sc.nextInt();
        int g_Gold_per_Gram=sc.nextInt();
        int s_Silver_per_Gram=sc.nextInt();
        if(a_Gram_Of_Gold*g_Gold_per_Gram>=b_Gram_Of_Silver*s_Silver_per_Gram)
        {
            System.out.print("Gold");
        }else{
            System.out.print("Silver");
        }

    }*/
    //Given an integer N and M check if N candies can be divided in M people
    // such that each person get equal number of candies.
   public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        if(n%m==0)
        {
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }
    }

}
