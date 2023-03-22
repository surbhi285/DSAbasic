import java.util.Scanner;

public class SearchingAlgo {
    //driver
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.println(Linear_Search(arr,x));
    }
    //----------Linear Search-----------//
    public static int Linear_Search(int []arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }return -1;
    }
}
