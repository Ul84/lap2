import java.util.Scanner;
public class h3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter The Width");
        float width = in.nextFloat();

        System.out.println("Enter The Height");
        float height = in.nextFloat();

        double area = (width * height);
        double perimeter = 2 *(width + height);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}


