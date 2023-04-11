package String;

import java.util.Arrays;

public class Basic_of_String {
    public static void main(String[] args) {
         String str1="akshaysingh";
        String str5 = "race";
        String str2 = "rotor";
        String str3="madam";
        String str4="My name is.akshay";
     //   System.out.println(check_anagram(str1, str2));
     //   System.out.println(reverse_String(str1));
     //   System.out.println(palindrome_String(str2));
     //   System.out.println(is_palindrome(str1));
     //   System.out.println(odd_char(str1));
       // System.out.println(last_word_String(str4);
        String s[]
                    = "i.like.this.program.very.much".split(".");
            String ans = "";
            for (int i = s.length - 1; i >= 0; i--) {
                ans += s[i] + " ";
            }

            System.out.println(
                    ans.substring(0, ans.length() - 1));
    }
    //Check vowels are present or not if yes print it out
    public static String check_String(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (is_vowel(ch) == true) {
                ans += ch;
            }
        }
        return ans;
    }

    public static boolean is_vowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
    //check anagram that is two string have same letters or not
    public static boolean check_anagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    //Reverse the string
    public static String reverse_String(String str)
    {
        String ans="";
        for(int i=str.length()-1;i>=0;i--)
        {
            ans+=str.charAt(i);
        }return ans;
    }
    //check string is palindrome or not
    public static boolean palindrome_String(String str1)
    {
        String str2="";
        for(int i=str1.length()-1;i>=0;i--)
        {
            str2+=str1.charAt(i);
        }
        if(str1.equals(str2))
        {
            return true;
        }return false;
    }
    //method 2
    public static boolean is_palindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            char ch1=str.charAt(i);
            char ch2=str.charAt(j);
            if(ch1==ch2)
            {
                i++;
                j--;
            }else {
                return false;
            }
        }return true;
    }
    //using StringBuilder to minimize time complexity for reverse string
    public static String reverse_String_using_String_Builder(String str)
    {
        StringBuilder ans=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--)
        {
            ans.append(i);
        }return ans.toString();
    }
    //print odd char at string
    public static String odd_char(String str)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<str.length();i+=2)
        {
            sb.append(str.charAt(i));
        }return sb.toString();
    }
    //print last word of string   {My name is akshay} output akshay
    public static String last_word_String(String str)
    {
        String[] arr=str.split("");
        return arr[arr.length-1];
    }
}
