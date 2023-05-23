package Leetcode;

public class Buy_Sell {
    //Input: prices = [7,1,5,3,6,4]
    //Output: 5
    //Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    //Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

    //Input: prices = [7,6,4,3,1]
    //Output: 0
    //Explanation: In this case, no transactions are done and the max profit = 0.


    public static void main(String[]args){
        int [] input={2,4,1};
        maxProfit(input);

    }
    public static void maxProfit(int[]arr){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minindex=-1;
        int maxindex=-1;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
                minindex=i;
            }
        }
        for(int i=minindex;i< arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
        }
        System.out.println(min+" "+minindex+" "+max+" "+maxindex);
        System.out.print(max-min);
    }
}
