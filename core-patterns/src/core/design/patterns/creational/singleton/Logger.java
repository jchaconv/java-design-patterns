package core.design.patterns.creational.singleton;

import java.io.Serializable;

//This is an exercise for an assignment lesson
public class Logger implements Serializable, Cloneable {

    private static volatile Logger instance;

    private Logger() {
    }

    public void log(String message) {
        System.out.println("[INFO] " + message);
    }

    public static synchronized Logger getInstance() {

        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException();
    }
}
