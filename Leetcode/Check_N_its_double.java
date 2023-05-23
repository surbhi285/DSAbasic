package Leetcode;

public class Check_N_its_double {
    public static void main(String[]args){
        int []arr={-2,0,10,-19,4,6,-8};
        System.out.print(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        for (int i=0;i<arr.length;i++)
        {
            int ans=arr[i];
            for(int j=0;j<arr.length;j++)
            {
                if(ans==arr[j]*2)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
