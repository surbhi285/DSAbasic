package Leetcode;
//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]
public class Remove_duplicate {
    public static void main(String[]args){
        int []arr={1,1,2,3,4,5,5,6};
        System.out.print(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums){
        int index=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if (nums[i] != nums[i+1]) {
                nums[index]=nums[i+1];
                index++;
            }
        }
        return index;
    }
}
