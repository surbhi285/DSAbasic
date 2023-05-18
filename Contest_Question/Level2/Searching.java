package Contest_Question.Level2;

import java.util.Scanner;

public class Searching {
    /*Given a sorted array arr[] of N integers and a number K is given.
    The task is to check if the element K is present in the array or not.
2
5 6
1 2 3 4 6
5 2
1 3 4 5 6

Sample Output:
1
-1
     */


    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int k = sc.nextInt();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print(binarySearch(arr,k));
        }
    }
    public static int binarySearch(int []arr,int k)
    {
        int left=0;
        int right=arr.length;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==k)
            {
                return 1;
            } else if (arr[mid]>k) {
                right=mid-1;
            }else {
                left=mid+1;
            }

        }return -1;
    }

    }