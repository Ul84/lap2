import java.util.Scanner;
public class h2
{
    public static void main(String[] args)
    {
        float area,perimeter,x=3.14f,r;
        Scanner in=new Scanner(System.in);

        System.out.println("Enter The Diameter");
        r=in.nextFloat();

        area=x*r*r;
        perimeter=x*r;

        System.out.println("Area="+area);
        System.out.println("Perimeter="+perimeter);
    }

};

