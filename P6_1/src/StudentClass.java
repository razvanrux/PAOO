import java.util.Arrays;

public class StudentClass {
    private Student[] students;
    private int n;
    private final int N=10;
    public StudentClass() {
        n = 0;
        students = new Student[N];
    }
    public StudentClass(int n)
    {
        this.n=n;
        students = new Student[N];
    }
    public void add(Student s) {
        if (students == null) {
            students = new Student[N];
        }
        students[n] = s;
        n++;
    }
    public void Print() {
        for (int i = 0; i < n; i++) {
            if (students[i].grade > 5) {
                System.out.println(students[i].name);
            }
        }
    }
    public void Sort()
    {
        Arrays.sort(students);
    }
    public int Getn()
    {
        return n;
    }
}
