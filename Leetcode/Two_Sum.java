package Leetcode;

public class Two_Sum {
    public static void main(String[]args)
    {
        int []arr=new int[]{2,7,11,15};

        int x=9;
        int y=-121;
        System.out.print(isPalindrome(y));
    }

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