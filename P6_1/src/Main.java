public class Main {
    public static void main(String[] args)
    {
        StudentClass sc = new StudentClass();
        sc.add(new Student("Gica", 19, 9));
        sc.add(new Student("Popescu", 11, 10));
        sc.add(new Student("Maria", 16, 1));
        sc.add(new Student("Marco", 14, 10));
        sc.add(new Student("Andrei", 20, 8));
        sc.add(new Student("DaFate", 12, 2));
        sc.add(new Student("Dababy", 31, 4));
        sc.add(new Student("Convertible", 300, 9));
        sc.Sort();
        sc.Print();
    }
}