package core.design.patterns.creational.singleton;


import java.io.*;

class DateUtilTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String pathName = "D:/spring-boot-projects/java-design-patterns/java-design-patterns/folder-singleton/dateUtil.ser";

        DateUtil dateUtil1 = DateUtil.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(
                        new File(pathName)));
        objectOutputStream.writeObject(dateUtil1);

        //DateUtil dateUtil2 = DateUtil.getInstance();

        DateUtil dateUtil2 = null;
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(pathName)));
        dateUtil2 = (DateUtil) objectInputStream.readObject();

        objectOutputStream.close();
        objectInputStream.close();

        //if it's true then the singleton pattern it's working
        System.out.println(dateUtil1 == dateUtil2);

    }

}