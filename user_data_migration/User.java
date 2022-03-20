package user_data_migration;

import java.io.Serializable;

public class User implements Serializable {
    static String country = "INDIA";
    private String name;
    private String email;
    private transient String password;

    public User() {
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        User.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "email=" + email + ", name=" + name + ", password=" + password + ", country="+User.country;
    }
}
