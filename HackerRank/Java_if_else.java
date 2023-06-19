package HackerRank;

//Given an integer, n, perform the following conditional actions:
//
//If n is odd, print Weird
//If n is even and in the inclusive range of 2 to 5, print Not Weird
//If n is even and in the inclusive range of 6 to 20, print Weird
//If n is even and greater than 20, print Not Weird
//Complete the stub code provided in your editor to print whether n is weird or not.

import java.io.IOException;
import java.util.Scanner;

public class Java_if_else {
    public static void main(String[]args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0){
            System.out.println("Weird");
        }else{
            if(n<=5 && n>=2){
                System.out.println("Not Weird");
            } else if (n<=20 && n>=6) {
                System.out.println("Weird");
            }else{
                System.out.println("Not Weird");
            }
        }
    }
}
