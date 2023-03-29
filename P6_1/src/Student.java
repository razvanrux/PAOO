class Student implements Comparable<Student> {
    protected String name;
    protected int age;
    protected int grade;
    public Student() {
        this.name = "";
        this.age = 0;
        this.grade = 0;
    }
    public Student (String name, int age, int grade)
    {
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
    public Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.grade = s.grade;
    }
    public String GetName()
    {
        return name;
    }
    public int GetAge()
    {
        return age;
    }
    public int GetGrade()
    {
        return grade;
    }
    @Override
    public int compareTo(Student o) {
        return grade-o.grade;
    }
    @Override
    public Student clone(){
        Student s = new Student();
        return s;
    }
    @Override
    public String toString()
    {
        return String.valueOf(0);
    }
}
