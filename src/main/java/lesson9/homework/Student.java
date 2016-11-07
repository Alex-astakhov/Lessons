package lesson9.homework;

/**
 * Created by Alex Astakhov on 30.10.2016.
 */
public class Student extends Schoolboy {
    private String university;
    private String spec;


    public Student(String firstName, String lastName, int age, char gender, String school, String university, String spec) {
        super(firstName, lastName, age, gender, school);
        this.university = university;
        this.spec = spec;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("ВУЗ: " + university);
        System.out.println("Специальность: " + spec);
    }
}
