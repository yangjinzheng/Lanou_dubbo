package Vo;/**
 * Created by pc on 2018/3/16.
 */

import java.io.Serializable;

/**
 * describe:
 *
 * @author xxx
 * @date4 {YEAR}/03/16
 */
public class Admin implements Serializable {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
