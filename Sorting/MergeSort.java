package Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0, arr.length-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(int []arr,int left,int right)
    {
        if(left>=right)
        {
            return;
        }
        int mid=left+(right-left)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        mergeSortArray(arr,left,mid,right);
    }
    public static void mergeSortArray(int []arr,int left,int mid,int right)
    {
        int p1=left;
        int p2=mid+1;
        int[]ansarr=new int[right-left+1];
        int iter=0;
        while(p1<=mid&&p2<=right)
        {
            if(arr[p1]<arr[p2])
            {
                ansarr[iter]=arr[p1];
                iter++;
                p1++;
            }else {
                ansarr[iter]=arr[p2];
                iter++;
                p2++;
            }
        }
        while (p1<=mid)
        {
            ansarr[iter]=arr[p1];
            p1++;
            iter++;
        }while (p2<=right)
    {
        ansarr[iter]=arr[p2];
        iter++;
        p2++;
    }
        for(int i=left;i<=right;i++)
        {
            arr[i]=ansarr[i-left];
        }
    }
}
