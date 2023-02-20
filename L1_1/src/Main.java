import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("a= ");
        String s1 = br.readLine();
        int a=Integer.parseInt(s1);
        System.out.println("b= ");
        String s2=br.readLine();
        int b=Integer.parseInt(s2);
        System.out.println("c= ");
        String s3=br.readLine();
        int c=Integer.parseInt(s3);
        double p=(a+b+c)/2.0;
        double arie=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println ("Aria este -> "+arie);
    }
}