package BitWise_Manipulation;

public class Basic_operation_Bit {
    public static void main(String[] args) {
        //if Most significant bit is 1 then the no is minus
        //Set bit is 1
        //Left Shift operator
        int x = 43;
        System.out.println(x << 1);//ans=86
        System.out.println(x << 2);//ans=172
        System.out.println(x << 3);//ans=344

        //Right Shift operator
        int y = 100;
        System.out.println(y >> 1);//ans=50
        System.out.println(y >> 2);//ans=25
        System.out.println(y >> 3);//ans=12

        //1's complement
        int complement = 44;
        System.out.println(~complement);//ans=-45

        //2's complement

        System.out.println(~complement + 1);

        System.out.println("-------------------------------------------------------");
        //Make sure fourth bit is always SET
        int num = 165;
        int pos = 4;
        int n=2696;
        System.out.println(compulsory_setBit(num, pos));
        System.out.println(compulsory_unsetBit(num,pos));
        System.out.println(compulsory_changeBit(num,pos));
        System.out.println(right_most_significant_bit(n));
        System.out.println(pos^pos);
        System.out.println(count_set_bit(n));
    }
    //Make sure fourth bit is always SET
    public static int compulsory_setBit(int num, int position) {
        int mask = 1 << position;
        return mask|num;
    }
    //Make sure four bit is always UNSET
    public static int compulsory_unsetBit(int num,int position)
    {
        int mask=1<<position;
        mask=~mask;
        return mask&num;
    }
    //Make sure four bit is always change (SET --> UNSET) and (UNSET ---> SET)
    public static  int compulsory_changeBit(int num,int pos)
    {
        int mask=1<<pos;
        return mask^num;
    }
    //find right most set bit
    //00101100 ans-->00101(1)00
    public static int right_most_significant_bit(int num)
    {
        int one_complement=~num;
        int two_complement=one_complement+1;
        return num&two_complement;
    }
    //count the setBit
    public static int count_set_bit(int num)
    {
        int count=0;
        while(num!=0)
        {
            int rightMSB=right_most_significant_bit(num);
            if(rightMSB!=0)
            {
                count++;
            }
            num-=rightMSB;
        }return count;
    }
}
