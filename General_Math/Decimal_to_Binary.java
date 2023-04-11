package General_Math;

public class Decimal_to_Binary {
    public static void main(String[]args)
    {
        int n=31;
        String str="394FF";
        System.out.println(decimal_to_binary(n));
        System.out.println(binary_to_decimal(1010));
        System.out.println(decimal_to_octal(11));
        System.out.println(octal_to_decimal(13));
        System.out.println(hexa_to_decimal(str));
        System.out.println(is_prime(n));
    }
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
}
