package Service;/**
 * Created by pc on 2018/3/23.
 */

import Dao.FinishDao;
import Po.FrontQuery;
import Interface.FinishService;
import Vo.Finish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * describe:
 *
 * @author xxx
 * @date4 {YEAR}/03/23
 */
@Service("FinishService")
public class FinishServiceImpl implements FinishService {
    @Autowired
    FinishDao finishDao;

    public void add(Finish finish) {
        finishDao.add(finish);
    }


    public List<Finish> list() {
        return finishDao.list();
    }


    public void update(Finish finish) {
        finishDao.update(finish);
    }


    public List<Finish> listbyhsid(String huishouid) {
        return finishDao.listbyhsid(huishouid);
    }


    public int countbyhs(String huishouid) {
        return finishDao.countbyhs(huishouid);
    }


    public long countall() {
        return finishDao.countall();
    }


    public List<Finish> pagelist(int page, int pageSize) {
        return finishDao.pagelist(new FrontQuery((page-1)*pageSize,pageSize));
    }
}
