public class h5
{
    public static void main(String[] args)
    {
        int n1=6, n2=2,operator=0;
        System.out.println("before = "+n1+" "+n2);
        operator=n1+n2;
        n2=operator-n2;
        n1=operator-n1;

        System.out.println("after = "+n1+" "+n2);
    }
}
