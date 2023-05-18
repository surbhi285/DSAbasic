package Contest_Question.Level2;

import java.util.Scanner;

/*
There are X seats in the assembly.
To form a government, an alliance should win more than (X/2)
(rounded down, for example, if there are 231 seats to win will require 231/2 = 115 seats) seats.
There are three alliances formed for the election:
   NDA => BJP + LJP
   UPA => Congress + Shiv sena
   Left => RJD + JDU + SP

   Given the number of seats won by each party,
   find out if it is possible for any alliance to form the government.
   If it is possible, then print the name of the alliance that can form the government.
Input:
13
2 1 1 0 4 3 0

Output:
Left

Explanation:
NDA => BJP + LJP = 2 + 1 => 3
UPA => Congress + Shiv sena = 1 + 0 => 1
Left => RJD + JDU + SP => 4 + 3 + 0 => 7
1 seat is won by an independent candidate.

To form a government, an alliance needs more than (13/2) = 6 seats. The left alliance has 7 seats.

 */
public class Election_Results {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int seats=sc.nextInt();
        int BJP=sc.nextInt();
        int LJP=sc.nextInt();
        int Congress=sc.nextInt();
        int Shiv_cena=sc.nextInt();
        int RJD=sc.nextInt();
        int JDU=sc.nextInt();
        int SP=sc.nextInt();
        int min_seat_win=seats/2;
        int NDA=BJP+LJP;
        int UPA=Congress+Shiv_cena;
        int Left=RJD+JDU+SP;
        if(NDA>=min_seat_win)
        {
            System.out.print("NDA");
        } else if (UPA>=min_seat_win) {
            System.out.print("UPA");
        } else if (Left>=min_seat_win) {
            System.out.print("Left");
        } else {
            System.out.print("No Govt");
        }
    }
}
