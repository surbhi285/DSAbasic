package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Basic_of_ArrayList {
    public static void main(String[]args)
    {

    }
    // Function to insert element into list
    public static void insert(ArrayList<Integer> list, int x)
    {
        list.add(x);
    }

    // Function to sort list in Increasing order
    public static void IncOrder(ArrayList<Integer> list)
    {
        Collections.sort(list);
    }

    // Function to search element in the lise
    // val : element to be searched
    public static void Search(ArrayList<Integer> list, int val)
    {
        int index = list.indexOf (val);
        System.out.print(index+" ");
    }

    // Function to sort list in decreasing order
    public static void DecOrder(ArrayList<Integer> list)
    {
        Collections.sort(list, Collections.reverseOrder());
    }
    public static void freq(ArrayList<Character> list,char ch)
    {
        int a=Collections.frequency(list,ch);
        if(a!=0)
        {
            System.out.print(a);
        }else {
            System.out.print("Not present");
        }
    }
    public static int sum_of_integers(int []arr)
    {
        ArrayList<Integer> al=new ArrayList<>();
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=al.get(i);
        }return sum;
    }
}
