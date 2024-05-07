package core.design.patterns.abstractfactory;

public class DBDaoFactory extends DaoAbstractFactory {

    @Override
    public Dao createDao(String type) {
        Dao dao = null;
        if(type.equalsIgnoreCase("emp")) {
            dao = new DbEmpDao();
        } else if(type.equalsIgnoreCase("dept")) {
            dao = new DbDeptDao();
        }

        return dao;
    }
}
