import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("nr. 1= ");
        String s1 = br.readLine();
        int a=Integer.parseInt(s1);
        System.out.println("nr. 2= ");
        String s2=br.readLine();
        int b=Integer.parseInt(s2);
        System.out.println("nr. 3= ");
        String s3=br.readLine();
        int c=Integer.parseInt(s3);
        int aux=0;
        if (a==b && b==c)
        {
            System.out.println("Triunghi echilateral cu laturile "+a);
        }
        else if (a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b)
        {
            if (a>=b && a>=c)
            {
                aux =a;
            }
            else if (c>=a && c>=b)
            {
                aux = c;
            }
            else if (b>=a && b>=c)
            {
                aux = b;
            }
            System.out.println("Triunghi dreptunghic cu ipotenuza "+aux);
        }
        else if (a==b || b==c || a==c)
        {
            System.out.println("Triunghi isoscel");
        }
        else
        {
            System.out.println("Triunghi oarecare");
        }
    }
}