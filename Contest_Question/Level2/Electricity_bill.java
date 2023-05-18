package Contest_Question.Level2;

import java.util.Scanner;

/*
Maruti is a Bill manager in the Electricity department in his municipality.

Being a newbie, he is not that good at calculation.
So as a good friend of Maruti, calculate the bill amount for given electricity unit counts.

Note:Per unit electricity rate is given below.
For the first 50 units, Rs. 0.50/unit
For the next 100 units, Rs. 0.75/unit
For the next 100 units, Rs. 1.25/unit
For units above 250, Rs. 1.50/unit
An additional surcharge of 20% is added to the bill.

You are given an integer n (count of electricity units), then return the total amount Maruti has to pay.
Print answers up to 2 decimal places.

Sample Input:
100
Sample Output:
75.00
Explanation:

Bill Amount=0.5*50+0.75*50=25+37.5=62.5
Bill after 20% additional Charge=62.5+12.50=75.00


 */
public class Electricity_bill {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int unit=sc.nextInt();
        double bill=0;
        if(unit<=50)
        {
            bill=0.50*unit;
        } else if (unit>50 && unit<=150) {
            bill=0.50*50+0.75*(unit-50);
        } else if (unit>150 && 250>=unit) {
            bill=0.50*50+0.75*100+1.25*(unit-150);
        } else if (250<unit) {
            bill=0.50*50+0.75*100+1.25*100+1.50*(unit-250);
        }
        System.out.print(bill);
    }

}
