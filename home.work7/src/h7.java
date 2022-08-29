import java.util.Locale;

public class h7
{
    public static void main(String[] args)
    {
        String name="Mohammed";

        System.out.println("The name is :"+name);
        System.out.println(("Upper case :")+name.toUpperCase());

        int l=name.length();
        System.out.println("length ="+l);

        char FirstC= name.charAt(0);
        System.out.println("The first char ="+FirstC);
        char LastC = name.charAt(7);
        System.out.println("The last char ="+LastC);

        String after1 = name.replace("M","");
        System.out.println("Remove The FIrst char : "+after1);

        String after2=name.replace("d","");
        System.out.println("Remove The Second : "+after2);

    }
}
