package cn.chiayhon.framework.support;

import org.junit.runner.RunWith;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 单元测试基类
 */
@RunWith(SpringRunner.class)
@Profile("unit-test")
public abstract class BaseUnitTest {
}
