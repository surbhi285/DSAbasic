package Leetcode;
//Leetcode 1929
//Given an integer array nums of length n
// you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i].
//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]
//Explanation: The array ans is formed as follows:
//- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//- ans = [1,2,1,1,2,1]
public class ConcatenationArray {
    public static void main(String[]args)
    {
        int []array={1,2,1};
        int []k=concatenation(array);
        for(int i=0;i<k.length;i++)
        {
            System.out.print(k[i]+" ");
        }System.out.println();
    }
    public static int[] concatenation(int[]array)
    {
        int n=array.length;
        int []arr=new int[2*n];
        for(int i=0;i< array.length;i++)
        {
            arr[i]=array[i];
            arr[i+ array.length]=array[i];
        }
        return arr;

    }

}
