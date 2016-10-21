package lesson6;

/**
 * Created by Alex Astakhov on 17.10.2016.
 */
public class User {
    public String name;
    public int age;
    public String city;
    public char gender;
    public static String type = "human";

    @Override
    public String toString(){
        return name + " " + age + " " + city + " " + gender + " " + type;
    }

    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        user1.name = "Masha";
        user1.age = 21;
        user1.gender = 'w';
        user2.name = "JACK";
        user2.city = "New York";
        user2.gender = 'm';

        System.out.println(user1.name + " " + user1.age);
        System.out.println(user2.name + " " + user2.city);
        System.out.println(user1 + ", " + user2);

        user1.type = "animal";
        System.out.println(user1 + ", " + user2);
        User.type = "human";
        System.out.println(user1 + ", " + user2);
    }
}
