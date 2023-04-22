package Leetcode;
// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it
// That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
public class smallerNum {
    public static void main(String[]args)
    {
        int []arr={8,1,2,2,3};//output={4,0,1,1,3}
        int[]ans=smallerNumberThanCurrent(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }System.out.println();
    }public static int[] smallerNumberThanCurrent(int[]arr)
    {
        int []ans=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }ans[i]=count;
        }return ans;
    }
}
