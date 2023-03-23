import java.util.Vector;

public class SetAsVector extends Vector {
    Vector cv = new Vector<String>();
    boolean add(Vector cv) //it will add all the elements (if there are more than one)
    {
        this.cv.addAll(cv);
        if (this.cv.size()>this.cv.capacity())
        {
            return false;
        }
        return true;
    }
    boolean remove(Vector cv) //only for the first element
    {
        if (this.cv.isEmpty())
        {
            return false;
        }
        this.cv.remove((Integer)cv.firstElement());
        return true;
    }
    boolean contains(Vector cv) //only for the first element
    {
        if (this.cv.lastIndexOf(cv)==-1)
        {
            return false;
        }
        return true;
    }
   public String toString() {
        System.out.println("Vector is: "+this.cv);
        return String.valueOf(0);
    }
}
