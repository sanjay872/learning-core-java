package Collections.set;

public class Student {
    String name;

    int rollNo;

    String department;

    public Student(String name, int rollNo, String department)
    {
        this.name = name;

        this.rollNo = rollNo;

        this.department = department;
    }

    @Override
    public int hashCode()
    {
        return rollNo;
    }

    @Override
    public boolean equals(Object obj)
    {
        Student student = (Student) obj;

        return (rollNo == student.rollNo);
    }

    @Override
    public String toString()
    {
        return rollNo+", "+name+", "+department;
    }
}
