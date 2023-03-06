import java.awt.geom.Path2D;
import java.io.*;
import java.util.Scanner;

public class Main {

    String buf = "";
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        Scanner s = new Scanner(System.in);
        BufferedReader br=new BufferedReader (new FileReader ("in.txt"));
        FileReader fib = new FileReader("ceva.txt");
        Main c = new Main();

//P1
//        int[] a=new int[100];
//        int i=0;
//        System.out.println("nr de elemente -> ");
//        int n = s.nextInt();
//        System.out.println("Nr. 1 -> ");
//        a[0]=s.nextInt();
//        int min=a[0];
//        for (i=1;i<n;i++)
//        {
//            System.out.println("Nr. "+ (i+1) + " -> ");
//            a[i]=s.nextInt();
//            if (min>a[i])
//            {
//                min=a[i];
//            }
//        }
//        System.out.println("Numarul minim din vector -> " + min);


//P2
//        int[] v1 = new int [100];
//        int[] v2 = new int [100];
//        int[] v3 = new int [100]; //intersectie
//        int i=0;
//        int j=0;
//        int aj=0;
//        int approved=0;
//        int counter=0; // so we know how far we go
//        System.out.println("m= ");
//        int m = s.nextInt();
//        System.out.println("n= ");
//        int n = s.nextInt();
//        for (i=0;i<m;i++)
//        {
//            System.out.println("[M] nr " +(i+1)+" -> ");
//            v1[i]= s.nextInt();
//        }
//        for (j=0;j<n;j++) {
//            System.out.println("[N] nr " + (j + 1) + " -> ");
//            v2[j] = s.nextInt();
//        }
//        for (i=0;i<m;i++)
//        {
//            for (j=0;j<n;j++)
//            {
//                if (v1[i]==v2[j])
//                {
//                    for (aj=0;aj<counter;aj++)
//                    {
//                        approved=0;
//                        if (v1[i]==v3[aj])
//                        {
//                            approved++;
//                        }
//                    }
//                    if (approved==0)
//                    {
//                        v3[counter]=v1[i];
//                        counter++;
//                    }
//                }
//            }
//        }
//        System.out.println("Intersectia: "+counter);
//        for (aj=0;aj<counter;aj++)
//        {
//            System.out.println(""+ v3[aj]);
//        }


// P3
//        int[] v1 = new int [100];
//        int[] v2 = new int [100];
//        int[] v3 = new int [100]; //Diferenta
//        int i=0;
//        int j=0;
//        int aj=0;
//        int approved=0;
//        int counter=0; // same shit as P2
//        System.out.println("m= ");
//        int m = s.nextInt();
//        System.out.println("n= ");
//        int n = s.nextInt();
//        for (i=0;i<m;i++)
//        {
//            System.out.println("[M] nr " +(i+1)+" -> ");
//            v1[i]= s.nextInt();
//        }
//        for (j=0;j<n;j++) {
//            System.out.println("[N] nr " + (j + 1) + " -> ");
//            v2[j] = s.nextInt();
//        }
//        for (i=0;i<m;i++)
//        {
//            approved=0;
//            for (j=0;j<n;j++)
//            {
//                if (v1[i]!=v2[j])
//                {
//                    approved++;
//                }
//            }
//            if (approved==j)
//            {
//                v3[counter]=v1[i];
//                counter++;
//            }
//        }
//        System.out.println("A-B: "+counter);
//        for (aj=0;aj<counter;aj++)
//        {
//            System.out.println(""+ v3[aj]);
//        }


//        P7
//        int[][] a = new int [100][100];
//        int i=0;
//        int j=0;
//        int sum=0; //suma
//        System.out.println("n= ");
//        int n = s.nextInt();
//        System.out.println("m= ");
//        int m = s.nextInt();
//        for (i=0;i<n;i++)
//        {
//            for (j=0;j<m;j++)
//            {
//                System.out.println("a["+i+"]["+j+"]-> ");
//                a[i][j] = s.nextInt();
//            }
//        }
//        i=0;
//        for (j=0;j<m;j++)
//        {
//            sum=sum+a[i][j];
//        }
//        j=m-1;
//        for (i=1;i<n;i++)
//        {
//            sum=sum+a[i][j];
//        }
//        i=n-1;
//        for (j=m-2;j>=0;j--)
//        {
//            sum=sum+a[i][j];
//        }
//        j=0;
//        for (i=n-2;i>0;i--)
//        {
//            sum=sum+a[i][j];
//        }
//        System.out.println("Suma -> "+sum);

//        P9
//        int[][] a= new int [100][100];
//        int i=0;
//        int j=0;
//        int counter=0;
//        System.out.println("n= ");
//        int n = s.nextInt();
//        System.out.println("m= ");
//        int m = s.nextInt();
//        System.out.println("X=");
//        int x = s.nextInt();
//        for (i=0;i<n;i++)
//        {
//            for (j=0;j<m;j++)
//            {
//                System.out.println("a["+i+"]["+j+"]-> ");
//                a[i][j] = s.nextInt();
//                if (a[i][j]==x)
//                {
//                    counter++;
//                }
//            }
//        }
//        System.out.println("X was found "+counter+" times");


//        P10
//        int[][] a= new int [100][100];
//        int i=0;
//        int j=0;
//        int counter_main=0;
//        int counter=0;
//        System.out.println("n= ");
//        int n = s.nextInt();
//        System.out.println("m= ");
//        int m = s.nextInt();
//        for (i=0;i<n;i++)
//        {
//            counter=0;
//            for (j=0;j<m;j++)
//            {
//                System.out.println("a["+i+"]["+j+"]-> ");
//                a[i][j] = s.nextInt();
//                if (a[i][j]==1)
//                {
//                    counter++;
//                }
//            }
//            if (counter>counter_main)
//            {
//                counter_main=counter;
//            }
//        }
//        System.out.println("Nr maxim de elemente pe linie -> "+ counter_main);


//        P20 (files heheee)

    }

    public void read_da_file(String file) {
        int c;
        FileReader f = null;
        try {
            f = new FileReader(file);
            while ((c = f.read()) != -1) {
                buf = buf + (char) c;
            }
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Reading error!");
        }
    }
    public void write_in_da_file(String file) {
        FileWriter f = null;
        try {
            f = new FileWriter(file);
            f.write(buf);
            f.close();
        }
        catch(IOException e)
        {
            System.out.println("Eroare la scriere");
        }

    }
}