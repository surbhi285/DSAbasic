package Contest_Question.Level0;
/*
You are asked Q questions. For each question,
you have to determine whether the given number X
can be represented as a sum of two or more consecutive positive integers.
 */

import java.util.Scanner;

public class IsConsecutive {/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int x = sc.nextInt();
            System.out.println(check(x));
        }
    }*/

    public static boolean check(int x) {
        if ((x & (x - 1)) != 0 && x != 0) {
            return true;
        }
        return false;
    }

/*In an exam of JEE one aspirant got P correct answers, Q wrong answer, and R unattempted question.
If the mark for the correct answer is 4, for the wrong answer is -2, and for the unattempted questions is -1.
 Find the final marks the aspirant got.
 */
    public static int marks(int P,int Q,int R)
    {
        int final_marks=P*4-Q*2-R*1;
        return final_marks;
    }
    //Given an integer N and an integer K, Your task is to multiply the first leftmost digit of the number
    // to the number itself. You have to repeat this process K times.
    //For eg:- if N=3 and K=5 then:
    //3 * 3 = 9
    //9 * 9 = 81
    //81 * 8 = 648
    //648 * 6 = 3888
    //3888 * 3 = 11664

    /*public static long operation(long n,long k){
        long p=n;
        while(k-->0)
        {
            p=n;
            while(p>=10)
            {
                p=p/10;
            }
            n=n*p;
        }return n;

    }*/

    //Given an array A of N integers,
    // find whether there exists three consecutive same integers in the array.
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(consecutive_same(arr,n));
    }
    public static int consecutive_same(int []arr,int n)
    {
        for(int i=1;i<n;i++)
        {
            if(arr[i-1]==arr[i])
            {
                if(arr[i]==arr[i+1])
                {
                    return 1;
                }
            }
        }return 0;
    }
}