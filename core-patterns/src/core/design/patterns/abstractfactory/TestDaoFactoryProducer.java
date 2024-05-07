package core.design.patterns.abstractfactory;

public class TestDaoFactoryProducer {

    public static void main(String[] args) {

        DaoAbstractFactory daoAbstractFactory = DaoFactoryProducer.produce("xml");
        Dao dao = daoAbstractFactory.createDao("dept");
        dao.save();
    }


}
