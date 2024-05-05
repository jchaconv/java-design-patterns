package core.design.patterns.singleton;

import java.io.Serializable;

//To make this a Singleton class follow the 3 steps
public class DateUtil implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    //LAZY initialization is preferred
    private static volatile DateUtil instance;

    //EAGER initialization
    //first option
    //private static DateUtil instance = new DateUtil();

    //second option with static block
    /*static {
        instance = new DateUtil();
    }*/

    private DateUtil() {

    }

    public static synchronized DateUtil getInstance() {

        if(instance == null) {
            synchronized (DateUtil.class) {
                if(instance == null) {
                    instance = new DateUtil();
                }
            }
        }
        /*if(instance == null) {
            instance = new DateUtil();
        }*/
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        return new CloneNotSupportedException();
    }

}
