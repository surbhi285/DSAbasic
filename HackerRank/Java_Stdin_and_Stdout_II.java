package HackerRank;

import java.util.Scanner;

/*Sample Input
42
3.1415
Welcome to HackerRank's Java tutorials!

Sample Output
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
*/
public class Java_Stdin_and_Stdout_II {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double d=sc.nextDouble();
        sc.nextLine();//<----This is imp
        String str=sc.nextLine();

        System.out.println("String: "+str);
        System.out.println("Double: "+d);
        System.out.println("Int: "+n);

        //Main problem cursor move to another line where it can't take string
    }
}
