package cn.chiayhon.framework.support;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 集成测试基类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Profile("integration-test")
public abstract class BaseIntegrationTest {

}
