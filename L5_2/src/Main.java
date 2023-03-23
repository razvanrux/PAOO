import java.util.Vector;

public class Main {
    public static void main(String[] args)
    {
        SortedVector unu = new SortedVector();
        Vector ceva = new Vector<String>();
        Vector ceva1 = new Vector<String>();
        Vector ceva2 = new Vector<String>();
        Vector ceva3 = new Vector<String>();
        ceva.add(10);
        ceva1.add(5);
        ceva2.add(75);
        ceva3.add(175);
        unu.addElement(ceva);
        unu.addElement(ceva1);
        unu.addElement(ceva2);
        unu.insertElementAt(ceva3, 2);
    }
}