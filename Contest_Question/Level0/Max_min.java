package Contest_Question.Level0;

import java.util.Scanner;

public class Max_min {
    //You are given a positive integer A. You have to apply the following operation on it N times:
    //Let the maximum and minimum digits in the decimal representation of A be mx and mn respectively.
    //Add mx*mn to A, i. e, convert A to A + mx*mn.
    //Find the value of A after applying this operation N times.

   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        int times = sc.nextInt();
        for (int i = 1; i <= times; i++) {
            long max = 0;
            long min = 9;
            long temp = num;
            while (temp != 0) {
                long r = temp % 10;
                max = Math.max(r, max);
                min = Math.min(r, min);
                temp /= 10;
            }
            num = num + max * min;
            if (min == 0) {
                break;
            }
        }
        System.out.println(num);
    }*/
    /*
Classes at NITAP(the name of the college) are finally starting after the summer break,
and students have to reach the campus to avoid the late fine of Rs 500 for semester registration.
Mohan, Shreya, and Anuj live in the same town. They are deciding on a date to book their train ticket.
Everyone has a demand.
• Mohan wants the ticket at least on date A.
• Shreya wants the ticket at most by date B.
• Anuj wants the ticket at least on date C.
If all three of them can get the ticket on the same day, then print "YES" otherwise "NO".
*/
   /* public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(b>=a && b>=c)
            {
                System.out.print("yes");
            }else {
                System.out.print("no");
            }
        }
    }*/

    /*Mohan was so excited to visit his college NIT Arunachal Pradesh campus after COVID a
    long with his friends Shreya and Anuj. The Warden allocated the hostel room for him but
    he was curious to know about the fact that how students are getting rooms.
The warden told him that those students whose roll no is divisible by 2 will get PAPUM HOSTEL
and if it is odd then they will get "LOHIT HOSTEL".
If the student is a girl, then she will get "Upper Wing" otherwise ‘Lower Wing’.

Sample Input
2
30 B
35 G

Sample Output
PAPUM L
LOHIT U


     */
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int roll_no=sc.nextInt();
            char sex=sc.next().charAt(0);
            if(roll_no%2==0) {
                if (sex == 'B') {
                    System.out.print("PAPUM" + " " + "L");
                } else {
                    System.out.print("PAPUM"+ " "+ "U");
                }
            }else{
                if (sex == 'B') {
                    System.out.print("LOHIT" + " " + "L");
                } else {
                    System.out.print("LOHIT"+ " "+ "U");
                }
            }

        }

    }
}
