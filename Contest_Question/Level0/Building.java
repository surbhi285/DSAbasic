package Contest_Question.Level0;

import java.util.Scanner;

//There are N buildings in a row with different heights H[i] (1 <= i <= N).
//
//You are standing on the left side of the first building .
// From this position you can see the roof of a building i if no building to the left of the
// ith building has a height greater than or equal to the height of the ith building.
//
//You are asked to find the number of buildings whose roofs you can see.
public class Building {

   /* public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=0;
        int count=0;
        for(int i=0;i<n;i++) {
            if (max < arr[i]) {
                max = arr[i];
                count++;
            }
        }
        System.out.print(count);
    }*/
    //Given an array A (0 indexed) of n integers from 0 to n-1 (each integer exactly once),
    // output an array such that A[i] becomes A[A[i]].
    //Make sure you don't use extra memory than the array itself.
    public static void main(String[]args)
    {
        int []array= {1,3,4,6,7};
        int n=array.length;
        //array(array,n);
        System.out.println(happy_balloon(array,n));
    }
    public static void array(int []array,int n)
    {
        int []ans=new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=array[array[i]];//4 2 3 0 1
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
    /*
    There are N balloons numbered from 1 to N.
    Every balloon has an another integer value Arr[i] assigned to it
    i varies from 1 to N, and i represents the number of balloon.

    A balloon at an odd position (i = 1, 3, 5. ) is happy if Arr[i] is odd.
    A balloon at an even position (i = 2, 4, 6. ) is happy if Arr[i] is even.

    Find the number of happy balloons.*/
    public static int happy_balloon(int []arr,int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if((i+1)%2==0 && arr[i]%2==0 || (i+1)%2!=0 && arr[i]%2!=0)
            {
                count++;
            }
        }return count;
    }

}
