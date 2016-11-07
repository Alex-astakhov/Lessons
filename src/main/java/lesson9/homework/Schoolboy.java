package lesson9.homework;

/**
 * Created by Alex Astakhov on 30.10.2016.
 */
class Schoolboy extends Person {
    private String school;
    public Schoolboy(String firstName, String lastName, int age, char gender, String school) {
        super(firstName, lastName, age, gender);
        this.school = school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Школа: " + school);
    }
}
