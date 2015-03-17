package com.log4j.wzq;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * @Author:wangzhenqing
 * @Date:2015年03月16日15:32:18
 * @Description:只有log4j，测试类
 */
public class OnlyLog4jTest {

    public static void main(String[] args) throws Exception{
            OnlyLog4jTest onlyLog4jTest = new OnlyLog4jTest();
            onlyLog4jTest.printInfo();
    }

    public void printInfo() throws Exception {
//        BasicConfigurator.configure();
        PropertyConfigurator.configure(PropertyConfigurator.class.getResourceAsStream("/log4j.properties"));

        Logger logger = Logger.getLogger(OnlyLog4jTest.class);
        logger.debug("debugInfo");
        logger.info("info");
        logger.error("errorInfo");
        logger.fatal("fatalInfo");
        logger.warn("warnInfo");

    }


}