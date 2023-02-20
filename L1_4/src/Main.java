import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Ora= ");
        String s1 = br.readLine();
        int O1=Integer.parseInt(s1);
        System.out.println("Minute=");
        String s2=br.readLine();
        int M1=Integer.parseInt(s2);
        System.out.println("Secunde= ");
        String s3=br.readLine();
        int S1=Integer.parseInt(s3);
        System.out.println("-Inchidere- ");

        System.out.println("Ora= ");
        String s4 = br.readLine();
        int O2=Integer.parseInt(s1);
        System.out.println("Minute=");
        String s5=br.readLine();
        int M2=Integer.parseInt(s2);
        System.out.println("Secunde= ");
        String s6=br.readLine();
        int S2=Integer.parseInt(s3);
    }
}