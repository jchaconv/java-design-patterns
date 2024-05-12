package core.design.patterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProblem {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        DateUtil instance1 = DateUtil.getInstance();
        DateUtil instance2 = null;

        Constructor[] declaredConstructors = DateUtil.class.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors) {
            constructor.setAccessible(true);
            try {
                instance2 = (DateUtil) constructor.newInstance();
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());


    }


}
