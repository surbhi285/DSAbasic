package Contest_Question.Level1;

import java.util.Scanner;

public class NewtonSchool {
    //Given a number N for each i (1 < = i < = N), you have to print the number except :-
    //For each multiple of 3, print "Newton" instead of the number.
    //For each multiple of 5, print "School" instead of the number.
    //For numbers that are multiples of both 3 and 5, print "NewtonSchool" instead of the number.
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
       // int n=sc.nextInt();
   /*     int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }*/
        //System.out.print(sum_xor(arr));
        //print_multiple(n);
        //System.out.print(fact(n));
        summer(5,10,3);
    }
    public static void print_multiple(int n)
    {
        for(int i=1;i<n;i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("NewtonSchool ");
            } else if (i % 3 == 0) {
                System.out.print("Newton ");
            } else if (i % 5 == 0) {
                System.out.print("School ");
            } else {
                System.out.print(i+" ");
            }
        }
    }
    /*
    We need a problem on xor again. Given an array A of N integers (1- indexed),
    you need to find the sum of (N- i) xor A[i] for all i from 1 to N.
Sample Input
5
1 2 3 4 5

Sample Output
17

Explanation
(5-1)xor1 = 5, (5-2)xor2 = 1, (5-3)xor3 = 1, (5-4)xor4 = 5, (5-5)xor5 = 5.

     */

    public static int sum_xor(int []arr)
    {
        int len=arr.length;
        int total_sum=0;

        for(int i=0;i<len;i++)
        {
            int xor_value=arr[i]^(len-(i+1));
            total_sum+=xor_value;
        }
        return total_sum;
    }
    /*Find factorial of a given number N.
Note:
The Factorial of a number is the product of an integer and all the integers below it;
e.g. factorial four ( 4! ) is equal to 24 (4*3*2*1).
     */

    public static int fact(int n)
    {
        if(n==0)
        {

            return 1;
        }

        return n=n*fact(n-1);
    }
    /*
    You are given an AI platform and asked to analyse the piece of code through it.
     As u studied about that platform you knew that it can analyse the code upto 1000 characters length.
     You are given the length of characters and asked to print YES or NO on the basis of whether the code can be analysed
     or not respectively.

     */
    public static void charlength(int n){
        if(n>1000)
        {
            System.out.print("NO");
        }else{
            System.out.print("Yes");
        }
    }

    /*
Summer is at its peak in Australia. Freddy is planning to purchase a water cooler to keep his room cool.
He has two options available:
Rent a cooler at the cost of X coins per month.
Purchase a cooler for Y coins.
Given that the summer season will last for M months in Australia,
Help Freddy in deciding wether he should rent the cooler or not.
Renting of cooler will be possible only when the total renting cost will be less than purchasing it.
Print "YES" if he rent's it otherwise print "NO".



     */
    public static void summer(int x,int y,int m)
    {
        int rent=x*m;
        int buy=y;
        if(y>rent)
        {
            System.out.print("yes");
        }else{
            System.out.print("No");
        }
    }


}
