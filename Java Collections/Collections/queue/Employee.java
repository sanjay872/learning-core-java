package Collections.queue;

public class Employee {
    String name;

    int salary;

    //Constructor Of Employee

    public Employee(String name, int salary)
    {
        this.name = name;

        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return name+" : "+salary;
    }
}
