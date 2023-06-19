package HackerRank;

import java.util.Scanner;
/*
Sample Input
java 100
cpp 65
python 50
Sample Output
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits
java           100
cpp            065
python         050

*/
public class Java_Output_Formatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<1;i++){
            String str=sc.next();
            int x=sc.nextInt();
            String formate="";

            if(x<99){
                formate=String.format("%03d",x);
            }else{
                formate=Integer.toString(x);
            }
            str=String.format("%-15s",str);
            System.out.println(str+formate);
        }
    }
}
