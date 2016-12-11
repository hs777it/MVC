package model;

/**
 * Created by hossam on 12/9/16.
 */
public class UserDetails {

    private String name;

    private String age;

    public UserDetails(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public UserDetails() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
