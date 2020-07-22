package demosmbms.demo.controller;

import demosmbms.demo.pojo.User;
import demosmbms.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname UserServlet
 * @Description TODO
 * @Date 2020/7/14 10:09
 * @Created by 新
 */
@RestController
@RequestMapping("/index")
public class UserServlet {
    @Autowired
    UserService userService;
    @GetMapping("/findAll")
    public List<User> findAll(HttpServletRequest request, HttpServletResponse response){

        return userService.findAll();
    }
}
