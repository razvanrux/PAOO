package main;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static class Complex {
        double re;
        double im;
        Complex()
        {
            re=0;
            im=0.0;
        }
        Complex(int re1, double im1)
        {
            re=re1;
            im=im1;
        }
        Complex sum (Complex nr1, Complex nr2)
        {
            this.re=nr1.re+nr2.re;
            this.im=nr1.im+nr2.im;
            if (this.im>1)
            {
                this.im--;
                this.re++;
            }
            return this;
        }
        Complex mul (Complex nr1, Complex nr2)
        {
            this.re=nr1.re*nr2 .re-nr1.im*nr2.im;
            this.im=nr1.re*nr2.im+nr1.im*nr2.re;
            return this;
        }
        Complex pow(Complex nr1, int a)
        {
            Complex nr2 = new Complex();
            nr2.re=nr1.re;
            nr2.im=nr1.im;
            while (a-1!=0)
            {
                nr1= mul(nr1, nr2);
                a--;
            }
            return this;
        }
        boolean Equals(Complex nr1, Complex nr2)
        {
            return nr1 == nr2;
        }
        static void toString(Complex nr1)
        {
            System.out.println("("+nr1.re+","+nr1.im+")");
        }
    }
    public static void main(String[] args) throws IOException
    {
        String buf="";
        InputStreamReader isr = new InputStreamReader(System.in);
        Scanner s = new Scanner(System.in);

        Complex nr1;
        Complex nr2;
        Complex nr3 = new Complex();

        System.out.println("Parte reala nr1-> ");
        int real = s.nextInt();
        System.out.println("Parte imaginara nr1-> ");
        double imaginar = s.nextDouble();
        System.out.println("Parte reala nr2-> ");
        int real2 = s.nextInt();
        System.out.println("Parte imaginara nr2-> ");

        double imaginar2 = s.nextDouble();
        nr1=new Complex(real, imaginar);
        nr2=new Complex(real2, imaginar2);
        nr3.sum(nr1, nr2);
        Complex nr4 = new Complex();
        nr4.mul(nr1, nr2);
        System.out.println("adunare: " + nr3.re+" "+nr3.im);
        System.out.println("inmultire: " + nr4.re+" "+nr4.im);

        System.out.println(nr3.pow(nr1, 2));

    }
}