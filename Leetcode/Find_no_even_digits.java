package Leetcode;

public class Find_no_even_digits {
    public static void main(String[]args){
        int []arr={12,345,6578,34521,666666};
        System.out.print(findNumbers(arr));
    }
    public static int findNumbers(int[] nums) {
        int even=0;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            int count=0;
            while(n!=0)
            {
                n=n/10;
                count++;
            }
            if(count%2==0)
        {
            even++;
        }
        }return even;
    }
}
