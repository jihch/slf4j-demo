package io.github.jihch;

import org.apache.log4j.Logger;
import org.junit.Test;

public class Log4jTest {

    // 定义 Log4j 日志记录器
    public static final Logger LOGGER = Logger.getLogger(Log4jTest.class);

    // 测试桥接器
    @Test
    public void test() {
        LOGGER.info("hello Log4j");
    }
}
