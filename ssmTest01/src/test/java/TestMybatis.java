import com.ssmTest.demo.config.RootConfig;
import com.ssmTest.demo.config.WebConfig;
import com.ssmTest.demo.entity.User;
import com.ssmTest.demo.mapper.UserMapper;
import com.ssmTest.demo.mapper.VoyageInfoMapper;
import com.ssmTest.demo.service.impl.CrawForNingBoEDIServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {WebConfig.class, RootConfig.class})
public class TestMybatis {
    @Resource
    private CrawForNingBoEDIServiceImpl crawForNingBoEDIService;
    @Resource
    private UserMapper userMapper;
    @Resource
    private VoyageInfoMapper voyageInfoMapper;

    @Test
    public void test01() {
        crawForNingBoEDIService.crawImportOrExportInfo("591108930");
    }

    @Test
    public void test02() {

        User user = new User();
        user.setId(1);
        user.setUserName("DaSam");

        userMapper.insert(user);

        List<User> allUser = userMapper.getAllUser();
        for (User user02 : allUser) {
            System.out.println(user02.toString());
        }

    }

    @Test
    public void test03() {
        //英文船名
        String vesselname = "XINGTONGHAI";
        //航次
        String voyage = "7093S";
        crawForNingBoEDIService.crawShipWeeklyPlan(vesselname, voyage);
    }


}
