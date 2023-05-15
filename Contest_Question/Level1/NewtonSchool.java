package Contest_Question.Level1;

import java.util.Scanner;

public class NewtonSchool {
    //Given a number N for each i (1 < = i < = N), you have to print the number except :-
    //For each multiple of 3, print "Newton" instead of the number.
    //For each multiple of 5, print "School" instead of the number.
    //For numbers that are multiples of both 3 and 5, print "NewtonSchool" instead of the number.
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printmultiple(n);
    }
    public static void printmultiple(int n)
    {
        for(int i=1;i<n;i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("NewtonSchool ");
            } else if (i % 3 == 0) {
                System.out.print("Newton ");
            } else if (i % 5 == 0) {
                System.out.print("School ");
            } else {
                System.out.print(i+" ");
            }
        }
    }
}
