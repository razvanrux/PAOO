import java.util.Collections;
import java.util.Vector;

public class SortedVector extends Vector{
    Vector cv = new Vector<String>();
    void addElement(Vector cv1)
    {
        this.cv.addElement(cv1); //add only one element
        System.out.println("Add element - After addition: "+cv);
        Collections.sort(cv);
        System.out.println("Add element - Sorted: "+cv);
    }
    void insertElementAt(Vector cv1, int poz)
    {
        this.cv.add(poz, cv1);
        System.out.println("Add element at specified position - Sorted: "+cv);
        Collections.sort(cv);
        System.out.println("Add element - Sorted: "+cv);
    }
}
