package lesson9.homework;

/**
 * Created by Alex Astakhov on 30.10.2016.
 */
public class Footballer extends Employee {
    private double rating;

    public Footballer(String firstName, String lastName, int age, char gender, String school, String university, String spec, String company, String position, int salary, double rating) {
        super(firstName, lastName, age, gender, school, university, spec, company, position, salary);
        this.rating = rating;
    }


    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Рейтинг: " + rating);
    }
}
