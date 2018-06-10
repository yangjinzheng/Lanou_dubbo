package Controller;/**
 * Created by pc on 2018/3/10.
 */

import Interface.AdminService;
import Vo.Admin;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * describe:
 *
 * @author xxx
 * @date4 {YEAR}/03/10
 */
@Controller
public class Login {
    @Autowired
    AdminService adminService;
    @RequestMapping(value="/login",method = {RequestMethod.POST})
    public String login(Admin admin, ModelMap map){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(admin.getName(),admin.getPassword());
        try{
            map.addAttribute("loginname",admin.getName());
            subject.login(token);
            return "main";
        }catch (Exception e){
            e.printStackTrace();
            return "redirect:/tologin";
        }

    }
    @RequestMapping("/tologin")
    public String tologin(){
        return "Login";
    }
    @RequestMapping("/main")
    public String main(){
        return "main";
    }
}
