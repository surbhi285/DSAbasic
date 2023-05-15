package Contest_Question.Level0;

import java.util.Scanner;


public class Consecutive_Number {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.print(squareConsecutive(n));
        //System.out.print(checkNum(n));

    }
    //Given a positive integer N. The task is to find 12 + 22 + 32 + ….. + N2
    public static int squareConsecutive(int n){
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum+=i*i;
        }
        return sum;
    }
    //A number is called Silly if it can be represented as the sum of the square of consecutive natural numbers
    // starting from 1.
    //For a given number N, find the closest silly number.
    public static int checkNum(int n){
        if(n<0)
        {
            return 0;
        }
        int sum=0;
        int ans=sum;
        for(int i=0;i<n;i++)
        {
            sum+=i*i;
            if(sum>n) {
                return ans;
            }
            ans=sum;
        }return ans;
    }
    //In an 8X8 chessboard. Given the positions of the Queen as (X, Y) and the King as (P, Q) .
    //Your task is to check whether the queen can attack the king in one move or not.
    //
    //The queen is the most powerful piece in the game of chess.
    // It can move any number of squares vertically, horizontally or diagonally .
    public static int checkmate(int qR, int qC, int oR, int oC){
        if((qR==oR)||(qC==oC)||(Math.abs(qR-oR)==Math.abs(qC-oC)))
        {
            return 1;
        }
        return 0;
    }
}
