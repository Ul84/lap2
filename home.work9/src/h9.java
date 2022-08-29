import java.util.Scanner;

public class h9
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Input The First Number");
        int num1= scan.nextInt();

        System.out.println("Input The Second Number");
        int num2=scan.nextInt();

        int sum =num1+num2;
        System.out.println("The sum ="+sum);

        int Dif = num1-num2;
        System.out.println("The Difference ="+Dif);

        int Por =num1*num2;
        System.out.println("The Product ="+Por);

        double avg =sum/3;
        System.out.println("The Average ="+avg);

        System.out.println("The Distance1 ="+Math.abs(num1));
        System.out.println("The Distance2 ="+Math.abs(num2));

        if(num1>num2)
        {
            System.out.println("The Maximum ="+num1);
            System.out.println("The Minimum ="+num2);
        }
        else if (num1<num2)
        {
            System.out.println("The Maximum ="+num2);
            System.out.println("The Minimum ="+num1);
        }
        else
        {
            System.out.println("The Number Is Equal");
        }


    }
}
