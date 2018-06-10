package Controller;/**
 * Created by pc on 2018/3/10.
 */

import Po.DataGrid;
import Interface.UserService;
import Vo.User;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * describe:
 *
 * @author xxx
 * @date4 {YEAR}/03/10
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/toUserList")
    public String toul(){
        return "UserList";
    }
    @RequestMapping(value="/UserList",produces = {"text/json;charset=UTF-8"})
    @ResponseBody
    public String UserList(int page, int rows){
        DataGrid dataGrid = new DataGrid();
        dataGrid.setTotal(userService.countall());
        dataGrid.setRows(userService.pagelist(page,rows));
        return JSON.toJSONString(dataGrid);
    }

    @RequestMapping(value = "/UserDelete",method = {RequestMethod.POST},produces = {"text/json;charset=UTF-8"})
    @ResponseBody
    public String delete(String id){
        userService.delete(id);
        return JSON.toJSONString("删除成功！！");
    }

    @RequestMapping(value = "/UserUpdate",method = {RequestMethod.POST},produces = {"text/json;charset=UTF-8"})
    public String update(User user){
        userService.update(user);
        return JSON.toJSONString("更新成功");
    }
}
