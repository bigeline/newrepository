import com.demo.test01.entity.User;
import com.demo.test01.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring_mybatis.xml"})
public class TestMybatis {
    private static Logger logger = Logger.getLogger(TestMybatis.class);
    @Resource
    private UserService userServiceImpl;
    @Test
    public void test01(){
        List<User> allUser = userServiceImpl.getAllUser();
        for(User user:allUser){
            System.out.println(user.toString());
        }
    }
}
