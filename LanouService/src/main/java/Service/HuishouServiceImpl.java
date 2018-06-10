package Service;/**
 * Created by pc on 2018/3/10.
 */


import Dao.HuishouDao;
import Po.FrontQuery;
import Interface.HuishouService;
import Vo.Huishou;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * describe:
 *
 * @author xxx
 * @date4 {YEAR}/03/10
 */
@Service("HuishouService")
public class HuishouServiceImpl implements HuishouService {
    @Autowired
    HuishouDao huishouDao;


    public Huishou searchbyid(String id) {
        return huishouDao.searchbyid(id);
    }


    public void add(Huishou huishou) {
        huishouDao.add(huishou);
    }


    public List<Huishou> list() {
        return huishouDao.list();
    }


    public void update(Huishou huishou) {
        huishouDao.update(huishou);
    }


    public void delete(String id) {
        huishouDao.delete(id);
    }


    public long countall() {
        return huishouDao.countall();
    }


    public List<Huishou> pagelist(int page, int pageSize) {
        return huishouDao.pagelist(new FrontQuery((page-1)*pageSize,pageSize));
    }
}
