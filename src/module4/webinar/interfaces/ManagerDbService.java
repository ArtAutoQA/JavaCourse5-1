package module4.webinar.interfaces;

import module4.webinar.abstractclassesandmethods.DeveloperEmployee;
import module4.webinar.abstractclassesandmethods.ManagerEmployee;

public class ManagerDbService implements DBService, Test {
    ManagerEmployee[] db = new ManagerEmployee[10];

    @Override
    public void save(DeveloperEmployee employee) {

    }

    @Override
    public DeveloperEmployee get(long id) {
        return null;
    }

    @Override
    public void update(DeveloperEmployee employee) {

    }

    @Override
    public DeveloperEmployee[] getAllDevelopers() {
        return new DeveloperEmployee[0];
    }

    @Override
    public void test() {

    }
}
