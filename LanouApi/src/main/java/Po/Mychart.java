package Po;/**
 * Created by pc on 2018/3/28.
 */

import java.io.Serializable;

/**
 * describe:
 *
 * @author xxx
 * @date4 {YEAR}/03/28
 */
public class Mychart implements Serializable {
private String name;
private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
