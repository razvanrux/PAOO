import java.io.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("x: ");
        String s1 = br.readLine();
        int x=Integer.parseInt(s1);
        System.out.println("y: ");
        String s2=br.readLine();
        int y=Integer.parseInt(s2);
        if (x<0 && y<0)
        {
            System.out.println("Cadranul III");
        }
        else if (x<0 && y>0)
        {
            System.out.println("Cadranul II");
        }
        else if (x>0 && y<0)
        {
            System.out.println("Cadranul IV");
        }
        else if (x>0 && y>0)
        {
            System.out.println("Cadranul I");
        }
        else if (x==0 && y!=0)
        {
            if (y>0)
            {
                System.out.println("Situat pe axa OX intre cadranele I si II");
            }
            else if (y<0)
            {
                System.out.println("Situat pe axa OX intre cadranele III si IV");
            }
        }
        else if (y==0 && x!=0)
        {
            if (x>0)
            {
                System.out.println("Situat pe axa OY intre cadranele I si IV");
            }
            else if (x<0)
            {
                System.out.println("Situat pe axa OY intre cadranele II si III");
            }
        }
        else if (x==0 && y==0)
        {
            System.out.println("Punct situat la origine");
        }
    }
}