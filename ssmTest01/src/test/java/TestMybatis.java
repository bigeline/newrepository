import com.ssmTest.demo.config.RootConfig;
import com.ssmTest.demo.entity.User;
import com.ssmTest.demo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class TestMybatis {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test01(){
        List<User> allUser = userMapper.getAllUser();
        System.out.println(allUser.size());
    }
}
