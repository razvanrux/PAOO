import java.util.Vector;

public class Main {
    public static void main(String[] args)
    {
        SetAsVector unu = new SetAsVector();
        Vector ceva = new Vector<String>();
        ceva.add(3);
        ceva.add(4);
        ceva.add(5);
        ceva.add(6);
        unu.add(ceva);
        unu.toString(); //adaugare
        unu.remove(ceva);
        unu.toString(); // eliminare un element
        Vector ceva1 = new Vector<String>();
        ceva1.add(5);
        if (unu.contains(ceva1)==true)
        {
            System.out.println("Found!");
        }
        else
        {
            System.out.println("Not found!");
        }

    }
}