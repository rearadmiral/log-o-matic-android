package com.dephillipsdesign.logomatic;

import android.util.Log;

/**
 * For internal use only.  Use LogOMatic.getLogger(Class) to get a usable logger.
 */
class DefaultLogger implements Logger {

    private final String namespace;

    DefaultLogger(Class clazz) {
        namespace = clazz.getCanonicalName();
    }

    @Override
    public void log(LogLevel level, String msg) {
        switch(level) {
            case DEBUG:
                debug(msg);
                break;
            case INFO:
                info(msg);
                break;
            case ERROR:
                error(msg);
                break;
        }
    }
    public void logf(LogLevel level, String msg, Object... args) {
        final String formattedMsg = String.format(msg, args);
        log(level, formattedMsg);
    }

    public void debugf(String msg, Object... args) {
        logf(LogLevel.DEBUG, msg, args);
    }

    @Override
    public void infof(String msg, Object... args) {
        logf(LogLevel.INFO, msg, args);
    }

    @Override
    public void errorf(String msg, Object... args) {
        logf(LogLevel.ERROR, msg, args);
    }

    public void debug(String msg) {
        Log.d(namespace, msg);
    }

    public void info(String msg) {
        Log.i(namespace, msg);
    }

    public void error(String msg) {
        Log.e(namespace, msg);
    }

    public void error(String msg, Throwable t) {
        Log.e(namespace, msg, t);
    }
}
