package Array;
import java.util.HashSet;
import java.util.Scanner;
//Find the largest three distinct elements in an array
//Input: arr[] = {10, 4, 3, 50, 23, 90}
  //      Output: 90, 50, 23
public class Level_1 {
    public static void main(String[]args)
    {
        int []arr1={1,2,3,5,6,7,8,9,3};
        //System.out.println(find_missing(arr1));
        System.out.println(duplicate(arr1));
      /*  three_largest(arr1);
        int []arr={1, 2, 0, 4, 3, 0, 5, 0};
        push_Zero_To_End(arr);
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }System.out.println();
        max_min_val(arr);
        String str="AKSHAY";
        System.out.println(reverseString(str));
        */
    /*    Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int count=0;
        while(t-->0)
        {
            int []arr=new int[3];
            for(int i=0;i<3;i++)
            {
                arr[i]=sc.nextInt();
                if(arr[i]>=10)
                {
                    count++;
                }
            }
        }System.out.println(count);
    */}
    public static void three_largest(int []arr)
    {
       int i,first,second,third;
       if(arr.length<3)
       {
           System.out.print("Invalid output");
           return;
       }
       third=second=first=Integer.MIN_VALUE;
       for(i=0;i< arr.length;i++)
       {
           if(arr[i]>first)
           {
               third=second;
               second=first;
               first=arr[i];
           } else if (arr[i]>second) {
               third=second;
               second=arr[i];
           }else {
               third=arr[i];
           }
       }System.out.println(first+" "+second+" "+third);
    }
    public static int print2largest(int arr[], int n) {
        int first,second;
        first=second=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>first)
            {
                second=first;
                first=arr[i];
            }else if(arr[i]>second && arr[i]!=first)
            {
                second=arr[i];
            }
        }return second;
    }
    //Move all zeroes to end of array
    //Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
    //Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
    public static void push_Zero_To_End(int []arr)
    {
        int count=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[count]=arr[i];
                count++;
            }
        }
        while(count< arr.length)
        {
        arr[count]=0;
        count++;
        }
    }
    //Given an array A of size N of integers.
    // Your task is to find the minimum and maximum elements in the array.
    public static int[] max_min_val(int []arr)
    {
        int max,min;
        min=Integer.MAX_VALUE;
        max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            } else if (arr[i]<min) {
                min=arr[i];
            }
        }
        int []max_min={max,min};
        return max_min;
    }
    //Reverse the string
    public static String reverseString(String str)
    {
        String reverse="";
        for(int i=0;i<str.length();i++)
        {
            reverse=str.charAt(i)+reverse;
        }return reverse;
    }
    //Count number of occurrences (or frequency) in a sorted array
    // Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
    //  Output: 4 // x (or 2) occurs 4 times in arr[]
    public static int countfreq(int []arr,int x)
    {
        int count =0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==x)
            {
                count++;
            }
        }return count;
    }
    //How do you find the missing number in a given integer array of 1 to n?
    public static int find_missing(int []arr)
    {
        int n= arr.length+1;
        int sum=(n*(n+1))/2;
        int sum_arr=0;
        for(int i=0;i<arr.length;i++)
        {
            sum_arr+=arr[i];
        }
        int missing=sum-sum_arr;
        return missing;
    }
    public static int duplicate(int []arr)
    {
        HashSet <Integer> set=new HashSet<>();
        for(int i=0;i< arr.length;i++)
        {
            if(set.contains(arr[i]))
            {
                return arr[i];
            }else {
                set.add(arr[i]);
            }
        }return -1;
    }

}
