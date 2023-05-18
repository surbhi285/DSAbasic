package Contest_Question.Level1;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=n+m;
        ArrayList<Integer>arr1=new ArrayList<>();
        ArrayList<Integer>arr2=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr1.add(sc.nextInt());
        }
        for (int i=0;i<m;i++)
        {
            arr2.add(sc.nextInt());
        }
        int index=sc.nextInt();
        arr1.addAll(index,arr2);
        for(int i=0;i<c;i++)
        {
            System.out.print(arr1.get(i)+" ");
        }

    }
}
