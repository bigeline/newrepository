import com.demo.test.entity.User;
import com.demo.test.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMybatis {
    private static Logger logger = Logger.getLogger(TestMybatis.class);

    @Resource
    private UserService userServiceImpl;
    @Test
    public void test01(){
        List<User> userList = userServiceImpl.getAllUser();
        System.out.println(userList.size());
        for(User user:userList){
            System.out.println(user.toString());
        }
    }
}
