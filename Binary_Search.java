import java.util.Scanner;

public class Binary_Search {
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
        System.out.println(binary_Search(arr,x));
    }
    public static int binary_Search(int []arr,int target)
    {
        int left=0;
        int right= arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
            {
                return mid;
            }else if(arr[mid]<target)
            {
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
    }
}
