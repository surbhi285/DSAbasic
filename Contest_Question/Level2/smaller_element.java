package Contest_Question.Level2;

import java.util.Scanner;

/*
Given a sorted array of N integers a[], and Q queries.
For each query, you will be given a positive integer K and
your task is to print the number of elements in array a[] that are smaller than or equal to K
5
2 5 6 11 15
5
2
4
8
1
16

Sample Output:-
1
1
3
0
5
 */
public class smaller_element {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int query=sc.nextInt();
        while(query-->0)
        {
            int k=sc.nextInt();
            System.out.println(smaller(arr,k));
        }
    }

    public static int smaller(int []arr,int k)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=k)
            {
                count++;
            }
        }return count;
    }

}
