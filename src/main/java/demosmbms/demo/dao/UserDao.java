package demosmbms.demo.dao;

import demosmbms.demo.pojo.User;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * @Classname UserDao
 * @Description TODO
 * @Date 2020/7/14 10:07
 * @Created by 新
 */
@Repository
public interface UserDao {
    public List<User> findAll();
}
