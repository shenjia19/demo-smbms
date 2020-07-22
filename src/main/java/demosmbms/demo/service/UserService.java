package demosmbms.demo.service;

import demosmbms.demo.dao.UserDao;
import demosmbms.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2020/7/14 10:08
 * @Created by 新
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public List<User> findAll(){
        return userDao.findAll();
    }
}
