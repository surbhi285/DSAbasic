package Leetcode;

import java.util.HashMap;

public class Two_Sum {
    public static void main(String[]args)
    {
        int []arr=new int[]{2,7,11,15};

        int x=9;
        int y=-121;
     //   System.out.print(isPalindrome(y));

        int []nums={0,1,3,6,11,15};
        int target=9;
        int []a1=new int[2];
        int [] k=twoSum(nums,target);
        for(int i=0;i<k.length;i++)
        {
            System.out.print(k[i]+" ");
        }
    }
//layman
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int []{i,j};
                }
            }
        }return new int[]{};
    }//another approch
    public static int[]sumtwo(int[]arr,int target)
    {
        int []nums=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    nums[0]=i;
                    nums[1]=j;
                    return nums;
                }
            }
        }return nums;
    }
    //new approch
    public static int[] twoSumnew(int[]arr,int target)
    {
        int []arr1=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                arr1[0]=i;
                arr1[1]=map.get(arr[i]);
            }else {
                map.put(target-arr[i],i);
            }
        }return arr1;
    }
    public static boolean isPalindrome(int x) {
        int remainder=0;
        int reverse=0;
        int original=x;
        while(x!=0)
        {
            remainder=x%10;
            reverse=reverse*10+remainder;
            x/=10;
        }
        if(original==reverse)
        {
            return true;
        }return false;
    }
}