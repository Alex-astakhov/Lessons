package lesson9.homework;

/**
 * Created by Alex Astakhov on 30.10.2016.
 */
public class Teacher extends Employee {
    private String subject;

    public Teacher(String firstName, String lastName, int age, char gender, String school, String university, String spec, String company, String position, int salary, String science) {
        super(firstName, lastName, age, gender, school, university, spec, company, position, salary);
        this.subject = science;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Предмет: " + subject);
    }
}
