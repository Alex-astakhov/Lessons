package lesson19.homework.models;

/**
 * Created by Alex Astakhov on 05.01.2017.
 */
public class CookiesModel {

    public class Cookies{
        String jack;

        public Cookies(String jack) {
            this.jack = jack;
        }
    }

    public Cookies cookies;

    public CookiesModel(String value) {
        this.cookies = new Cookies(value);
    }
}
