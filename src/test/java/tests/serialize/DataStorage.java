package tests.serialize;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Asta on 10.02.2017.
 */
public class DataStorage implements Serializable {

    private static final long serialVersionUID = 1L;

    public String testName;
    public String userName;
    public int userAge;
    public Map<String, String> map = new HashMap<>();

    @Override
    public String toString() {
        return "DataStorage{" +
                "testName='" + testName + '\'' +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", map=" + map +
                '}';
    }
}
