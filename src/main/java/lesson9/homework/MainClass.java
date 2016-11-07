package lesson9.homework;

/**
 * Created by Alex Astakhov on 30.10.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        Person person = new Person("Василий", "Громов", 25, 'м');
        Schoolboy schoolboy = new Schoolboy("Федор", "Бондарчук", 12, 'м', "Средняя школа №52");
        Student student = new Student("Марина", "Соколова", 21, 'ж', "Лицей №13", "КПИ", "ФИОТ");
        Employee employee = new Employee("Полина", "Кузнецова", 29, 'ж', "Школа №2", "МХАТ", "режессерский", "Мосфильм", "хлопушка", 600);
        Footballer footballer = new Footballer("Олег", "Скляр", 26, 'м', "ДЮСШ №1", "Физкультурный", "футбольный", "Динамо-2", "вратарь", 10000, 0.7);
        Teacher teacher = new Teacher("Вадим", "Ковтун", 43, 'м', "Гимназия №299", "Драгоманова", "математический", "КПИ", "доцент", 1000, "прикладная математика");

        person.getInfo();
        System.out.println("------------------------");
        schoolboy.getInfo();
        System.out.println("------------------------");
        student.getInfo();
        System.out.println("------------------------");
        employee.getInfo();
        System.out.println("------------------------");
        footballer.getInfo();
        System.out.println("------------------------");
        teacher.getInfo();
        System.out.println("------------------------");
    }
}
