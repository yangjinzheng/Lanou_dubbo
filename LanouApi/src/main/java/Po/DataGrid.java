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
public class DataGrid implements Serializable {
    private Long total = 0L;
    private Object rows ;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Object getRows() {
        return rows;
    }

    public void setRows(Object rows) {
        this.rows = rows;
    }
}
