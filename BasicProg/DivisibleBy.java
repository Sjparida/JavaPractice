package BasicProg;
// Program to check numbers divisible by 5 & 6 from 10 to 100
public class DivisibleBy {
    public static void main(String[] args)
    {
        for(int i=10;i<=100;i++)
        {
            if(i%6==0 && i%5==0)
            /*  I have used semicolon after the If statement for which it is not
            evaluating if condition and output is printing nos from 10 to 100 */
            System.out.println(i);
        }
    }
}
