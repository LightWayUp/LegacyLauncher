package net.minecraft.launchwrapper;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class LogWrapper {
    public static LogWrapper log = new LogWrapper();
    private Logger myLog;

    private static boolean configured;

    private static void configureLogging() {
        log.myLog = LogManager.getLogger("LaunchWrapper");
        configured = true;
    }

    public static void retarget(Logger to) {
        log.myLog = to;
    }

    public static void retarget(java.util.logging.Logger to) {
        log.myLog = LogManager.getLogger();
        to.addHandler(new Log4JHandler(log.myLog));
    }

    public static void log(String logChannel, Level level, String format, Object... data) {
        makeLog(logChannel);
        LogManager.getLogger(logChannel).log(level, String.format(format, data));
    }

    public static void log(Level level, String format, Object... data) {
        if (!configured) {
            configureLogging();
        }
        log.myLog.log(level, String.format(format, data));
    }

    public static void log(String logChannel, Level level, Throwable ex, String format, Object... data) {
        makeLog(logChannel);
        LogManager.getLogger(logChannel).log(level, String.format(format, data), ex);
    }

    public static void log(Level level, Throwable ex, String format, Object... data) {
        if (!configured) {
            configureLogging();
        }
        log.myLog.log(level, String.format(format, data), ex);
    }

    public static void severe(String format, Object... data) {
        log(Level.ERROR, format, data);
    }

    public static void warning(String format, Object... data) {
        log(Level.WARN, format, data);
    }

    public static void info(String format, Object... data) {
        log(Level.INFO, format, data);
    }

    public static void fine(String format, Object... data) {
        log(Level.DEBUG, format, data);
    }

    public static void finer(String format, Object... data) {
        log(Level.TRACE, format, data);
    }

    public static void finest(String format, Object... data) {
        log(Level.TRACE, format, data);
    }

    public static void makeLog(String logChannel) {
        LogManager.getLogger(logChannel);
    }

    private static class Log4JHandler extends Handler {
        private Logger logger;

        public Log4JHandler(Logger logger){
            this.logger = logger;
        }

        @Override
        public void close() throws SecurityException {
        }

        @Override
        public void flush() {
        }

        @Override
        public void publish(LogRecord lr) {
            Level l = toLog4j(lr.getLevel());
            logger.log(l, lr.getMessage());
        }

        private Level toLog4j(java.util.logging.Level level) { //converts levels
            if (java.util.logging.Level.SEVERE == level) {
                return Level.ERROR;
            } else if (java.util.logging.Level.WARNING == level) {
                return Level.WARN;
            } else if (java.util.logging.Level.INFO == level) {
                return Level.INFO;
            } else if (java.util.logging.Level.OFF == level) {
                return Level.OFF;
            }
            return Level.OFF;
        }
    }
}
