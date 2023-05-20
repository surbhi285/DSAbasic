package Leetcode;

import java.util.Scanner;

public class max_consecutive_one {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       // int n=sc.nextInt();
        int []arr={1,1,1,0,0,0,1,1,1,0,0,1,1};
        System.out.print(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int flag=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
            {
                count++;
                if(count>flag)
                {
                    flag=count;
                }
            }else {
                count=0;
            }
        }return flag;
    }
}
