import java.util.Scanner;
public class h4
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        float s1, s2, s3, sum;
        double avg;
        System.out.println("Enter Three Numbers");
        s1 = input.nextFloat();
        s2 = input.nextFloat();
        s3 = input.nextFloat();
        sum = s1+ s2+ s3;
        avg =sum/3;
        System.out.println("the sum = "+sum);
        System.out.println("the avg = "+avg);
    }
}
