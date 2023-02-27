package io.github.jihch;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JTest {

    public static final Logger LOGGER = LoggerFactory.getLogger(SLF4JTest.class);

    @Test
    public void test() {
        // 日志输出
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");

        // 使用占位符输出日志信息
        String name = "jihch";
        Integer age = 14;
        LOGGER.info("用户：{}，{}", name, age);

        // 将系统的异常信息输出
        try {
            int i = 1/0;
        } catch (Exception e) {
//            e.printStackTrace();
            LOGGER.error("出现异常：", e);
        }

    }

}
