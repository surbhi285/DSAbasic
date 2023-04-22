package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=6;
        int []arr={1,2,4,7,9,0};

        bubble_Sort(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubble_Sort(int []arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
