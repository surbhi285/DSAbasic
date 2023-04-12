package General_Math;

import java.util.ArrayList;

public class Decimal_to_Binary {
    public static void main(String[]args)
    {
        int n=31;
        int num=25;
        String str="394FF";
       /* System.out.println(decimal_to_binary(n));
        System.out.println(binary_to_decimal(1010));
        System.out.println(decimal_to_octal(11));
        System.out.println(octal_to_decimal(13));
        System.out.println(hexa_to_decimal(str));
       */ // System.out.println(is_prime(n));
        sieve_of_eratosthenes(num);
    }
    //Given a decimal number change to binary
    public static String decimal_to_binary(int num)
    {
        StringBuilder sb=new StringBuilder();
        while (num>0)
        {
            int remainder=num%2;
            num/=2;
            sb.append(remainder);
        }
        return sb.reverse().toString();
    }
    //Given to binary number change to decimal number
    public static int binary_to_decimal(int num)
    {
        int decimal_num=0;
        int power=0;
        while(num>0)
        {
            int remainder=num%10;
            num/=10;
            decimal_num+=Math.pow(2,power)*remainder;
            power++;
        }return decimal_num;
    }
    //Given a decimal number change to octal number
    public static String decimal_to_octal(int num)
    {
        StringBuilder sb=new StringBuilder();
        while(num>0)
        {
            int remainder=num%8;
            num/=8;
            sb.append(remainder);
        }return sb.reverse().toString();
    }
    //Given a octal number change to decimal number
    public static int octal_to_decimal(int num)
    {
        int power=0;
        int octal_num=0;
        while(num>0)
        {
            int remainder=num%10;
            num/=10;
            octal_num+=Math.pow(8,power)*remainder;
            power++;
        }return octal_num;
    }
    //Given a hexa number change to decimal number
    public static int hexa_to_decimal(String str)
    {
        int ans=0;
        int power=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            if(ch>='0'&&ch<='9')
            {
                int num=ch-'0';
                ans+=num*Math.pow(16,power);
                power++;
            } else if (ch >= 'A' && ch <= 'F') {
                int num=ch-'A'+10;
                ans+=Math.pow(16,power)*num;
                power++;
            }
        }return ans;
    }
    //check given number is prime or not
    public static boolean is_prime(int num)
    {
        for(int i=2;i*i<num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }return true;
    }
    //Find the smallest prime divisible
    public static int smallest_prime_div(int num)
    {
        for(int i=2;i*i<num;i++)
        {
            if(i%num==0)
            {
                return i;
            }
        }return num;
    }
    //print all the primes who is divisible by number by sieve of eratosthenes method
    public static ArrayList<Integer> sieve_of_eratosthenes(int num)
    {
        ArrayList<Integer>prime_no=new ArrayList<>();
        boolean [] arr=new boolean[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=true;
        }
        arr[0]=arr[1]=false;
        for(int i=2;i*i<=num;i++)
        {
            if(arr[i]==true)
            {
                for(int j=i+1;j<=num-1;j++)
                {
                    if(j%i==0)
                    {
                        arr[j]=false;
                    }
                }
            }
        }
        print_array(arr);
        return prime_no;
    }
    //TC=0(nlog(logn))
    public static void print_array(boolean []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }System.out.println();
    }

}
