package lesson9.homework;

/**
 * Created by Alex Astakhov on 30.10.2016.
 */
public class Employee extends Student {
    private String company;
    private String position;
    private int salary;

    public Employee(String firstName, String lastName, int age, char gender, String school, String university, String spec, String company, String position, int salary) {
        super(firstName, lastName, age, gender, school, university, spec);
        this.company = company;
        this.position = position;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
