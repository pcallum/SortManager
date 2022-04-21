package com.sparta.sortmanager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogDriver {
    public static Logger logger = LogManager.getLogger("Logger");

    public static void main(String[] args) {
        logger.warn("This is an info message");
    }
}
