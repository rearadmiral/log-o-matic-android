package com.dephillipsdesign.logomatic;

public class LogOMatic {

    public static final LogLevel DEBUG = LogLevel.DEBUG;
    public static final LogLevel INFO = LogLevel.INFO;
    public static final LogLevel ERROR = LogLevel.ERROR;

    public static Logger getLogger(Class clazz) {
        return new DefaultLogger(clazz);
    }

}
