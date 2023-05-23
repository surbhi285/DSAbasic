package Leetcode;

public class Length_of_last_word {
    public static void main(String[]args){
        String s="Hello World";
        String[] s1 = s.split(" ");
        int length= s1.length;
        String last_word=s1[length-1];
        System.out.print(last_word);
        System.out.print(last_word.length());
    }
}
