package Contest_Question;
/*
You are asked Q questions. For each question,
you have to determine whether the given number X
can be represented as a sum of two or more consecutive positive integers.
 */

import java.util.Scanner;

public class IsConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int x = sc.nextInt();
            System.out.println(check(x));
        }
    }

    public static boolean check(int x) {
        if ((x & (x - 1)) != 0 && x != 0) {
            return true;
        }
        return false;
    }

/*In an exam of JEE one aspirant got P correct answers, Q wrong answer, and R unattempted question.
If the mark for the correct answer is 4, for the wrong answer is -2, and for the unattempted questions is -1.
 Find the final marks the aspirant got.
 */
    public static int marks(int P,int Q,int R)
    {
        int final_marks=P*4-Q*2-R*1;
        return final_marks;
    }

}