package Leetcode;

public class No_of_Senior {
    public static void main(String[]args){
        String  []details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        numbers(details);
    }public static void numbers(String []details){
        for(int i=0;i<details.length;i++){
            String ele=details[i];
            String age_value=ele.substring(11,13);
            int age=Integer.parseInt(age_value);
            if(age>=60){
                System.out.println(age);
            }
           System.out.println(age_value);
        }
    }

}
