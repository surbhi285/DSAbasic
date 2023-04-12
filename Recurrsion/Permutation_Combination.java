package Recurrsion;public class Permutation_Combination {
    public static void main(String[]args)
    {
        String str="abc";
        print_permutation(str," ");
    }
    public static void print_permutation(String str,String ans)
    {
        //base case
        if(str.length()==0)
        {
            System.out.print(ans);
        }
        //faith
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String left_substring=str.substring(0,i);
            String right_substring=str.substring(i+1);
            String rest_of_String=left_substring+right_substring;
            print_permutation(rest_of_String,ans+ch);
        }
    }

    /*
        Leetcode 46
        Question: Print all permutation of [1,2,3]
        Input:[1,2,3]
        Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
     */
    // TO DO...
}
