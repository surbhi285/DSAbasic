package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selection_sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void selection_sort(int []arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            int lower=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[lower])
                {
                    lower=j;
                }
            }int temp=arr[lower];
            arr[lower]=arr[i];
            arr[i]=temp;
        }
    }
}
