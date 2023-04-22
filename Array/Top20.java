package Array;

import java.util.*;

public class Top20 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,6,7,9,5};
        int n= arr.length;
        int len=9;
        System.out.println(missing_number(arr,n));
        int []arr1={2,3,5,7,9,14,15,23,7};
        System.out.println(duplicate_number(arr1));
        int []arr2={12,23,45,11,56,76,8,3};
        lar_small(arr2);
        int []arr3={1,2,3,4,5,6,7,8,9};
        int x=10;
        pairs(arr3,x);
        System.out.println(pair_count(arr3,x));
        int []arr4={2,4,7,9,4,9,10,10,2,9,8};
        System.out.println(duplicates(arr4));
       // print_duplicates(arr4);
       // remove_duplicates(arr4);
        for(int i=0;i<arr4.length-1;i++)
        {
           // System.out.print(arr[i]+" ");
        }
        int []arr5={1,0,0,1,1,0,1,0,1,0,0,0,0,1,1};
        zero_one(arr5);
        for(int i=0;i<arr5.length;i++)
        {
            System.out.print(arr5[i]+" ");
        }
        ///////
        int arrr1[] = {1, 3, 5, 7};
        int nn1 = arrr1.length;

        int arrr2[] = {2, 4, 6, 8};
        int nn2 = arrr2.length;

        int arrr3[] = new int[nn1 + nn2];
        mergetwoArrays(arrr1,arrr2,nn1,nn2,arrr3);

        System.out.println("Array after merging");
        for (int i=0; i < nn1+nn2; i++)
            System.out.print(arr3[i] + " ");
    }
    //How do you find the missing number in a given integer array of 1 to 100? (solution)
    public static int missing_number(int []arr,int n)
    {
        int len=n+1;
        int sum=(len*(len+1))/2;
        int new_sum=0;
        for(int i=0;i<n;i++)
        {
            new_sum+=arr[i];
        }
        return sum-new_sum;
    }
    //How do you find the duplicate number on a given integer array? (solution)
    public static int duplicate_number(int[]arr)
    {
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hs.contains(arr[i]))
            {
                return arr[i];
            }else{
                hs.add(arr[i]);
            }
        }return -1;
    }
    //How do you find the largest and smallest number in an unsorted integer array? (solution)
    public static void lar_small(int []arr)
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }else if (arr[i]>max)
            {
                max=arr[i];
            }
        }System.out.println("MIN VALUE: "+min+" MAX VALUE: "+max);
    }
    //How do you find all pairs of an integer array whose sum is equal to a given number? (solution)
    public static void pairs(int []arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
    //Tc=O(n^2)
    //method 2
    public static int pair_count(int []arr,int target)
    {
        int count=0;
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            int item=arr[i];
            int other_num=target-item;
            if(hs.contains(other_num))
            {
                count++;
            }hs.add(item);
        }return count;
    }
    //How do you find duplicate numbers in an array if it contains multiple duplicates? (solution)
    public static ArrayList duplicates(int []arr)
    {
        ArrayList<Integer>list=new ArrayList<>();
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            int item=arr[i];
            if(hs.contains(item))
            {
                list.add(item);
            }hs.add(item);
        }
        return list;
    }
    public static void print_duplicates(int []arr)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i< arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                count=map.get(arr[i]);
                map.put(arr[i],count+1);
            }else {
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer>entry : map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.print(entry.getValue()+" ");
            }
        }
    }
    //How to remove duplicates from a given array in Java? (solution)
    public static int remove_duplicates(int []arr)
    {
        int j=0;
        int n=arr.length-1;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j]=arr[i];
                j++;
            }
        }arr[j++]=arr[n-1];
        return j;
    }
    //How do you search a target value in a rotated array? (solution)
    //Given an unsorted array of integers, find the length of the longest consecutive elements sequence? (solution)
    //How is an integer array sorted in place using the quicksort algorithm? (solution)
    //How do you remove duplicates from an array in place? (solution)
    //How do you reverse an array in place in Java? (solution)
    //How are duplicates removed from an array without using any library? (solution)
    //How to convert a byte array to String? (solution)
    //What is the difference between an array and a linked list? (answer)
    //How do you perform a binary search in a given array? (solution)
    //How to find a median of two sorts arrays? (solution)
    //How to rotate an array left and right by a given number K? (solution)
    //How do you find duplicates from an unsorted array? (solution)
    //Given an array of integers sorted in ascending order, find the starting and ending position of a given value? (solution)
    //Given an integer array, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum? (solution)
    //You are given an array of 0s and 1s in random order and you have to sort this array i.e Segregate 0s on the left side and 1s on the right side of the array.
    public static void zero_one(int []arr)
    {
        int n= arr.length;
        int left=0;
        int right=n-1;
        while(left<right)
        {
            while(arr[left]==0 && left<right)
            {
                left++;
            }
            while(arr[right]==1&&left<right)
            {
                right--;
            }
            if(left<right)
            {
                arr[left]=0;
                arr[right]=1;
                left++;
                right--;
            }
        }
    }
    // Java program to merge two sorted arrays/
        public static void mergetwoArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3){
            int i = 0;
            int j = 0;
            int k = 0;

            // traverse the arr1 and insert its element in arr3
            while(i < n1){
                arr3[k++] = arr1[i++];
            }

            // now traverse arr2 and insert in arr3
            while(j < n2){
                arr3[k++] = arr2[j++];
            }

            // sort the whole array arr3
            Arrays.sort(arr3);
        }
    }

// This code is contributed by Tapesh(tapeshdua420)

