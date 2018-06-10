package Service;/**
 * Created by pc on 2018/3/4.
 */

import Dao.UserDao;
import Po.FrontQuery;
import Interface.UserService;
import Vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * describe:
 *
 * @author xxx
 * @date4 {YEAR}/03/04
 */
@Service("UserService")
public class UserserviceImpl implements UserService{
    @Autowired
    private UserDao userDao;


    public User searchbyid(String id) {
        return userDao.searchbyid(id);
    }

    public void add(User user) {
        userDao.add(user);
    }

    public List<User> list() {
        return userDao.list();
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delete(String id) {
        userDao.delete(id);
    }

    public List<User> pagelist(int page, int pageSize) {
        return userDao.pagelist(new FrontQuery((page-1)*pageSize,pageSize));
    }

    public long countall() {
        return userDao.countall();
    }
}
